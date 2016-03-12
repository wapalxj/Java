package cc122_sort;
/*
 * Comperable接口
 */
public class PakageType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a;//根据基本数据类型（value）大小比较
		Character ch;//根据Unicode编码顺序比较
		String str="abc";//如果其中一个是另外一个起始开始的字串，返回长度之差，否则返还第一个不相等自符的Unicode之差
		String str2="abcde";
		System.out.println(str.compareTo(str2));
	}

}
