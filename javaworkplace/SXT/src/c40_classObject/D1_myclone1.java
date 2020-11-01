package c40_classObject;

/**
 * Created by wapal on 2017/7/11.
 * 使用Object的clone()
 */
public class D1_myclone1 implements Cloneable{
    public static void main(String[] args) {
        Student s1=new Student(5);
        Student s2= (Student) s1.clone();
        System.out.println(s2.age);
    }

    static class CloneObj implements Cloneable{
        @Override
        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }

        }
    }
    static class Student extends CloneObj {
        public int age=3;

        public Student(int age) {
            this.age = age;
        }
    }

}

