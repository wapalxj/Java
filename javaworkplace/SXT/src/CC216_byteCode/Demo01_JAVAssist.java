package CC216_byteCode;

import javassist.*;
import jdk.nashorn.internal.objects.annotations.Constructor;

import java.io.IOException;

/**
 * Created by Administrator on 2015/12/13.
 */
public class Demo01_JAVAssist {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        ClassPool pool=ClassPool.getDefault();
        //��������
        CtClass cc=pool.makeClass("CC216_byteCode.BeanEmp");

        //��������
        CtField empno=CtField.make("private int empno;",cc);
        CtField ename=CtField.make("private String ename;",cc);
        cc.addField(empno);
        cc.addField(ename);
        //��������
        CtMethod getEmpno=CtMethod.make("public int getEmpno(){return empno;}",cc);
        CtMethod setEmpno=CtMethod.make("public void setEmpno(int empno){this.empno=empno;}",cc);
        cc.addMethod(getEmpno);
        cc.addMethod(setEmpno);
        //����������
        CtConstructor constructor=new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")},cc);
        constructor.setBody("{$0.empno=$1;$0.ename=$2;}");
        cc.addConstructor(constructor);
        cc.writeFile("F:/myjava");//�����湹���õ���д���ַ
        System.out.println("good");
    }
}
