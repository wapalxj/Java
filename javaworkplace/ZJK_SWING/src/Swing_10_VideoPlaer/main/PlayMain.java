package Swing_10_VideoPlaer.main;

/*
 * 注意使用vlc3.0.1.jar，就可以避免slf4j错误
 */
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import Swing_10_VideoPlaer.views.MainWindow;

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

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainWindow();
					frame.setVisible(true);
					//设置中文解码
					String options[]={"--sybscode-encoding=GB18030"};
					//一下2行必须这样子写，不能写成极客原视频中的：.playMedia("‪E:\\others\\Logorama.avi",options);
					File video = new File("E:\\others\\Logorama.avi");
//					frame.getMediaPlayer().playMedia(video.getPath(),options);
					//不会一运行就播放，而值是放到播放器当中
					frame.getMediaPlayer().prepareMedia(video.getPath(),options);
					/*
					 * 进度条
					 */
					new SwingWorker<String, Integer>(){

						@Override
						protected String doInBackground() throws Exception {
							while (true) {
								//获取当前食品长度（长整型毫秒）
								long total=frame.getMediaPlayer().getLength();
								long curr=frame.getMediaPlayer().getTime();
								float percent =(float)curr/total;
								publish((int)(percent*100));//(先转化为0到100之间的数值)中间的结果一次一次会传入到下面的process函数中
								Thread.sleep(100);//让程序暂停100毫秒
							}
						}
						protected void process(java.util.List<Integer> chunks) {
							for (int v : chunks) {
								frame.getProgressBar().setValue(v);
							}
						};
						
					}.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//播放
	public static void play() {
		frame.getMediaPlayer().play();
	}
	//暂停
	public static void pause() {
		frame.getMediaPlayer().pause();
	}
	//停止
	public static void stop() {
		frame.getMediaPlayer().stop();
	}
	//进度条跳转
	public static void jumpTo(float to) {
		//进度条百分比*总长度=跳转的时间点
		frame.getMediaPlayer().setTime((long)(to*frame.getMediaPlayer().getLength()));;
	}
	//音量调节
	public static void setVol(int v) {
		frame.getMediaPlayer().setVolume(v);
	}
	/*
	 * Menu
	 */
	public static void openVideo() {
		JFileChooser chooser =new JFileChooser();
		int v=chooser.showOpenDialog(null);
		if (v==JFileChooser.APPROVE_OPTION) {
			File file =chooser.getSelectedFile();
			frame.getMediaPlayer().playMedia(file.getAbsolutePath());
		}
	}
	//设置字幕
	public static void openSubtitle() {
		JFileChooser chooser =new JFileChooser();
		int v=chooser.showOpenDialog(null);
		if (v==JFileChooser.APPROVE_OPTION) {
			File file =chooser.getSelectedFile();
			frame.getMediaPlayer().setSubTitleFile(file);
		}
	}
	
	public static void exit() {
		frame.getMediaPlayer().release();
		System.exit(0);
		
	}
	
	
}
