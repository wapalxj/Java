package CC129_OtherCollection_Queue;

/*
 * ʹ�ö���ʵ���Զ����ջ����
 */
public class Demo02 {

	public static void main(String[] args) {
		MyStack<String> backHistory =new MyStack<>(3);
		backHistory.push("vero");
		backHistory.push("Alicc");
		backHistory.push("vnix");
		backHistory.push("vvv");
		//����ָ��size�������
		System.out.println("size:"+backHistory.size());
		String item=null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
		
	}

}
