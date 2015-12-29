package inheritance5;

public class CD extends Item {
	private int numOfTracks=0;
	public CD(String title,int not) {
		super(title);
		numOfTracks =not;
	}
	public static void main(String[] args) {
		CD cd=new CD("CX",7);
		cd.print();
		
	}
}
