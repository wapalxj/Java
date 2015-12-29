
package C11_innerclass;

/**
@version 1.10 2004-02-27
@author Cay Horstmann
*/
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TalkingClockTest2
{  
	public static void main(String[] args)
	{  
	   TalkingClock clock = new TalkingClock(1000, true);
	   clock.start();
	
	   // keep program running until user selects "Ok"
	   JOptionPane.showMessageDialog(null, "Quit program?");
	   System.exit(0);
	}
}

/**
A clock that prints the time in regular intervals.
*/
class TalkingClock2
{  
/**
   Constructs a talking clock
   @param interval the interval between messages (in milliseconds)
   @param beep true if the clock should beep
*/
	public TalkingClock2(int interval, boolean beep)
	{  
	   this.interval = interval;
	   this.beep = beep;
	}
	
	/**
	   Starts the clock.
	*/
	public void start()
	{//�����ڲ���
	   ActionListener listener = new 
	     ActionListener (){
		   
			 public void actionPerformed(ActionEvent event)
			 {
		 	 Date now = new Date();
		      System.out.println("At the tone, the time is " + now);
		      if (beep) Toolkit.getDefaultToolkit().beep();
			 }
		 
	   };
	   
	   Timer t = new Timer(interval, listener);
	   t.start();
	}
	
	private int interval;
	private boolean beep;
	

}
