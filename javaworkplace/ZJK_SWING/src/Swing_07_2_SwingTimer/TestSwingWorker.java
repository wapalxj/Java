package Swing_07_2_SwingTimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;

import com.sun.imageio.plugins.common.InputStreamAdapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JTextArea;

public class TestSwingWorker extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	JTextArea textArea ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSwingWorker frame = new TestSwingWorker();
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
	public TestSwingWorker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("run");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			//��ȡ����ķ���
			public void mouseClicked(MouseEvent e) {
				webRead();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	/*
	 * ��������������
	 */
	public void webRead() {
		//<T,V>:TΪִ�н�������ص����ͣ�VΪ�м�������������
		new SwingWorker<StringBuilder, String>() {
			@Override
			protected StringBuilder doInBackground() throws Exception {
				URL url =new URL("http://www.apache.org");
				URLConnection connection =url.openConnection();
				BufferedReader reader =new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
 				String line;
 				StringBuilder builder=new StringBuilder();
 				while (null!=(line=reader.readLine())) {
//					publish(line);//����1�����м�Ľ��һ��һ�λᴫ�뵽�����process�����У�return null
 					builder.append(line).append("\n");//����2��һ�����ύ����������������done��ʹ��get()��������
				}
 				reader.close();
				return builder;
			}

			@Override
			protected void process(List<String> chunks) {
				for (String line :chunks) {
					textArea.append(line);
					textArea.append("\n");
				}
				super.process(chunks);
			}

			@Override
			protected void done() {
				try {
					textArea.setText(get().toString());//��ȡdoInBackground�ķ���ֵ
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				super.done();
			}
			
		}.execute();
	}

}
