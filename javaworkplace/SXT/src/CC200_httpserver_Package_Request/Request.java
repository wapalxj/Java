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
 * ��װRequest:
 * GET��POSTͷ��Ϣ
 */
public class Request {
	//1.����ʽ
	private String method;
	//2.������Դ
	private String url;
	//3.�������:һ��key--���value����ʽ
	private Map<String, List<String>> paramMapValues;

	//�ڲ�
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
		//����ͷ��Ϣ
		parseRequestInfo();
	}
	private void parseRequestInfo() {
		if (requestInfo==null||(requestInfo=requestInfo.trim()).equals("")) {
			return;
		}
		/*
		 * ========================
		 * ����Ϣ�����зֽ��������ʽmethod������·��url���������paraString(get���ܴ����������)��
		 * 	GET /?username=%601111111111&pwd=11111111 HTTP/1.1
		 * 	POST��ʽ���������������
		 * =========================
		 */
		String paramString="";//�����������
		
		//1.��ȡ����ʽ(�����н���)������·��url�Լ��������
		String firstLine=requestInfo.substring(0, requestInfo.indexOf(CRLF));
		int idx=requestInfo.indexOf("/");
		this.method=firstLine.substring(0, idx).trim();
		String urlstr=firstLine.substring(idx, firstLine.indexOf("HTTP/")).trim();
		if (this.method.equalsIgnoreCase("post")) {
			this.url=urlstr;
			//������POST�Ĳ��������һ����������
			paramString=requestInfo.substring(requestInfo.lastIndexOf(CRLF));
		}else if(this.method.equalsIgnoreCase("get")){
			if (urlstr.contains("?")) {//�Ƿ���ڲ���
				String[] urlArray=urlstr.split("\\?");//�ָ����ǰ��ļ���url
				this.url=urlArray[0];
				paramString=urlArray[1];//�ָ������
			}else{
				this.url=urlstr;
			}
		}
		
		//2.�����������װ��MAP��
		
		if (paramString.equals("")) {//�������������
			return;
		}
		parseParam(paramString);
		
	}
	public void  parseParam(String paramString) {
		//1.�ָ� ���ַ���ת������//Ҳ������split
		StringTokenizer token=new StringTokenizer(paramString,"&");
		while (token.hasMoreTokens()) {
			String keyValue=token.nextToken();
			String []keyValues=keyValue.split("=");
			if (keyValues.length==1) {//ֵ�����ڣ�����name=&...,������name=null&
				keyValues=Arrays.copyOf(keyValues,2);
				keyValues[1]=null;
			}
			//ת��MAP
			String key=keyValues[0].trim();
				//�������
			String value=(null==keyValues[1])?null:decoder(keyValues[1].trim(),"GBK");
			if (!paramMapValues.containsKey(key)) {
				paramMapValues.put(key, new ArrayList<String>());
				
			}
			List<String> values =paramMapValues.get(key);
			values.add(value);
		}
	}
	/*
	 * ����:�����������
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
	 * ����ҳ���name ��ȡ��Ӧ�Ķ��ֵ
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
	 * ����ҳ���name ��ȡ��Ӧ�ĵ���ֵ
	 */
	public String getParamet(String name) {
		 String[] values=getParametValues(name);
		 if (values==null) {
			return null;
		}
		 return values[0];
	}
	
	//�����ⲿ��ȡURL
	public String getUrl() {
		return url;
	}	
	
}
