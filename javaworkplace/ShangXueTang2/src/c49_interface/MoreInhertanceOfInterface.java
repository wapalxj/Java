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

class TestClass implements MoreC{//��̳б�����д���̳�������з���
	public void aaa() {
		
	}
	public void bbb() {
		
	}
	public void ccc() {
		
	}
}