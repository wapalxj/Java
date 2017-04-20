package C14_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.sun.org.apache.regexp.internal.recompile;

public class P318_ex6_HShapes {
	public static void main(String[] args) {
		List<HShape> shapes = Arrays.asList(
			new HCircle(), new HSquare(),
			new HTriangle(), new HSquare(),
			new HTriangle(), new HCircle(),
			new HCircle(), new HSquare());
			HShape.highLight1(HCircle.class);
			HShape.highLight2(HCircle.class);
			for(HShape shape : shapes)
			shape.draw();
			System.out.println("*******");
			// Highlight them all:
			HShape.highLight1(HShape.class);
			HShape.highLight2(HShape.class);
			for(HShape shape : shapes)
			shape.draw();
			System.out.println("*******");
			// Not in the hierarchy:
			HShape.clearHighLight1(ArrayList.class);
			HShape.clearHighLight2(ArrayList.class);
			for(HShape shape : shapes)
			shape.draw();
	}
}

abstract class HShape{
	boolean hightLighted=false;
	public void highLight(){
		hightLighted=true;
	}
	public void clearHighLight(){
		hightLighted=false;
	}
	
	void draw(){
		System.out.println(this+".draw()");
	}
	public String toString(){
		return getClass().getName()+(hightLighted ? "highlighted" : "normal");
	};
	
	static List<HShape> shapes=new ArrayList<>();
	
	HShape(){
		shapes.add(this);
	}
	
	static void  highLight1(Class<?> type){
		for (HShape hShape: shapes) {
			hShape.highLight();
		}
	}
	
	static void  clearHighLight1(Class<?> type){
		for (HShape hShape: shapes) {
			hShape.clearHighLight();
		}
	}
	
	static void forEach(Class<?> type,String method){
		try {
			Method m=HShape.class.getMethod(method,(Class<?>[])null);
			for (HShape shape:shapes) {
				if (type.isInstance(shape)) {
					m.invoke(shape, (Object[])null);
				}
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	static void  highLight2(Class<?> type){
		forEach(type, "highLight");
	}
	
	static void  clearHighLight2(Class<?> type){
		forEach(type, "clearHighLight");
	}
}

class HCircle extends HShape{}
class HSquare extends HShape{}
class HTriangle extends HShape{}
