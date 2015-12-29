package cc120_map_say_twice_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cc118_Ge3.Array;

/**
 * 将若干个student放入List,计算每个班级的总平均分
 * @author Administrator
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		List<Student> list =new ArrayList<Student>();
		exam(list);
		
		
		Map<String, ClassRoom> rooms =new HashMap<String, ClassRoom>();
		count(rooms,list);
		printScore(rooms);
	
	}
	/**
	 * 打印总分和平均分
	 * @param rooms
	 * @param list
	 */
	public static void printScore(Map<String, ClassRoom> rooms) {
		Set<Map.Entry<String, ClassRoom>> entrySet =rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>> it =entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, ClassRoom> entry =it.next();
			ClassRoom room =entry.getValue();
			double avg =room.getTotal()/room.getStus().size();
			System.out.println("班级号为："+room.getNo()+",总分: "+room.getTotal()
					+"平均分： "+avg);
			
		}
		
		
		
		
	}
	public static void count(Map<String, ClassRoom> rooms,List<Student> list) {
		for (Student stu:list) {
			String no =stu.getNo();
			double score =stu.getScore();
			//根据班级编号查看MAP中是否存在这个班级-》分拣
			ClassRoom room =rooms.get(no);
			if (null==room) {//第一次：创建
				room=new ClassRoom(no);
				rooms.put(no, room);
			}
			//第二次：存储总分
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);//将学生加进去（.getStus()返回值是一个数组列表）
		}
	}
	public static void exam(List<Student> list) {
		list.add(new Student("a","001",70));
		list.add(new Student("b","001",80));
		list.add(new Student("c","003",90));
		list.add(new Student("d","004",80));
		list.add(new Student("e","005",60));
		
	}
}
