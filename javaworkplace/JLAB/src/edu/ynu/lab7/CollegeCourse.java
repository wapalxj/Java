package edu.ynu.lab7;

public class CollegeCourse {
	
	protected int courseId;
	
	public CollegeCourse(int Cid) {
		this.courseId=Cid;
	}
	public double Cost(){
		double price;
		switch (this.courseId) {
		case 1:
			price= 180;
			break;
		case 2:
			price= 120;
			break;
		case 3:
			price= 200;
			break;
		default:price= 0;
			break;
		}
		return price;
	}
}

