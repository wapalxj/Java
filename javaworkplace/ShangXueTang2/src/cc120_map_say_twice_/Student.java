package cc120_map_say_twice_;

public class Student {
	private String name;
	private String no;
	private double score;
	
	public Student() {
		super();
	}

	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student[name=" +name+",id="+no+",score="+score+"]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNO(String no) {
		this.no = no;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}
