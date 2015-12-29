import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ZZZ extends JFrame {
	BufferedImage img=null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BufferedImage img =null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZZZ frame = new ZZZ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZZZ() {
		super();
		this.setResizable(false);
		try {
			img=ImageIO.read(getClass().getResourceAsStream("fl2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(){
			protected void paintComponent(Graphics g) {
				if (img!=null) {
					g.drawImage(img, 1, 1, getWidth()-1, getHeight()-1, null);
					
				}
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuick = new JButton("QUICK");
		btnQuick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnQuick.setBounds(119, 228, 93, 23);
		contentPane.add(btnQuick);
		
		JButton btnSlow = new JButton("SLOW");
		btnSlow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSlow.setBounds(258, 228, 93, 23);
		contentPane.add(btnSlow);
	}
}
