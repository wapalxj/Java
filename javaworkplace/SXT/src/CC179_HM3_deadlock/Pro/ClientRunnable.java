package CC179_HM3_deadlock.Pro;

/**
 * 消费者执行目标
 * Created by Administrator on 2016/6/10.
 */
public class ClientRunnable implements Runnable{
    private Person person;

    public ClientRunnable(Person person){
        this.person=person;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        while (true) {
            synchronized (person) {
                if (!person.flag) {
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("消费：name:" + person.getName() + "---->age:" + person.getAge());
                    person.flag=false;
                    person.notify();
                }

            }
        }
    }
}
