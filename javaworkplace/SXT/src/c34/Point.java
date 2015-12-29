package c34;

public class Point {
	double x,y,z;
	

	public Point (double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public void setZ(double z)
	{
		this.z=z;
	}
	public double distance(Point p)
	{
	return 	Math.sqrt((this.x-p.x)*(this.x-p.x)+
			(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.y-p.y)); 
	}
	
public static void main(String[] args) {
	Point p=new Point(1.0, 0, 0);
	Point p2=new Point(0, 1.0, 0);
	
	System.out.println(p.distance(p2));
}	
}
