package c50_Callback;

public class PaintFrame {
	public static void  drawFrame(IMyFrame f) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣ��");
		
		f.paint();
		System.out.println("��������");
	}

	public static void main(String[] args) {
	
		PaintFrame.drawFrame(new GameFrame03());
	}
}
