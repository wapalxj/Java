package ZGUI_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonClickTest {
    
    static JFrame frame = new JFrame("Example");

    public static void setupFrame() {
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        setupFrame();
        JButton jb = new JButton("pressure");
       jb.addActionListener( new ActionListener() {
                int i = 1;
                public void actionPerformed(ActionEvent e) 
                {
                    System.out.println("pressed "+ i++); }
              } );
        frame.getContentPane().add( jb );
        frame.setVisible(true);
    }
}
