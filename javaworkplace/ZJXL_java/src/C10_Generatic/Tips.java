package C10_Generatic;



public class Tips {
	
	public static void main(String[] args) {
		// 2.1���ܶ���һ�����ͻ�����
		//Pair<String>[] table =new Pair<String>[10];
		
	
	}
	
}

//2.2����ֱ�Ӵ�������ʵ��
class P<T>{
	T first;
	T second;
	public P() {
//	this.first = new T();
//	this.second =new T();
	}
}
//3.1����ֱ�ӻ��Ӽ̳���Throwable:
//class Problem<T> extends Exception {
//	
//}
//3.2�޷��׳��򲶻������͵Ķ���
//try {
//	System.out.println(1);
//} catch (T e) {
//	e.printStackTrace();
//  }

//4.�޷�������Ծ�̬��Ա���޷�ͨ������
class MyC<T>{
//	public static T value;
//	public static  T f2(){����
//	}
}

//5.1�ӷ������������࣬�������з��Ͳ���
//class MyP extends P<T>{	
//}
//���ǿ����о��������
class MyP extends P<String>{	
}

//5.2���P�Ƿ����࣬�ڶ�������ʱ��ָ�����Ͳ�������P�ķ���Ĭ����Object
class MyP2 extends P{
}


