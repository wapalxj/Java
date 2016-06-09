package c56_strBuilder;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder("qwerrttyyui1234");
		sb.delete(0, 3);//同样可以做成方法链
		System.out.println(sb);
		
		sb.insert(2, "1");
		System.out.println(sb);
		
		
		sb.reverse();//倒序
		System.out.println(sb);
		
		StringBuffer sbb =new StringBuffer("qjksdfncelkn");
		
	}

}
