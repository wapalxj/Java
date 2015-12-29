package cc120_map_say_twice_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cc118_Ge3.Array;

/**
 * �����ɸ�student����List,����ÿ���༶����ƽ����
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
	 * ��ӡ�ֺܷ�ƽ����
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
			System.out.println("�༶��Ϊ��"+room.getNo()+",�ܷ�: "+room.getTotal()
					+"ƽ���֣� "+avg);
			
		}
		
		
		
		
	}
	public static void count(Map<String, ClassRoom> rooms,List<Student> list) {
		for (Student stu:list) {
			String no =stu.getNo();
			double score =stu.getScore();
			//���ݰ༶��Ų鿴MAP���Ƿ��������༶-���ּ�
			ClassRoom room =rooms.get(no);
			if (null==room) {//��һ�Σ�����
				room=new ClassRoom(no);
				rooms.put(no, room);
			}
			//�ڶ��Σ��洢�ܷ�
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);//��ѧ���ӽ�ȥ��.getStus()����ֵ��һ�������б�
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
