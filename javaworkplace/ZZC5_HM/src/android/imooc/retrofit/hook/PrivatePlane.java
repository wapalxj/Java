package android.imooc.retrofit.hook;

public class PrivatePlane{
    PrivatePlaneEngineInterface privatePlaneEngineInterface;

    public PrivatePlane() {
        this.privatePlaneEngineInterface = new PrivatePlaneEngine();
    }

    public void showMaxSpeed() {
        System.out.println("最大时速：" + privatePlaneEngineInterface.maxSpeed());
    }

}
