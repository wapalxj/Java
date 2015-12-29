package ZGUI_2_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptDemo {

    static JFrame jframe = new JFrame("Example");

    public static void setupFrame() {
        jframe.setSize(400,100);
        jframe.setVisible(true);
        jframe.getContentPane().setLayout( new FlowLayout() );

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        };
        jframe.addWindowListener(l);
    }

    public static void main(String[] args) {
        setupFrame();

        Icon spicon = new ImageIcon("spam.jpg");
        JLabel jl = new JLabel("Are you getting enough?", spicon, JLabel.CENTER);

        JOptionPane.showMessageDialog( jframe, // parent 
                                       jl,   // Object to display
                                       "Plenty of spam",
                                       JOptionPane.QUESTION_MESSAGE );
    }
}
