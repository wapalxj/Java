package android.imooc.retrofit.proxy1;

public class ProxyObject extends AbstractObject {

    //对目标类的引用
    private RealObject realObject;

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    protected void operation() {
        System.out.println("do sth before real operation.");
        if (realObject == null) {
            realObject=new RealObject();
        }
        realObject.operation();
        System.out.println("do sth after real operation.");
    }
}
