package clock4;

public class clockDisplay {
	private int uplimit;
	private int value=0;
	
	public clockDisplay(int uplimit) {
		this.uplimit=uplimit;
	}
	
	public void tick() {
		this.value++;
		if(this.value==this.uplimit)
		{
			this.value=0;
		}
	}
	
	public int getValue() {
		return this.value;
	}
	public String toString() {
		if(this.value<10)
		{
			return "0"+this.value;
			
		}else 
		{
			return ""+this.value;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		clockDisplay d =new clockDisplay(24);
//		while(true)
//		{
//			d.tick();
//			System.out.println(d.getValue());
//			
//		}
	}

}
