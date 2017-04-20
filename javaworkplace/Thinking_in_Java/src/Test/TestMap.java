package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> answers =new HashMap<>();
		answers.put(20, 0);
		answers.put(10, 1);
		answers.put(16, 2);
		
		JSONArray array=new JSONArray();
		Set<Integer> questionIds=answers.keySet();
		Iterator<Integer> it=questionIds.iterator();
		while (it.hasNext()) {
			Integer id=it.next();
			Integer answer=answers.get(id);
			JSONObject jsonData=new JSONObject();
			try {
				jsonData.put("questionId", id);
				jsonData.put("answer", answer);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			array.add(jsonData);
		}
		System.out.println(array.toString());
	}

}
