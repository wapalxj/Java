package CC174_Thread3_state;
/*
 * 倒计时实现
 */
import java.sql.Date;
import java.text.SimpleDateFormat;


public class Demo04_sleep_test1 {

	public static void main(String[] args) throws InterruptedException {
		Date endTime=new Date(System.currentTimeMillis()+10*1000);
		long end =endTime.getTime();
		while (true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			//构建下一秒时间
			endTime=new Date(endTime.getTime()-1000);
			//延时一秒
			Thread.sleep(1000);
			//如果在10秒以内就继续
			if (end-10000>endTime.getTime()) {
				break;
			}
		}
	}
	public static void test() {
		
	}

}
