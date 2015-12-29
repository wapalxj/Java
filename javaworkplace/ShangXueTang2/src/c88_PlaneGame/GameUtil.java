package c88_PlaneGame;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
	private GameUtil(){}//工具类通常将构造方法私有
	
	public static Image getImage(String imgpath) {
//		URL u=GameUtil.class.getClassLoader().getResource(path);
//		BufferedImage img=null;
//		try {
//			img=ImageIO.read(u);
//		} catch (Exception e) {
//		e.printStackTrace();
//		}
//		return img;
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(imgpath));

	}
}
