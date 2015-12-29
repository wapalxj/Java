package c50_Callback;

import java.awt.Graphics;

public abstract class MyFrame {
	public abstract void  paint();
}

interface IMyFrame{
	void paint();
}

class GameFrame01 implements IMyFrame{
	public void paint() {
		System.out.println("01");
		System.out.println("01画出来");
	}
}

class GameFrame02 extends MyFrame{
	public void paint() {
		System.out.println("02");
		System.out.println("02画出来");
	}
}

class GameFrame03 implements IMyFrame{
	public void paint() {
		System.out.println("03");
		System.out.println("03画出来");
	}
}