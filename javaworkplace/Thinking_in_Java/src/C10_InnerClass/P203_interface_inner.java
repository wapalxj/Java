package C10_InnerClass;

public class P203_interface_inner {
	public static void main(String[] args) {
		Inter.Test.howdy(new Inter(){
			@Override
			public int getInt(int init) {
				return init*10;
			}
		},10);
	}
}

interface Inter{
	int getInt(int init);
	class Test{
		static void howdy(Inter i,int init){
			System.out.print(i.getInt(init));
		}
	}
}