package android;

public class MemmoryStructure {

    public static void main(String[] args) {
        Person p = new Manager();
//        p.printSalary();//动态绑定---30000
        System.out.println(p.salary);//10000---Person.this.salary
        p.sing();//静态绑定---忘情水
    }


    static class Person {
        protected int salary = 10000;

        public static void sing(){
            System.out.println("忘情水");
        }
        public void printSalary() {
            System.out.println(salary);
        }
    }

    static class Manager extends Person {
        protected int salary = 30000;

        public static void sing(){
            System.out.println("中国人");
        }
        public void printSalary() {
            System.out.println(salary);
        }
    }
}


