package c08_poly;
/**
 * 此程序与Testccccccccccc对比
 * @author Administrator
 *
 */
public class ParentChildTest {

	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.printValue();
		
		Child child=new Child();
		child.printValue();
		
		parent=child;
		parent.printValue();
		//以上的正常
		//已下的
		parent.myValue++;//子类被当做父类使用，访问的字段是父类的
		parent.printValue();//对象是子类型的，则调用子类的printValue()

		
		((Child)parent).myValue++;//强制转换了，访问的才是子类的字段
		parent.printValue();//对象是子类型的，则调用子类的printValue()

	}

}
class Parent{
	public int myValue=100;
	public void printValue() {
		System.out.println("Parent.printValue(),myValue="+myValue);
	}
}
class Child extends Parent{
	public int myValue=200;
	public void printValue() {
		System.out.println("Child.printValue(),myValue="+myValue);
	}
}