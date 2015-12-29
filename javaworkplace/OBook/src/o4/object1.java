package o4;

public class object1 {
		private String a;
		private int b;
		private int c;
		
		public object1() {//默认构造器可以实例化o1,不可以实例化o2
			
		}

//		public object1(String a,int b,int c) {//构造器可以实例化o2，不可以实例化o1
//			
//		}
		public int itro() {
			return b+c;
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object1 o1 =new object1();
//		object1 o2 =new object1("aa",2,3);
	}

}


