package C14_class_P323_case;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.RtMethodGenerator;

/**
 * 使用类字面量
 * @author mgh2569702
 *
 */
public class LiteralPetCreator extends PetCreator{
	public static final List<Class<? extends Pet>> allTypes=
		Collections.unmodifiableList(
			Arrays.asList(
				Pet.class,Dog.class,Cat.class,Rodent.class,
				Mutt.class,Pug.class,EgyptianMau.class,Manx.class,
				Cymric.class,Rat.class,Mouse.class,Hamster.class
			)
		)
	;
	
	private static final List<Class<? extends Pet>> types=
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
//	public static void main(String[] args) {
//		System.out.println(types);
//	}
}
