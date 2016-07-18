package CC179_HM3_deadlock.Pro;

/**
 * 生产者执行目标
 * Created by Administrator on 2016/6/10.
 *
 * wait();
 */
public class ProRunnable implements Runnable {
    private Person person;

    public ProRunnable(Person person){
        this.person=person;
    }
    //定义标量，每次标记不同的人
    int x=0;
    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                if (person.flag){
                    //生产者停止生产
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    if (x % 2 == 0) {
                        person.setName("v21");
                        person.setAge(21);
                    } else {
                        person.setName("c24");
                        person.setAge(24);
                    }
                    System.out.println("生产：name:" + person.getName() + "---->age:" + person.getAge());
                    x++;
                    person.flag=true;
                    person.notify();//唤醒消费者
                }

            }
        }

    }
}
