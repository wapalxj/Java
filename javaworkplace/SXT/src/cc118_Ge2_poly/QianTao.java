package cc118_Ge2_poly;

public class QianTao<T> {
	T ti;
	
	
	public static void main(String[] args) { 
		/**
		 * 两层:从外到内拆分：
		 * 1.QianTao:room
		 * 2.GeA:t=room.ti
		 * 3.String:s
		 */
		QianTao<GeA<String>> room=new QianTao<GeA<String>>();
		
		room.ti=new GeA<String>(); 
		GeA<String> t =room.ti;
		String s=t.score;
		
		
	}	
}
