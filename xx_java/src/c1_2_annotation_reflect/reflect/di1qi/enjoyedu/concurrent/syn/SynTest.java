package c1_2_annotation_reflect.reflect.di1qi.enjoyedu.concurrent.syn;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class SynTest {

	private long count =0;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	//count进行累加
	public void incCount(){
		count++;
	}

	//线程
	private static class Count extends Thread{

		private SynTest simplOper;

		public Count(SynTest simplOper) {
			this.simplOper = simplOper;
		}

		@Override
		public void run() {
			for(int i=0;i<10000;i++){
				simplOper.incCount();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SynTest simplOper = new SynTest();
		//启动两个线程
		Count count1 = new Count(simplOper);
		Count count2 = new Count(simplOper);
		count1.start();
		count2.start();
		Thread.sleep(50);
		System.out.println(simplOper.count);
	}
}
