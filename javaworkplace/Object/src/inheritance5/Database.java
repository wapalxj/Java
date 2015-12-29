package inheritance5;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> item =new ArrayList<Item>();
	
	public void add(Item i)
	{
		item.add(i);
	}
	public void list()
	{
		for (Item i:item) 
		{
			i.print();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
