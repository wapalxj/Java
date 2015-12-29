package C12_OOPTech;

/*
 * 对象克隆：深复制2
 */
class DeepCopyDemoClass {

    public int i = 100;
    public InnerClass b;        //A包容一个B的对象

    public DeepCopyDemoClass() {
        b = new InnerClass();	//创建被包容对象
    }

    public Object clone(){
    	DeepCopyDemoClass newObj = new DeepCopyDemoClass();
        newObj.i = this.i;
        newObj.b = new InnerClass();
        newObj.b.j=this.b.j;
        return newObj;

    }
}

class InnerClass {
    public int j = 200;
}

public class DeepCopy2 {

    public static void main(String[] args) {
    	DeepCopyDemoClass a = new DeepCopyDemoClass();
    	DeepCopyDemoClass other = (DeepCopyDemoClass)a.clone();
        System.out.println(a == other);
        System.out.println(a.b == other.b);

    }

    
}

