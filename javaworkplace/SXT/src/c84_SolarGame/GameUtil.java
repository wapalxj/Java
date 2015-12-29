package c84_SolarGame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
	private GameUtil(){}//������ͨ�������췽��˽��
	
	public static Image getImage(String path) {
		URL u=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try {
			img=ImageIO.read(u);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return img;

	}
}
