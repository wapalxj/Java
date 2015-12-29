package Swing_10_VideoPlaer.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;





import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.JButton;

import Swing_10_VideoPlaer.main.PlayMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	EmbeddedMediaPlayerComponent playerComponent;
	private JPanel panel;
	private JButton btnPlay;
	private JButton btnPause;
	private JButton btnStop;
	private JPanel controlPanel;
	private JProgressBar progress;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen_File;
	private JMenuItem mntmOpen_Subtitle;
	private JMenuItem mntmExit;
	private JSlider slider;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmOpen_File = new JMenuItem("Open Video");
		mnFile.add(mntmOpen_File);
		
		mntmOpen_Subtitle = new JMenuItem("Open Subtitle");
		mnFile.add(mntmOpen_Subtitle);
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		mntmOpen_File.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayMain.openVideo();
			}
		});
		mntmOpen_Subtitle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayMain.openSubtitle();
			}
		});
		mntmExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayMain.exit();
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel videopanel = new JPanel();
		contentPane.add(videopanel, BorderLayout.CENTER);
		videopanel.setLayout(new BorderLayout(0, 0));
		
		//EmbeddedMediaPlayerComponent
		playerComponent =new  EmbeddedMediaPlayerComponent();
		videopanel.add(playerComponent);
		
		panel = new JPanel();
		videopanel.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		controlPanel = new JPanel();
		panel.add(controlPanel, BorderLayout.CENTER);
		
		btnStop = new JButton("stop");
		controlPanel.add(btnStop);
		
		btnPlay = new JButton("play");
		controlPanel.add(btnPlay);
		
		btnPause = new JButton("pause");
		controlPanel.add(btnPause);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				PlayMain.setVol(slider.getValue());
				
			}
		});
		
		controlPanel.add(slider);
		
		progress = new JProgressBar();
		progress.addMouseListener(new MouseAdapter() {
			@Override
			//进度条点击
			public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				//x/progress.getWidth()进度条百分比
				PlayMain.jumpTo((float)x/progress.getWidth());
			}
		});
		progress.setStringPainted(true);
		panel.add(progress, BorderLayout.NORTH);
		btnPause.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.pause();
			}
		});
		btnPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.play();
			}
		});
		btnStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayMain.stop();
			}
		});
	}
	
	public EmbeddedMediaPlayer getMediaPlayer() {
		return playerComponent.getMediaPlayer();
	}
	//进度条
	public JProgressBar getProgressBar() {
		return progress;
	}
}
