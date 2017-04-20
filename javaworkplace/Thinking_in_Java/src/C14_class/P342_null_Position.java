package C14_class;

public class P342_null_Position {

	/**
	 * @param args
	 * 空对象
	 */
	public static void main(String[] args) {
	}

}

class Position{
	private String title;
	private Person person;
	public Position(String jobTitle,Person emplyee) {
		this.title=jobTitle;
		this.person=person;
		if (person==null) {
			person=Person.NULL;
		}
	}
	public Position(String jobTitle) {
		this.title=jobTitle;
		person=Person.NULL;
		
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String newTitle) {
		this.title=newTitle;
	}
	
	public Person getPerson(){
		return this.person;
	}
	public void setPerson(Person newPerson) {
		this.person=newPerson;
		if (person==null) {
			person=Person.NULL;
		}
	}
	@Override
	public String toString() {
		return "Position:"+title+" "+person;
	}
}
