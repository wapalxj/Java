package C10_Generatic_method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����:����ʱ���������Ὣ<>�е�����תΪObject
 * @author Administrator
 *
 */
public class CaChu <T,V>{
    T obj1=null;
    V obj2=null;

    //��Ϊ����������������������ͬʱ����
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
				strList.getClass()==intList.getClass()//��Ϊ����ԭ���������Ͷ�����Object
				);
		
	}

}
