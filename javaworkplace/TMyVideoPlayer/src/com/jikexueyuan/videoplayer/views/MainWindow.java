package com.jikexueyuan.videoplayer.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.JButton;

import com.jikexueyuan.videoplayer.main.PlayMain;

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
		
	}	

	public EmbeddedMediaPlayer getMediaPlayer() {
		return playerComponent.getMediaPlayer();
	}

}
