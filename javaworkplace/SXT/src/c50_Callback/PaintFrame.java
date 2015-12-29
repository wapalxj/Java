package c50_Callback;

public class PaintFrame {
	public static void  drawFrame(IMyFrame f) {
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息线");
		
		f.paint();
		System.out.println("启动缓存");
	}

	public static void main(String[] args) {
	
		PaintFrame.drawFrame(new GameFrame03());
	}
}
