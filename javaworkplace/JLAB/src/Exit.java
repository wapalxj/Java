import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Exit extends JFrame {

	private JPanel contentPane;
        
      public static void main(String[] args) {
          EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            try {
                                    Exit frame = new Exit();
                                    frame.setVisible(true);
                            } catch (Exception e) {
                                    e.printStackTrace();
                            }
                    }
            });
      
    }

	public Exit() {
		setUndecorated(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
                setBackground(new Color(150,255,0));
//		setBounds(700, 500, 450, 300);
                this.setSize(450, 300);
		contentPane = new JPanel(){
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(new Color(255,0,0));
				g.setFont(new Font(null, 30, 30));
				g.drawString("你确定要退出吗？", 100, 100);
				}
	                
		};
        contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("return");
//                btnExit.setUI(new UI.MyButtonUI());
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.exit(0);
                            dispose();
			}
		});
		btnExit.setBounds(244, 267, 93, 23);
		contentPane.add(btnExit);
		
                
                
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                setLocation(screenSize.width / 2 -this.getWidth()/2 , screenSize.height / 2 -this.getHeight()/2 );
           
	
        
        }
}
