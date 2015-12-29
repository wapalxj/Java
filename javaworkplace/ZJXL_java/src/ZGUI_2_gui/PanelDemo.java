package ZGUI_2_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelDemo {

    static JFrame jframe = new JFrame("Example");

    public static void setupFrame() {
        jframe.setSize(400,300);
        jframe.getContentPane().setLayout( new FlowLayout() );

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        };
        jframe.addWindowListener(l);
    }

    public static void main(String[] args) {
        setupFrame();

        MyJPanel mjp = new MyJPanel();
        jframe.getContentPane().add(mjp);


        jframe.setVisible(true);
        mjp.requestFocus();

    }
}

class MyJPanel extends JPanel {
    JLabel jl = new JLabel(new ImageIcon("bmw.jpg"));
    //使用代码初始化块
    { 
    	add(jl);   // instance initializer
        addKeyListener( new KeyAdapter() {
          public void keyPressed(KeyEvent e) {
          char c = e.getKeyChar();
          System.out.println("got char "+c);
          }
        } );
    }
}

