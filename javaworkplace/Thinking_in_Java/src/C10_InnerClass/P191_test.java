package C10_InnerClass;

import java.util.jar.Attributes.Name;

public class P191_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel.Content content=new Parcel().new Content();
		Content content2=null;
		
	}
	class Content{
		
	}
}

class Parcel{
	private int name=0;
	class Content{
//		static String inner;//�������
		public Content() {
			name++;
			System.out.println(name);
		}
	}
}