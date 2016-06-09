package CC203_httpserver_Polymorphism;

/*
 * 抽象
 */
public abstract class Servlet {

	public void service(Request req, Response res) throws Exception {
		//正文内容

		this.doGet(req,res);
		this.doPost(req,res);

	}

	public abstract  void doGet(Request req, Response res)throws Exception;
	public abstract  void doPost(Request req, Response res)throws Exception;
}


