package CC132_OtherCollection_ReferenceAndRefMap;

import java.util.EnumMap;

/*
 * EnumMap:¼üÎªÃ¶¾Ù
 */
public class Demo_3EnumMap {

	public static void main(String[] args) {
		EnumMap<Season,String> map =new EnumMap<Season, String>(Season.class);
		map.put(Season.SPRING, "´ºÀ§");
		map.put(Season.SUMMER, "ÏÄÎÞÁ¦");
		map.put(Season.AUTUMN, "Çï·¦");
		map.put(Season.WINTER, "¶¬Ãß");
		
		System.out.println(map.size());

	}

}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}