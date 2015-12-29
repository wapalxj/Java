package ZGUI_2_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollDemo {

    static JFrame jframe = new JFrame("Example");

    public static void setupFrame() {
        jframe.setSize(200,200);
        jframe.getContentPane().setLayout( new FlowLayout() );

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        };
        jframe.addWindowListener(l);
    }

    public static void main(String[] args) {
        setupFrame();

        MyPicJPanel mjp = new MyPicJPanel();
        JScrollPane jsp = new JScrollPane( mjp );
        jsp.setPreferredSize( new Dimension(300, 150));
        jframe.getContentPane().add(jsp);


        jframe.setVisible(true);
        mjp.requestFocus();

    }
}

class MyPicJPanel extends JPanel {
    JLabel jl = new JLabel(new ImageIcon( "bmw.jpg"));
    { add(jl);   // instance initializer
    }
}

