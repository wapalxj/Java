package CC15_5_Works;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class Co5_WordsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> wordsTable1 =new HashSet<>();
		Set<String> wordsTable2 =new HashSet<>();
		wordsTable1.add("one");
		wordsTable1.add("two");
		wordsTable1.add("three");
		wordsTable1.add("four");
		wordsTable1.add("five");
		wordsTable2.add("one");
		wordsTable2.add("five");
		wordsTable2.add("xis");
		wordsTable2.add("seven");
		wordsTable2.add("ten");
		
		wordsTable1.addAll(wordsTable2);
		
		System.out.println("没排序之前：");
		Iterator<String> it1 =wordsTable1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("排序之后：");
		List<String> wordsList = new ArrayList<String>();
		for (String set : wordsTable1) {
			wordsList.add(set);
		}
		Collections.sort(wordsList);
		
		Iterator<String> it =wordsList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
