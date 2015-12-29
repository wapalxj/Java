package CC15_5_Works;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Co2_PreColorClass_1 {
	public static void main(String[] args) {
		Drawer d=new Drawer();
		d.drawLine();
		d.drawLine("RED");
	}
}
class Drawer{
	public Drawer() {
		super();
	}
	public void drawLine() {
		System.out.println("画一条"+MyColor.black+"颜色的线");
	}
	public void drawLine(String color) {
		System.out.println("画一条"+ MyColor.color(color)+"颜色的线");
	}
	
}
class MyColor{
	private static Map<String, String> colors =new HashMap<String, String>();
	static{
		colors.put("RED","red");
		colors.put("BLACK","BLACK");
		colors.put("YELLOW","YELLOW");
		colors.put("GREEN","green");
		colors.put("BLUE","blue");
		colors.put("CYAN","CYAN");
		colors.put("PINK","pink");
		colors.put("GRAY","GRAY");
	}
	
	 public final static String black=colors.get("BLACK");
	 public final static String red=colors.get("RED");
	 public final static String YELLOW=colors.get("YELLOW");
	 public final static String GRAY=colors.get("GRAY");
	 
	 
	public static String color(String color) {
		return colors.get(color);
	}

}