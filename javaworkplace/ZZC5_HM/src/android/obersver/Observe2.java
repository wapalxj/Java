package android.obersver;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式---自定义实现
 */
public class Observe2 {


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("vero2222");
        Student student2 = new Student("vnix2222");
        Student student3 = new Student("vvvv2222");
        teacher.addObserver(student1);
        teacher.addObserver(student2);
        teacher.addObserver(student3);

        teacher.publish("aaaaa2222");
    }


    public interface MyObserver {
        void update(MyObserverable o, Object arg);
    }

    public interface MyObserverable {
    }


    static class Teacher implements MyObserverable {
        List<MyObserver> observers = new ArrayList<>();

        public String message;

        public void publish(String message) {
            this.message = message;
            notifyObservers();
        }

        public void addObserver(MyObserver observer) {
            if (observers == null)
                throw new NullPointerException();
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }

        public synchronized void deleteObserver(Observer o) {
            observers.remove(o);
        }

        public void notifyObservers() {
            for (MyObserver observer : observers) {
                observer.update(this, this.message);
            }
        }

    }

    static class Student implements MyObserver {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public void update(MyObserverable o, Object arg) {
           Teacher teacher = (Teacher) o;
            String msg = teacher.message;
            System.out.println(name + "收到 " + msg);
        }
    }


}


