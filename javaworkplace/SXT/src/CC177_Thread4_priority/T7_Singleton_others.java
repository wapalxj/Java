package CC177_Thread4_priority;
/*
 * 单例模式的其他写法
 * 1.懒汉式
 * 2.饿汉式
 */
public class T7_Singleton_others {

	public static void main(String[] args) {
		
	}

}
//1.懒汉式
class MyJvm{
	private static MyJvm instance=null;
		
		private MyJvm(){
			
		}
		public static  MyJvm single(){
			//2个if，双重检查，提高效率
			if (instance==null) {//这一行提高效率
				synchronized(MyJvm.class){
					if (instance==null) {//单例
						instance=new MyJvm();
					}					
				}
			}
			return instance;
		}
}

//2.饿汉式
class MyJvm2{
	private static MyJvm2 instance=new MyJvm2();
		private MyJvm2(){
			
		}
		public static  MyJvm2 single(){
			return instance;
		}
}

//3.延缓了加载时机
class MyJvm3{
	private static class JVMholder{
		private static MyJvm3 instance=new MyJvm3();

	}
	private MyJvm3(){
		
	}
	public static  MyJvm3 single(){
		return JVMholder.instance;
	}
}
