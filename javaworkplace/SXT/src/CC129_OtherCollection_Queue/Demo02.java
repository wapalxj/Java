package CC129_OtherCollection_Queue;

/*
 * 使用队列实现自定义堆栈测试
 */
public class Demo02 {

	public static void main(String[] args) {
		MyStack<String> backHistory =new MyStack<>(3);
		backHistory.push("vero");
		backHistory.push("Alicc");
		backHistory.push("vnix");
		backHistory.push("vvv");
		//超过指定size则不再添加
		System.out.println("size:"+backHistory.size());
		String item=null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
		
	}

}
