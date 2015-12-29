package C12_OOPTech;

import java.util.*;

public class CloneTest
{  
   public static void main(String[] args)
   {  
      try
      {
         Employee2 original = new Employee2("John Q. Public", 50000); 
         original.setHireDay(2000, 1, 1);
         
         Employee2 copy = original.clone();
         
         System.out.println("original=" + original);
         System.out.println("origcopy=" + copy);
         
         System.out.println(original==copy);
         System.out.println("ccccccc : "+original.equals(copy));
         
         System.out.println(original.getHireDay()==copy.getHireDay()); 
         System.out.println(original.getHireDay().equals(copy.getHireDay()));
      }
      catch (CloneNotSupportedException e) 
      { 
         e.printStackTrace(); 
      }
   }
}

class Employee2 implements Cloneable
{  
   public Employee2(String n, double s)
   {  
      name = n;
      salary = s;
   }

   public Employee2 clone() throws CloneNotSupportedException
   {
      // call Object.clone()
      Employee2 cloned = (Employee2)super.clone(); 
      
      // clone mutable fields
      cloned.hireDay = (Date)hireDay.clone();
      
      return cloned;
   }

   /**
      Set the hire day to a given date
      @param year the year of the hire day
      @param month the month of the hire day
      @param day the day of the hire day
   */
   public void setHireDay(int year, int month, int day)
   {
      hireDay = new GregorianCalendar(year, month - 1, day).getTime();
   }
   public Date  getHireDay(){
       return hireDay;
   }

  //比较函数为作业
   public boolean equals(Object o) {
		if (!(o instanceof Employee2)) {
			 return false;
		}
		else{
			Employee2 obj=(Employee2) o;
			return((this.hireDay.equals(obj.hireDay))&&//注意这里
				(this.name==obj.name)&&
				(this.salary==obj.salary));
		}	
   }
   public String toString()
   {
      return "Employee[name=" + name
         + ",salary=" + salary
         + ",hireDay=" + hireDay
         + "]";
   }


   public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void setHireDay(Date hireDay) {
	this.hireDay = hireDay;
}


private String name;
   private double salary;
   private Date hireDay;
}
