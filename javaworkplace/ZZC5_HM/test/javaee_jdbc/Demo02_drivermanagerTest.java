package javaee_jdbc;

import org.junit.Test;

/**
 * Created by wapal on 2017/5/25.
 */
public class Demo02_drivermanagerTest {
    @Test
    public void test() throws Exception {
//        new Demo02_drivermanager().test();
//        new Demo02_drivermanager().test2();
//        new Demo02_drivermanager().test3();
    }
    @Test
    public void testCRUD() throws Exception {
//        new Demo03_crud().testInsert();//测试插入
//        new Demo03_crud().testUpdate();//测试修改
//        new Demo03_crud().testDelete();//测试删除
        new Demo03_crud().testQuery();//测试查询


    }

}