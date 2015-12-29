package CC200_httpserver_Package_Request;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


/*
 * 封装Request:
 * GET个POST头信息
 */
public class Request {
	//1.请求方式
	private String method;
	//2.请求资源
	private String url;
	//3.请求参数:一个key--多个value的形式
	private Map<String, List<String>> paramMapValues;

	//内部
	public static final String CRLF="\r\n";
	protected InputStream is;
	private String requestInfo;
	
	public Request() {
		method="";
		url="";
		paramMapValues=new HashMap<String, List<String>>();
		requestInfo="";
	}
	public Request(InputStream is)  {
		this();
		this.is=is;
		try {
			byte []data=new byte[20480];
			int len;
			len = is.read(data);
			requestInfo=new String(data,0,len);
		} catch (IOException e) {
			return;
		}
		//分析头信息
		parseRequestInfo();
	}
	private void parseRequestInfo() {
		if (requestInfo==null||(requestInfo=requestInfo.trim()).equals("")) {
			return;
		}
		/*
		 * ========================
		 * 从信息的首行分解出：请求方式method，请求路径url，请求参数paraString(get可能存在请求参数)，
		 * 	GET /?username=%601111111111&pwd=11111111 HTTP/1.1
		 * 	POST方式，参数可能在最后
		 * =========================
		 */
		String paramString="";//接收请求参数
		
		//1.获取请求方式(到换行结束)和请求路径url以及请求参数
		String firstLine=requestInfo.substring(0, requestInfo.indexOf(CRLF));
		int idx=requestInfo.indexOf("/");
		this.method=firstLine.substring(0, idx).trim();
		String urlstr=firstLine.substring(idx, firstLine.indexOf("HTTP/")).trim();
		if (this.method.equalsIgnoreCase("post")) {
			this.url=urlstr;
			//参数：POST的参数在最后一个换行下面
			paramString=requestInfo.substring(requestInfo.lastIndexOf(CRLF));
		}else if(this.method.equalsIgnoreCase("get")){
			if (urlstr.contains("?")) {//是否存在参数
				String[] urlArray=urlstr.split("\\?");//分割出？前面的即是url
				this.url=urlArray[0];
				paramString=urlArray[1];//分割出参数
			}else{
				this.url=urlstr;
			}
		}
		
		//2.将请求参数封装到MAP中
		
		if (paramString.equals("")) {//不存在请求参数
			return;
		}
		parseParam(paramString);
		
	}
	public void  parseParam(String paramString) {
		//1.分割 将字符串转成数组//也可以用split
		StringTokenizer token=new StringTokenizer(paramString,"&");
		while (token.hasMoreTokens()) {
			String keyValue=token.nextToken();
			String []keyValues=keyValue.split("=");
			if (keyValues.length==1) {//值不存在，比如name=&...,则设置name=null&
				keyValues=Arrays.copyOf(keyValues,2);
				keyValues[1]=null;
			}
			//转成MAP
			String key=keyValues[0].trim();
				//这里解码
			String value=(null==keyValues[1])?null:decoder(keyValues[1].trim(),"GBK");
			if (!paramMapValues.containsKey(key)) {
				paramMapValues.put(key, new ArrayList<String>());
				
			}
			List<String> values =paramMapValues.get(key);
			values.add(value);
		}
	}
	/*
	 * 解码:解决中文乱码
	 */
	private String decoder(String value,String code) {
		try {
			return java.net.URLDecoder.decode(value,code);
		} catch (UnsupportedEncodingException e) {
			return null;
//			e.printStackTrace();
		}
	}
	/*
	 * 根据页面的name 获取对应的多个值
	 */
	public String[] getParametValues(String name) {
		List<String> values=null;
		if((values=paramMapValues.get(name))==null){
			return null;
		}else {
			return values.toArray(new String[0]);
		}
	}
	/*
	 * 根据页面的name 获取对应的单个值
	 */
	public String getParamet(String name) {
		 String[] values=getParametValues(name);
		 if (values==null) {
			return null;
		}
		 return values[0];
	}
	
	//方便外部获取URL
	public String getUrl() {
		return url;
	}	
	
}
