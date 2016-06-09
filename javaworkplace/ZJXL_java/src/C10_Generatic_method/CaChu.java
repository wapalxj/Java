package C10_Generatic_method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 擦除:编译时：编译器会将<>中的类型转为Object
 * @author Administrator
 *
 */
public class CaChu <T,V>{
    T obj1=null;
    V obj2=null;

    //因为擦除，下面两个方法不能同时存在
    void setValue(T obj){

    }
//  void setValue(V obj){
//
//  }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList =new ArrayList<String>();
		List<Integer> intList =new ArrayList<Integer>();
				
		System.out.println(
				strList.getClass()==intList.getClass()//因为擦除原理，两个类型都会是Object
				);
		
	}

}
