package CC128_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	public static enum Face { Ace, Deuce, Three, Four, Five, Six,
		   Seven, Eight, Nine, Ten, Jack, Queen, King  };
		   
	public static void main(String[] args) {
		/*
		 * 模拟都地主
		 */
		List<Integer> cards =new ArrayList<Integer>();
		cards.add(1);
		cards.add(2);
		cards.add(3);
		cards.add(4);
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
		Collections.shuffle(cards);
		List<Integer> p1 =new ArrayList<Integer>();
		List<Integer> p2 =new ArrayList<Integer>();
		List<Integer> p3 =new ArrayList<Integer>();
		List<Integer> last =new ArrayList<Integer>();
		
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		System.out.println("第1个人："+p1);
		System.out.println("第2个人："+p2);
		System.out.println("第3个人："+p3);
		System.out.println("底牌："+last);
		
		
	}

}
