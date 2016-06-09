package T5;

public class Person {
	private String title;
	private String firstname;
	private String lastname;
	private String nickname;
	private int age;
	private boolean sex;
	
	public  Person() {}
	public  Person(String title,String firstname,
			String lastname,String nickname,int age,boolean sex) {
		this.title=title;
		this.firstname=firstname;
		setLastname(lastname);
		this.nickname=nickname;
		this.age=age;
		this.sex=sex;
	}
	public void setTitle(String title) {
		this.title=title.trim();
	}
	public String getTitle() {
		return title;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname.trim();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname.trim();
	}
	public String getLastname() {
		return lastname;
	}
	public void setNickname(String nickname) {
		this.nickname=nickname.trim();
	}
	public String getNickname() {
		return nickname;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSex(boolean sex) {
		this.sex=sex;
	}
	public boolean getSex() {
		return sex;
	}
	public String standardName() {
		return this.firstname+this.lastname;
	}
	public String formalName() {
		return this.title+this.firstname+this.lastname;
	}
	public String casualName() {
		if (this.nickname!=null) {
			 return getNickname();
		}
		else {
			return this.firstname;
		}
	}

}
