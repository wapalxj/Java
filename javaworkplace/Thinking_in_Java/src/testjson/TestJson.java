package testjson;

import net.sf.json.JSONObject;
import testjson.User.Gender;

public class TestJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User();
		user.setUsername("vero");
		user.setGender(Gender.MALE);
		user.setExistence(true);
		user.setHasRecords(true);
		
		JSONObject object=new JSONObject();
		object.put("aaa", "sssss");
//		JSONObject jsonObject=JSONObject.fromObject(user);
//		
//		System.out.println(jsonObject.toString());
	}

}
