package CC158_Serializable;


import java.io.Serializable;

/**
 * Created by Administrator on 2015/12/1.
 */
public class Employee implements Serializable {
    private transient String name;//不需要序列化
    private double salary;
    public Employee(){

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
