package CC173_Thread2_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import sun.reflect.generics.tree.Tree;


public class Call {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建2个线程
		ExecutorService ser=Executors.newFixedThreadPool(2);
		RaceCallable tortoise=new RaceCallable("千年王八",1000);
		RaceCallable rabbit=new RaceCallable("小兔子",500);
		//获取值
		//返回的是一个FutureTask
		Future<Integer> res1=ser.submit(tortoise);
		Future<Integer> res2=ser.submit(rabbit);
		
		Thread.sleep(2000);//2秒后
		tortoise.setFlag(false);//乌龟停下
		rabbit.setFlag(false);//兔子停下
		
		int num1 =res1.get();
		int num2 =res2.get();
		System.out.println("乌龟跑了："+num1+"步");
		System.out.println("兔子跑了："+num2+"步");
		//停止服务(线程)
		ser.shutdown();
	}

}

class RaceCallable implements Callable<Integer>{
	private String name;
	private long time;
	private boolean flag=true;
	private int step=0;
	
	public RaceCallable() {
	
	}

	public RaceCallable(String name) {
		super();
		this.name=name;
	}
	public RaceCallable(String name,long time) {
		super();
		this.name=name;
		this.time=time;
	}
	
	@Override
	public Integer call() throws Exception {
		while (flag) {
			Thread.sleep(time);//延时
			step++;
		}
		return step;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	
}
