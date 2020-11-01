package testList;

import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wapal on 2017/10/24.
 */
public class TestArraysAsList {
    public static void main(String[] args) {
        Integer i[]={11,22,33};
        //方法1
        List inter=new ArrayList(Arrays.asList(i));
        List inter2=new ArrayList();
        //方法2
        Collections.addAll(inter2,i);
        inter.add(5);
        inter2.add(115);
        System.out.println(inter);
        System.out.println(inter2);

        int i2[]={11,22,33};
        List l2=new ArrayList(Arrays.asList(ArrayUtils.toObject(i2)));
        l2.add(5555);
        System.out.println(l2);
    }
}
