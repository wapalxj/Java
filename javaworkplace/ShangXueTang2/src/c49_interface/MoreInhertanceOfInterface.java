package c49_interface;

public interface MoreInhertanceOfInterface {
	void aaa();
}

interface MoreB {
	void bbb();
}

interface MoreC extends MoreInhertanceOfInterface,MoreB {
	void ccc();
}

class TestClass implements MoreC{//多继承必须重写所继承类的所有方法
	public void aaa() {
		
	}
	public void bbb() {
		
	}
	public void ccc() {
		
	}
}