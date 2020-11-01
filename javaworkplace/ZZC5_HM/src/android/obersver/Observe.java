package android.obersver;

import java.util.Observable;
import java.util.Observer;


/**
 * 观察者模式---基于JDK实现
 */
public class Observe extends Observable {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("vero");
        Student student2 = new Student("vnix");
        Student student3 = new Student("vvvv");
        teacher.addObserver(student1);
        teacher.addObserver(student2);
        teacher.addObserver(student3);

        teacher.publish("aaaaa");

    }
    static class Teacher extends Observable {
        public String message;

        public void publish(String message) {
            this.message = message;
            setChanged();
            notifyObservers();
        }
    }

    static class Student implements Observer {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            Teacher teacher = (Teacher) o;
            String msg = teacher.message;
            System.out.println(name + "收到 " + msg);
        }
    }
}

