package C14_class_P323_case;

import java.util.ArrayList;
import java.util.List;
/**
 * 使用类名
 * @author mgh2569702
 *
 */
public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types=
			new ArrayList<>();
	
	private static String[] typeNames={
		"C14_class.P323_case.Mutt",
		"C14_class.P323_case.Pug",
		"C14_class.P323_case.EgyptianMau",
		"C14_class.P323_case.Manx",
		"C14_class.P323_case.Cymric",
		"C14_class.P323_case.Rat",
		"C14_class.P323_case.Mouse",
		"C14_class.P323_case.Hamster",
	};
	static{loader();}
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		for (String name:typeNames) {
			try {
				types.add((Class<? extends Pet>) Class.forName(name));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
}
