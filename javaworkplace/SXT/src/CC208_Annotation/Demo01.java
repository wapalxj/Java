package CC208_Annotation;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/9.
 */
public class Demo01 {

    @Override//ע��:˵�����������д�Ը���
    public String toString() {
        return super.toString();
    }
//    @Override //������д�ķ���---����
//    public String tostring() {
//        return super.toString();
//    }
    public static void main(String[] args) {
        Date date=new Date();
        //@Deprecatedע�⣺������ʹ�õ�
        date.parse("dd");
        myAnno();
    }
    @SuppressWarnings("all")
    @Deprecated//�Լ��Ĳ�����ʹ�÷���
    public static void myAnno(){
        System.out.println("����Ϊ@Deprecated��������ʹ��");
    }
}
