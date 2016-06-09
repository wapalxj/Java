package c51_innerclass;


/**
 * Created by Administrator on 2016/6/5.
 */
public class Outer {
    private String out;
    public Outer(){

    }

    public String getOut(){
        return this.out;
    }

    public Inner getInner(){
        return this.new Inner();
    }

    class Inner{
        private String inner;
        public Inner(){
            out="filed_out";
        }
    }
}

class Test{
    public static void main(String[] args) {
//        Outer.Inner inner=new Outer.Inner();//错误
        Outer.Inner inner=new Outer().new Inner();//现有外部对象，才有内部

        Outer outer2=new Outer();
//        outer2.getInner();
        System.out.println(outer2.getOut());
    }
}
