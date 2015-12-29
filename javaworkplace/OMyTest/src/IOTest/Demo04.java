package IOTest;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 5.����Ŀ¼��
	mkdir() //����Ŀ¼:����ȷ����Ŀ¼���ڣ���������ڣ�����ʧ��
	mkdirs()//����Ŀ¼�������Ŀ¼�������ڣ���һͬ����
	list()//�ļ���Ŀ¼�ַ�����ʽ(Ŀ¼�а��������ļ���Ŀ¼)
	listFires()//
	static listRoots()//

 */
public class Demo04 {

	public static void main(String[] args) {
//		String path ="E:/others/p/p1";//����src.mkdir();
//		String path ="E:/others/p1/p2/p3/test";//����src.mkdirs();
		String path ="E:/others/p3";//����src.list()
		File src =new File(path);
//		src.mkdir();//����Ŀ¼:����ȷ����Ŀ¼���ڣ���������ڣ�����ʧ��
//		src.mkdirs();
		
		if (src.isDirectory()) {
			System.out.println("====��Ŀ¼�ļ���======");
			String [] subNames=src.list();
			for (String temp : subNames) {
				System.out.println(temp);
			}
			
			System.out.println("====��Ŀ¼File����======");
			File[]  subFiles =src.listFiles();
			for (File temp : subFiles) {
				System.out.println(temp);
			}
			
			System.out.println("====���ļ�.java����======");
			//�������ģʽ
			subFiles =src.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					/*
					 * dir �ʹ���src
					 */
//					System.out.println(dir.getAbsolutePath());
					//�������ļ����������ļ��У��Һ�׺Ϊ.java
					return new File(dir,name).isFile()&&name.endsWith(".java");
				}
			});
			for (File temp : subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
		}
	}

}
