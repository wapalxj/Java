package cc120_map_say_twice_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ͳ��ÿ�����ʳ��ֵĴ�����
 * �洢��MAP�У�
 * key:String
 * Value:�Զ������ͣ��˴���VALUEΪ���ֵĴ��������ǲ�����Integer��
 * 
 * ���ּ�˼·
 * 1.Ϊ���е�KEY����MAP������֮���������д��VALUE(����):test1
 * 2.��һ�δ������������VALUE���ڶ���ֱ��ʹ���������VAlue
 * @author Administrator
 *
 */
public class MapDemo01 {

	public static void main(String[] args) {
		String str="this is a cat and that is a mice and where is the food";
		String[] strArray =str.split(" "); 
		Map<String, Letter> letters =new HashMap<String, Letter>();
		
		for (String temp:strArray) {
			/*//��һ��
			if (!letters.containsKey(temp)) {
				Letter con =new Letter();
				con.setCount(1);//��һ�δ��
				letters.put(temp,con);//��MAP����letter��putһ����ֵ��
			}else {
				Letter con =letter.get(temp);//ͨ����temp��ȡletter���MAP��ֵ��Ҳ����Letter
				con.setCount(con.getCount()+1);
			}
		}*/
			//�Ż���������
			Letter con=null;
			if (null==(con=letters.get(temp))) {
				con=new Letter();
				con.setCount(1);//��һ�δ��
				letters.put(temp,con);//
			}else {
				con.setCount(con.getCount()+1);
			}
		}
		
		Set<String> keys =letters.keySet();//��letters�е�key�����keys��
		for (String key : keys) {
			Letter con =letters.get(key);
			System.out.println("letter :"+key+",����: "+con.getCount());
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
		//�ϲ�����2��ѭ����
		for (String temp:strArray) {
			//��һ��
			if (!letters.containsKey(temp)) {
				letters.put(temp,new Letter());//����Letter������temp���ַ������ʣ���ֵ��Letter
			}
			//�ڶ���
			Letter con =letters.get(temp);//ͨ����temp��ȡletter���MAP��ֵ��Ҳ����Letter
			con.setCount(con.getCount()+1);//��ţ���Letter�е�count+1
		}
		//���Ϲ�������ʵLetter�е�name������û�иı�ģ�����name��NULL
		//���MAP
		Set<String> keys =letters.keySet();//��letter�е�key�����keys��
		for (String key : keys) {
			Letter con =letters.get(key);
			System.out.println("letter :"+key+",����: "+con.getCount());
		}
		
	}

}
