package CC132_OtherCollection_ReferenceAndRefMap;

import java.lang.ref.WeakReference;

/*
 *ǿ��������
 */
public class Demo_0Ref {

	public static void main(String[] args) {
		//�ַ�������ֵ�����ܻ��գ�
//		String str ="vero";
		//�ַ��������ܻ��գ�
		String str =new String("vero");
		//�����ù������
		WeakReference<String>  wr=new WeakReference<String>(str);
		
		System.out.println("gc����ǰ:"+wr.get());
		//�Ͽ�����
		str=null;
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println("gc���к�:"+wr.get());
	}

}
