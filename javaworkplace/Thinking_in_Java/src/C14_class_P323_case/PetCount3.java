package C14_class_P323_case;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.mindview.util.MapData;
import static net.mindview.util.Print.*;
/**
 * 动态instanceof
 * @author mgh2569702
 *
 */
public class PetCount3 {
	public static void main(String[] args) {
		 PetCounter petCounter=new PetCounter();
		 for (Pet pet : Pets.createArray(20)) {//效果和下行一样
//		 for (Pet pet : new ForNameCreator().createArray(20)) {
			printnb(pet.getClass().getSimpleName()+" ");
			petCounter.count(pet);
		 }
		 print();
		 print(petCounter);
	}
	 
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter() {
			//预加载所有不同的Pet类
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		public void count(Pet pet) {
			//Class.isInstance() eliminates instanceofs:
			for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()) {
				if (pair.getKey().isInstance(pet)) {
					put(pair.getKey(), pair.getValue()+1);
				}
			}
		}
		
		@Override
		public String toString() {
			StringBuilder result=new StringBuilder("{");
			for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			result.delete(result.length()-2, result.length());
			result.append("}");
			return result.toString();
		}
	 }
	
}