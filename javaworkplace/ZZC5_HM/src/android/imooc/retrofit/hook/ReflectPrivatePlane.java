package android.imooc.retrofit.hook;

import java.lang.ref.PhantomReference;

/**
 * 通过反射实现修改对象
 */
public class ReflectPrivatePlane extends PrivatePlaneEngine{
    private PrivatePlaneEngineInterface start;

    public ReflectPrivatePlane(PrivatePlaneEngineInterface start) {
        this.start = start;
    }

    public int maxSpeed(){
        return 3*start.maxSpeed();
    }
}
