package c1_4_thread.cn.enjoyedu.ch2.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 *类说明：演示Future等的使用
 */
public class UseFuture {
	
	
	/*实现Callable接口，允许有返回值*/
	private static class UseCallable implements Callable<Integer>{
		private int sum;
		@Override
		public Integer call() throws Exception {
			System.out.println("Callable子线程开始计算！");  
//			Thread.sleep(2000);
	        for(int i=0 ;i<5000;i++){
	        	if(Thread.currentThread().isInterrupted()) {
					System.out.println("Callable子线程计算任务中断！");
					return null;
				}
				Thread.sleep(1);
	            sum=sum+i;

				System.out.println("Callable子线程计算结束！结果为: "+sum);
			}
	        System.out.println("Callable子线程计算结束！结果为: "+sum);  
	        return sum; 
		}
	}
	
	public static void main(String[] args) 
			throws InterruptedException, ExecutionException {
		
		//TODO
		UseCallable callable=new UseCallable();
		FutureTask<Integer> task=new FutureTask<Integer>(callable);
		new Thread(task).start();
		Thread.sleep(100);

		if (new Random().nextInt(100)>80) {
			System.out.println("阻塞在这里====");
			System.out.println("get========="+task.get());
		}else {
			System.out.println("cancel");
			task.cancel(true);
		}
	}

}
