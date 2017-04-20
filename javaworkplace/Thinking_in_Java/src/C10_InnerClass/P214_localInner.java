package C10_InnerClass;

public class P214_localInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}


interface Counter{
	
}
class LocalInnerClass{
	Counter getCounter(){
		class LocalCounter implements Counter{
		}
		return new LocalCounter();
	}
	
	Counter getCounter2(){
		return new Counter(){};
	}
}

class LocalInnerClass2{
	class LocalCounter implements Counter{
	}
	
	Counter getCounter2= new Counter(){};
}

class LocalInnerClass3{
	Counter getCounter(){
		class LocalCounter implements Counter{
		}
		return new LocalCounter();
	}
}