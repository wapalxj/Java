package CC174_Thread3_state;
/*
 * ����ʱʵ��
 */
import java.sql.Date;
import java.text.SimpleDateFormat;


public class Demo04_sleep_test1 {

	public static void main(String[] args) throws InterruptedException {
		Date endTime=new Date(System.currentTimeMillis()+10*1000);
		long end =endTime.getTime();
		while (true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			//������һ��ʱ��
			endTime=new Date(endTime.getTime()-1000);
			//��ʱһ��
			Thread.sleep(1000);
			//�����10�����ھͼ���
			if (end-10000>endTime.getTime()) {
				break;
			}
		}
	}
	public static void test() {
		
	}

}
