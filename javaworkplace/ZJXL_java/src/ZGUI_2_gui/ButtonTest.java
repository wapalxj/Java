package ZGUI_2_gui;

//Fig. 14.16: ButtonTest.java
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//Testing ButtonFrame.
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonTest 
{
	public static void main( String[] args )
	{ 
		   ButtonFrame buttonFrame = new ButtonFrame(); // create ButtonFrame
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 275, 140 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	} // end main
} // end class ButtonTest

class ButtonFrame extends JFrame 
{
	private JButton plainJButton; // button with just text
	private JButton fancyJButton; // button with icons
	
	// ButtonFrame adds JButtons to JFrame
	public ButtonFrame()
	{
		   super( "Testing Buttons" );
		   setLayout( new FlowLayout() ); // set frame layout
		
		   plainJButton = new JButton( "Plain Button" ); // button with text
		   add( plainJButton ); // add plainJButton to JFrame
		
		   Icon bug1 = new ImageIcon(  "bug1.gif"  );
		   Icon bug2 = new ImageIcon(  "bug2.gif"  );
		   fancyJButton = new JButton( "Fancy Button", bug1 ); // set image
		   fancyJButton.setRolloverIcon( bug2 ); // set rollover image
		   add( fancyJButton ); // add fancyJButton to JFrame
		
		   // create new ButtonHandler for button event handling 
		   ButtonHandler handler = new ButtonHandler();
		   fancyJButton.addActionListener( handler );
		   plainJButton.addActionListener( handler );
	} // end ButtonFrame constructor
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener 
	{
	   // handle button event
	   public void actionPerformed( ActionEvent event )
	   {
	      JOptionPane.showMessageDialog( ButtonFrame.this, String.format(
	         "You pressed: %s", event.getActionCommand() ) );
	   } // end method actionPerformed
	} // end private inner class ButtonHandler
} // end class ButtonFrame

