package clock4;
//��Ա����������ֶΡ�
//���ر����������еı�����
//������Ϊ��Ա����
public class clock {
	private clockDisplay hour =new clockDisplay(24);
	private clockDisplay minute=new clockDisplay(60);
	
	public void tick() {
		this.minute.tick();
		if(this.minute.getValue()==0)
			this.hour.tick();
		
	}

	public void show() {
//		System.out.println(hour.getValue()+":"+minute.getValue());
//		System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
		System.out.println(this.hour+":"+this.minute);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clock c =new clock();
		while (true)
		{
			c.tick();
			c.show();
		}
	}

}
