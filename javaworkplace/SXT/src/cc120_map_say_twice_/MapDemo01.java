package cc120_map_say_twice_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 统计每个单词出现的次数：
 * 存储到MAP中：
 * key:String
 * Value:自定义类型（此处的VALUE为出现的次数，但是不宜用Integer）
 * 
 * ”分拣“思路
 * 1.为所有的KEY创建MAP容器，之后再容器中存放VALUE(次数):test1
 * 2.第一次创建容器，存放VALUE，第二次直接使用容器存放VAlue
 * @author Administrator
 *
 */
public class MapDemo01 {

	public static void main(String[] args) {
		String str="this is a cat and that is a mice and where is the food";
		String[] strArray =str.split(" "); 
		Map<String, Letter> letters =new HashMap<String, Letter>();
		
		for (String temp:strArray) {
			/*//第一步
			if (!letters.containsKey(temp)) {
				Letter con =new Letter();
				con.setCount(1);//第一次存放
				letters.put(temp,con);//向MAP容器letter中put一个键值对
			}else {
				Letter con =letter.get(temp);//通过键temp获取letter这个MAP的值，也就是Letter
				con.setCount(con.getCount()+1);
			}
		}*/
			//优化上述代码
			Letter con=null;
			if (null==(con=letters.get(temp))) {
				con=new Letter();
				con.setCount(1);//第一次存放
				letters.put(temp,con);//
			}else {
				con.setCount(con.getCount()+1);
			}
		}
		
		Set<String> keys =letters.keySet();//将letters中的key存放如keys中
		for (String key : keys) {
			Letter con =letters.get(key);
			System.out.println("letter :"+key+",次数: "+con.getCount());
		}
	
	}
	public static void test1() {
		String str="this is a cat and that is a mice adn where isthe food";
		String[] strArray =str.split(" "); 
		Map<String, Letter> letters =new HashMap<String, Letter>();
		/* 1
		for (String temp:strArray) {
			
			if (!letter.containsKey(temp)) {
				letter.put(temp,new Letter());
			}
		}
		for (String temp:strArray) {
			Letter con =letter.get(temp);
			con.setCount(con.getCount()+1);
		}
		*/	
		//合并上述2个循环：
		for (String temp:strArray) {
			//第一步
			if (!letters.containsKey(temp)) {
				letters.put(temp,new Letter());//创建Letter：键是temp（字符串单词），值是Letter
			}
			//第二步
			Letter con =letters.get(temp);//通过键temp获取letter这个MAP的值，也就是Letter
			con.setCount(con.getCount()+1);//存放：将Letter中的count+1
		}
		//以上过程总其实Letter中的name属性是没有改变的，所以name是NULL
		//输出MAP
		Set<String> keys =letters.keySet();//将letter中的key存放如keys中
		for (String key : keys) {
			Letter con =letters.get(key);
			System.out.println("letter :"+key+",次数: "+con.getCount());
		}
		
	}

}
