package CC215_Rhino;


import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

/**Rhino
 * Created by Administrator on 2015/12/13.
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //��ýű��������
        ScriptEngineManager sem =new ScriptEngineManager();
        ScriptEngine engine=sem.getEngineByName("js");

        //�洢������������
        engine.put("msg","vero javascript");
        String  jsStr="var user={name:'vero',age:18};";
                jsStr+="print(user.name);";

        //ִ�нű�
        engine.eval(jsStr);
        engine.eval("msg='vnix  jjs';");

        System.out.println(engine.get("msg"));
        System.out.println("###########################");

        //����JS����
        engine.eval("function add(a,b){var sum=a+b;return sum};");
        //ִ��
        //ȡ�õ��ýӿ�
        Invocable jsInvo=(Invocable)engine;
        //ִ��
        Object o =jsInvo.invokeFunction("add",10,2);
        System.out.println(o);

//        ʹ������Java��--��������ΪJDK8����δ����Ѿ������
//        System.out.println("###########################");
//        String jsCode="importPackage(java.util); var list=Arrays.asList([\"vewro\",\"vnix\"]);";
//        engine.eval(jsCode);
//        testList<String> list=(testList<String>)engine.get("list");
//        for (String temp:list) {
//            System.out.println(temp);
//        }

        //�����ⲿJS
        System.out.println("##############�ⲿJS#############");
        URL url=Demo01.class.getClassLoader().getResource("CC215_Rhino/a.js");
        FileReader fr=new FileReader(url.getPath());
        engine.eval(fr);
        fr.close();
    }
}
