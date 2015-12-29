package C10_Generatic;



public class Tips {
	
	public static void main(String[] args) {
		// 2.1不能定义一个泛型化数组
		//Pair<String>[] table =new Pair<String>[10];
		
	
	}
	
}

//2.2不能直接创建泛型实例
class P<T>{
	T first;
	T second;
	public P() {
//	this.first = new T();
//	this.second =new T();
	}
}
//3.1不能直接或间接继承自Throwable:
//class Problem<T> extends Exception {
//	
//}
//3.2无法抛出或捕获泛型类型的对象
//try {
//	System.out.println(1);
//} catch (T e) {
//	e.printStackTrace();
//  }

//4.无法定义感性静态成员，无法通过编译
class MyC<T>{
//	public static T value;
//	public static  T f2(){错误
//	}
}

//5.1从泛型类派生子类，不允许有泛型参数
//class MyP extends P<T>{	
//}
//但是可以有具体参数：
class MyP extends P<String>{	
}

//5.2如果P是泛型类，在定义子类时不指定泛型参数，则P的泛型默认是Object
class MyP2 extends P{
}


