package C14_class_P323_case;

public class PetCount4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TypeCounter counter=new TypeCounter(Pet.class);
		for (Pet pet:Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);

	}

}
