package CC15_5_Works;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Co2_PreColorClass_2 {
	public static void main(String[] args) {
		Drawer2 d=new Drawer2();
		d.drawLine();
		d.drawLine("RED");
	}
}
class Drawer2{
	public Drawer2() {
		super();
	}
	public void drawLine() {
		System.out.println("��һ��"+MyColor2.black.toString()+"��ɫ����");
	}
	public void drawLine(String color) {
		System.out.println("��һ��"+ MyColor2.color(color).toString()+"��ɫ����");
	}
	
}
class MyColor2{
	private static Map<String, Color> colors =new HashMap<String, Color>();
	static{
		colors.put("RED",Color.RED);
		colors.put("BLACK",Color.BLACK);
		colors.put("blue",Color.blue);
		colors.put("cyan",Color.cyan);
		colors.put("GRAY",Color.GRAY);
		colors.put("GREEN",Color.GREEN);
		colors.put("PINK",Color.pink);
		colors.put("yellow",Color.yellow);
	}
	
	 public final static Color black=colors.get("BLACK");
	 public final static Color red=colors.get("RED");
	 public final static Color YELLOW=colors.get("YELLOW");
	 public final static Color GRAY=colors.get("GRAY");
	 
	 
	public static Color color(String color) {
		return colors.get(color);
	}

}