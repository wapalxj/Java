package c08_poly;
/**
 * �˳�����Testccccccccccc�Ա�
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
		//���ϵ�����
		//���µ�
		parent.myValue++;//���౻��������ʹ�ã����ʵ��ֶ��Ǹ����
		parent.printValue();//�����������͵ģ�����������printValue()

		
		((Child)parent).myValue++;//ǿ��ת���ˣ����ʵĲ���������ֶ�
		parent.printValue();//�����������͵ģ�����������printValue()

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