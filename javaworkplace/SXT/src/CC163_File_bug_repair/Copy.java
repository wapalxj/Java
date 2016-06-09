package CC163_File_bug_repair;

import CC146_IO_Stream.FileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �����
 * 1.��Ŀ¼��������ĸ���Ŀ¼���߳�
 * 2.ɾ��������޳����ļ���
 */
public class Copy {
	public static void main(String[] args) {
		//����Ŀ¼��������Ŀ¼��
		String srcPath="F:/others/ccc";
		String destPath="F:/others/ccc/cccbb";
		copyDir(srcPath,destPath);
		
		
	}
	/*
	 *�����ļ���
	 */
	public static void copyDir(String srcPath,String destPath) {
		File src =new File(srcPath);
		File dest =new File(destPath);
		copyDir(src,dest);
		
	}
	/*
	 *�����ļ���
	 */
	public static void copyDir(File src,File dest) {
		if (src.isDirectory()) {
			dest =new File(dest,src.getName());
			//�жϸ�Ŀ¼�Ƿ������Ŀ¼���������׳��쳣
			if (dest.getAbsolutePath().contains(src.getAbsolutePath())){
				try {
					throw new Exception("��Ŀ¼���ܿ�������Ŀ¼�У�����");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		copyDirDetail(src,dest);
	}
	/*
	 * ����ϸ��
	 */
	public static void copyDirDetail(File src,File dest) {
		if (src.isFile()) {
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(src.isDirectory()){
			dest.mkdirs();//ȷ��Ŀ¼�ļ��д���
			for (File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest,sub.getName()));
				
			}
		}	
	}

}
