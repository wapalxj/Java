package com.jikexueyuan.videoplayer.main;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

import com.jikexueyuan.videoplayer.views.MainWindow;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

public class PlayMain {

	static MainWindow frame;

	public static void main(String[] args) {
		if (RuntimeUtil.isMac()) {
			NativeLibrary.addSearchPath(
					RuntimeUtil.getLibVlcLibraryName(), "/Applications/VLC.app/Contents/MacOS/lib"
					);
		}else if (RuntimeUtil.isWindows()) {
			NativeLibrary.addSearchPath(
					RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC"
					);
		}else if (RuntimeUtil.isNix()) {
			NativeLibrary.addSearchPath(
					RuntimeUtil.getLibVlcLibraryName(), "/home/linux/vlc/install/lib"
					);
		}
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);

//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//					frame = new MainWindow();
//					frame.setVisible(true);
//					frame.getMediaPlayer().playMedia("‪E:\\others\\PPP.mp4");
//				
//			}
//		});
	}

}
