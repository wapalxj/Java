package C14_class;

public class P318_ex9_char_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] ac="verovero".toCharArray();
		System.out.println("ac.getClass()---->"+ac.getClass());
		System.out.println("ac.getClass().getSuperclass()---->"+ac.getClass().getSuperclass());
		
		char c='c';
//		System.out.println("c.getClass()---->"+c.getClass());
		
		int []ai ={1,2,3};
		System.out.println("ai.getClass()---->"+ai.getClass());
		
		long []al ={1,2,3};
		System.out.println("al.getClass()---->"+al.getClass());
		
		//数组中的数据为object的时候，[后面还有个L
		String []sa ={"1","2","3"};
		System.out.println("sa.getClass()---->"+sa.getClass());
		
		Integer []Ia ={1,2,3};
		System.out.println("Ia.getClass()---->"+Ia.getClass());
		
		
		
	}
	
	

}
