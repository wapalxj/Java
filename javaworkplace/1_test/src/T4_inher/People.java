package T4_inher;

/**
 * Created by Administrator on 2016/3/19.
 */
public class People {
    public People() {
        System.out.print("ppppppppppppppp");
    }

    public static void main(String[] args) {
        Student s=new Student();
    }
}

class Student extends People{
    private String name;
    public Student() {
    }

    public Student(String s) {
    }

    public void run(String s){
        this.name="";
    }
}