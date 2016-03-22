package T3;

/**
 * Created by Administrator on 2016/3/15.
 */
public class Test1 {
    public static void main(String[] args) {
        //我先来个圆，没有半径的
        Circle c=new Circle();
        //需要的时候我再设置半径
        c.setRadius(10);
        System.out.println(c.getArea());

    }
}

class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x,int y) {
        this();
        this.x=x;
        this.y=y;
    }
    public Circle(int x,int y,double radius) {
        this(radius);
        this.x=x;
        this.y=y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
