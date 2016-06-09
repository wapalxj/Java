package C10_Generatic;
/**
 * 泛型使用
 * @author Administrator
 *
 */
public class PairTest {
	public static Pair<String> minmax(String[] a) {
		if (a==null||a.length==0) {
			return null;
		}
		
		String min=a[0];
		String max=a[0];
		for (int i = 0; i < a.length; i++) {
			if ((min.compareTo(a[i])>0)) {
				min=a[i];
			}
			if ((max.compareTo(a[i])<0)) {
				max=a[i];
			}
		}
		
		return new Pair<String>(min,max);//返回一个Pair<String>,调用第二个构造器
	}
	
	public static void main(String[] args) {
		String[] a={"2","1","3","9","7","4","5",};
		Pair<String> p= minmax(a);
		System.out.println(p.getFirst()+" "+p.getSecond());
		
	}
}
