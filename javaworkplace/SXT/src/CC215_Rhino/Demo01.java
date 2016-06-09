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
        //获得脚本引擎对象
        ScriptEngineManager sem =new ScriptEngineManager();
        ScriptEngine engine=sem.getEngineByName("js");

        //存储到引擎上下文
        engine.put("msg","vero javascript");
        String  jsStr="var user={name:'vero',age:18};";
                jsStr+="print(user.name);";

        //执行脚本
        engine.eval(jsStr);
        engine.eval("msg='vnix  jjs';");

        System.out.println(engine.get("msg"));
        System.out.println("###########################");

        //定义JS函数
        engine.eval("function add(a,b){var sum=a+b;return sum};");
        //执行
        //取得调用接口
        Invocable jsInvo=(Invocable)engine;
        //执行
        Object o =jsInvo.invokeFunction("add",10,2);
        System.out.println(o);

//        使用其他Java包--可能是因为JDK8，这段代码已经会出错
//        System.out.println("###########################");
//        String jsCode="importPackage(java.util); var list=Arrays.asList([\"vewro\",\"vnix\"]);";
//        engine.eval(jsCode);
//        List<String> list=(List<String>)engine.get("list");
//        for (String temp:list) {
//            System.out.println(temp);
//        }

        //调用外部JS
        System.out.println("##############外部JS#############");
        URL url=Demo01.class.getClassLoader().getResource("CC215_Rhino/a.js");
        FileReader fr=new FileReader(url.getPath());
        engine.eval(fr);
        fr.close();
    }
}
