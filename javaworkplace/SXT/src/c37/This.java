package c37;

import c31.Computer;

public class This {

	String name;
	int id;
	
	public This(String name,int id)
	{
		this(name);//调用另外一个构造器,此代码必须放在第一行
		this.name=name;
		this.id=id;
	}
	public This(String name)
	{

		this.name=name;
		this.id=id;
	}
	public void sayHello(String sname) {
		System.out.println(sname+": hello!");
	}
	
	public void study() {
		System.out.println("studying!");
	}
}
