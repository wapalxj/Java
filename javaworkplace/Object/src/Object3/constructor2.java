package Object3;

import java.util.Scanner;

//���й���������
public class constructor2 {
	private int price=100;
	private int banlance;
	private int total;
	private String name="";
	
	
	public constructor2(int price,String name) {
		this.price=price;
		this.name=name;
	}

	public void showPrompt()//��stastic�ķ���,ֻ���ɶ���������,��ʼ
	{
		System.out.println("welcome to "+this.name+" Line!");
		System.out.println("the price is : "+price+" please input");
	}
	public void insertMoney(int bill)//ͶǮ
	{
		banlance+=bill;
		printBlance();
	}
	public void printTicket()//��Ʊ��������
	{
		if(banlance>=price)
		{
			System.out.println("The ticket!");
			if(banlance>price)
			{
				System.out.println("Change is :"+(banlance-price));	
			}
			banlance-=price;
		}
		
	}
	public void printBlance()//��ʾͶ���Ǯ
	{
		System.out.println("the banlance is :"+banlance);
	}
	public boolean isEnough()//Ͷ���Ǯ�Ƿ����
	{
		return banlance>=price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		constructor2 tm =new constructor2(80,"asdf");
		tm.showPrompt();
		int bill;
		do
		{
			bill=in.nextInt();
			tm.insertMoney(bill);
			if(tm.isEnough())
			{
			   tm.printTicket();
			   break;
			}
		}while(true);
	}

}

