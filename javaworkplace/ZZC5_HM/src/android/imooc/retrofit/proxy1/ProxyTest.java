package android.imooc.retrofit.proxy1;

public class ProxyTest {
    public static void main(String[] args) {
        RealObject realObject=new RealObject();
        ProxyObject proxy=new ProxyObject(realObject);
        proxy.operation();
    }
}
