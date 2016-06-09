package CC216_byteCode;

import javassist.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**字节码操作\
 *
 * Created by Administrator on 2015/12/13.
 */
public class Demo02 {
    public static void main(String[] args) throws IOException, CannotCompileException, NotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {
//        test01();
//        test02();
//        test03();
//        test04();
//        test05();
        test06();
    }

    /**
     * 测试类
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test01() throws NotFoundException, IOException, CannotCompileException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

        byte[]bytes=cc.toBytecode();
        System.out.println(Arrays.toString(bytes));

        System.out.println("包名+类名："+cc.getName());
        System.out.println("类名："+cc.getSimpleName());
        System.out.println("父类："+cc.getSuperclass());
    }

    /**
     * 测试产生新的方法
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test02() throws NotFoundException, IOException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

//        CtMethod method=CtNewMethod.make("public int add(int a,int b){return a+b}",cc);
        //或者
        CtMethod method=new CtMethod(CtClass.intType,"add",new CtClass[]{CtClass.intType,CtClass.intType},cc);
        method.setModifiers(Modifier.PUBLIC);
        method.setBody("{System.out.println(\"vvvvvvvvv\");return $1+$2;}");
        cc.addMethod(method);
        //通过反射调用
        Class clazz=cc.toClass();
        Object obj=clazz.newInstance();
        Method method_add=clazz.getDeclaredMethod("add", int.class, int.class);
        System.out.println("200+300="+method_add.invoke(obj, 200, 300));
    }

    /**
     *测试改变方法
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test03() throws NotFoundException, IOException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

        CtMethod method_say=cc.getDeclaredMethod("sayHello", new CtClass[]{CtClass.intType});
        //方法体前面和后面加入代码
        method_say.insertBefore("System.out.println($1);System.out.println(\"start!!\");");
        method_say.insertAfter("System.out.println(\"end!!\");");
        //通过反射调用
        Class clazz=cc.toClass();
        Object obj=clazz.newInstance();
        Method method_syH=clazz.getDeclaredMethod("sayHello", int.class);
        method_syH.invoke(obj, 300);
    }

    /**
     *测试属性
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test04() throws NotFoundException, IOException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

//        CtField f1=CtField.make("private int empno",cc);
        //或者
        CtField f1=new CtField(CtClass.intType,"empage",cc);
        f1.setModifiers(Modifier.PUBLIC);
        cc.addField(f1,"100");//第二个参数为默认值

        //增加setter和getter
        cc.addMethod(CtNewMethod.getter("setAge",f1));
        cc.addMethod(CtNewMethod.getter("getAge",f1));
    }

    /**
     *构造器
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test05() throws NotFoundException, IOException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

        CtConstructor[] constructors=cc.getConstructors();

        for (CtConstructor c:constructors){
            System.out.println(c.getLongName());
        }
    }

    /**
     *操作注解
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test06() throws NotFoundException, IOException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        ClassPool pool=ClassPool.getDefault();
        //创建新类
        CtClass cc=pool.get("CC216_byteCode.Emp");

        Object[] all=cc.getAnnotations();
        Author a=(Author)all[0];
        String name=a.name();
        int year=a.year();
        System.out.println("name:"+name+",year:"+year);
    }
}
