package c1_4_thread.cn.enjoyedu.ch2.tools;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Exchanger;

/**
 *类说明：演示CyclicExchange用法
 */
public class UseExchange {
    private static final Exchanger<Set<String>> exchange = new Exchanger<Set<String>>();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
            	Set<String> setA = new HashSet<String>();//存放数据的容器
                try {
                	/*添加数据
                	 * set.add(.....)
                	 * */
                    setA.add("AAAAAAAA");
                	setA = exchange.exchange(setA);//交换set
                	/*处理交换后的数据*/
                } catch (InterruptedException e) {
                }
                System.out.println("setA==="+setA);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
            	Set<String> setB = new HashSet<String>();//存放数据的容器
                try {
                	/*添加数据
                	 * set.add(.....)
                	 * set.add(.....)
                	 * */
                    setB.add("BBBBBBBBBBBBBBBBB");
                	setB = exchange.exchange(setB);//交换set
                	/*处理交换后的数据*/
                } catch (InterruptedException e) {
                }
                System.out.println("setB==="+setB);
            }
        }).start();

    }
}
