package c45_poly;

public class TestVoice {

	public static void testVoice(Animalv c) {
		c.voice();
		if (c instanceof Cat) {//�ж�c���ǲ���Cat��Ķ���
			((Cat) c).catchMouse();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animalv c= new Cat();//�������ø�ֵΪ�������
		Animalv d =new Dog();
		Animalv p =new Pig();
		testVoice(c);	
		testVoice(d);
		testVoice(p);
		
		Cat c2 =(Cat)c;//ǿ��ת��
		c2.catchMouse();//ת��������ܵ����������
		
//		Cat c3=(Cat)p;//���г���Pig�಻��ת��ΪCat��
	}

}
