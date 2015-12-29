package edu.ynu.lab7;

public class Lab extends CollegeCourse{
	public Lab(int Cid) {
		super(Cid);
	}
	public double Cost(){
		double fee;
		switch (this.courseId) {
		case 1:
			fee= 25;
			break;
		case 2:
			fee= 35;
			break;
		case 3:
			fee= 25;
			break;
		default:
			fee= 0;
			break;
		}
		
		return fee;

	}
}