package Object3;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

//������
public class TicketMachine1 {
	private int price=100;
	private int banlance;
	private int total;

	public void showPrompt()//��stastic�ķ���,ֻ���ɶ���������,��ʼ
	{
		System.out.println("welcome!");
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
		TicketMachine1 tm =new TicketMachine1();
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
