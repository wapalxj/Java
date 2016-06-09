package CC169_Thread;
/*
 * 静态代理设计模式:此例中的WeddingCompany就类似于Thread
 */
public class T2_staticProxy {

	public static void main(String[] args) {
		//创建真实角色
		You you=new You();
		//创建代理角色+真实角色的引用
		WeddingCompany company=new WeddingCompany(you);
		//执行任务
		company.marry();
	}

}

//接口(相当于Runable)
interface Marry{
	public void marry();//(相当于run)
}
//真实角色
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("marry me!");
	}
}

//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany() {
	
	}
	public WeddingCompany(Marry you) {
		this.you=you;
	}
	private void before() {
		System.out.println("布置猪窝!");
	}
	private void after() {
		System.out.println("闹洞房!");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}
