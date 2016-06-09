package CC211_reflection.Demo06;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/12/13.
 * �����ȡע��:��ע��CC210��demo01һ��
 */
public class Demo06_Annotation {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("CC211_reflection.Demo06.SxStudent");
            //��ȡ�������ע��
            Annotation[] annotations=clazz.getAnnotations();
            for (Annotation a:annotations){
                System.out.println(a);
            }
            //��ȡ���ָ��ע���ֵ
            SxTable st= (SxTable) clazz.getAnnotation(SxTable.class);
            System.out.println(st.value());

            //���������Ե�ע��
            Field field=clazz.getDeclaredField("studentName");
            SxField sxField=field.getAnnotation(SxField.class);
            System.out.println(sxField.columnName()+"--"+sxField.type()+"--"+sxField.length());

            //�����ķ�����ע��
            Method method=clazz.getDeclaredMethod("getId");
            SxTable sxMethod=(SxTable)method.getAnnotation(SxTable.class);
            System.out.println(sxMethod.value());

            //���Ը��ݻ�õı������ֶε���Ϣ��ͨ��JDBCִ��SQL���
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
