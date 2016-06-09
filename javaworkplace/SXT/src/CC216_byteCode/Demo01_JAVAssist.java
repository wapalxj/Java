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
        //创建新类
        CtClass cc=pool.makeClass("CC216_byteCode.BeanEmp");

        //创建属性
        CtField empno=CtField.make("private int empno;",cc);
        CtField ename=CtField.make("private String ename;",cc);
        cc.addField(empno);
        cc.addField(ename);
        //创建方法
        CtMethod getEmpno=CtMethod.make("public int getEmpno(){return empno;}",cc);
        CtMethod setEmpno=CtMethod.make("public void setEmpno(int empno){this.empno=empno;}",cc);
        cc.addMethod(getEmpno);
        cc.addMethod(setEmpno);
        //创建构造器
        CtConstructor constructor=new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")},cc);
        constructor.setBody("{$0.empno=$1;$0.ename=$2;}");
        cc.addConstructor(constructor);
        cc.writeFile("F:/myjava");//将上面构建好的类写入地址
        System.out.println("good");
    }
}
