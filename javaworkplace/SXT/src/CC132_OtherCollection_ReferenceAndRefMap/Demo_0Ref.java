package CC132_OtherCollection_ReferenceAndRefMap;

import java.lang.ref.WeakReference;

/*
 *强与弱引用
 */
public class Demo_0Ref {

	public static void main(String[] args) {
		//字符串常量值（不能回收）
//		String str ="vero";
		//字符串对象（能回收）
		String str =new String("vero");
		//弱引用管理对象
		WeakReference<String>  wr=new WeakReference<String>(str);
		
		System.out.println("gc运行前:"+wr.get());
		//断开引用
		str=null;
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后:"+wr.get());
	}

}
