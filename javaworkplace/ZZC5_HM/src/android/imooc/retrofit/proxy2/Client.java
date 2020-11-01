package android.imooc.retrofit.proxy2;

public class Client {
    public static void main(String[] args) {
        Subject man = new Man();
        Proxy proxy = new Proxy(man);
        System.out.println("proxy1111:"+proxy);
        //创建真实代理对象
        Subject subject = (Subject) java.lang.reflect.Proxy.
                newProxyInstance(man.getClass().getClassLoader(),
                        man.getClass().getInterfaces(), proxy
                );

        //真实代理对象 调用 目标对象
        subject.shopping();

        //真实代理对象信息
        System.out.println(subject.getClass().getSimpleName());
    }
}
