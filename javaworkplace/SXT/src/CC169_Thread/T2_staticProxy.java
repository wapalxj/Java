package CC169_Thread;
/*
 * ��̬�������ģʽ:�����е�WeddingCompany��������Thread
 */
public class T2_staticProxy {

	public static void main(String[] args) {
		//������ʵ��ɫ
		You you=new You();
		//���������ɫ+��ʵ��ɫ������
		WeddingCompany company=new WeddingCompany(you);
		//ִ������
		company.marry();

	}

}

//�ӿ�(�൱��Runable)
interface Marry{
	public void marry();//(�൱��run)
}
//��ʵ��ɫ
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("marry me!");
	}
}

//�����ɫ
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany() {
	
	}
	public WeddingCompany(Marry you) {
		this.you=you;
	}
	private void before() {
		System.out.println("��������!");
	}
	private void after() {
		System.out.println("�ֶ���!");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}
