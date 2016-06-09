package CC169_Thread;
/*
 *  使用Runnable创建线程
 *  1.Runnable+run()---》真实角色
 *  2.启动多线程:使用静态代理
 *  	创建代理角色+真实角色的引用
 *  	启动线程
 */
public class T3_Runnable {

	public static void main(String[] args) {
		//1
		Programmer programmer=new Programmer();
		//2
		Thread proxy=new Thread(programmer);
		//3
		proxy.start();
		for(int i=0;i<100;i++){
			System.out.println("一边敲聊QQ");
		}
	}

}
//真实角色
class Programmer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("一边敲hello world");
		}
	}
		
}