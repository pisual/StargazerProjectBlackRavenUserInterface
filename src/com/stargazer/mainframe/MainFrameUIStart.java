package com.stargazer.mainframe;

import java.io.IOException;

import javax.swing.UnsupportedLookAndFeelException;

public class MainFrameUIStart {
	public MainFrameUIStart() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, UnsupportedLookAndFeelException {
	    String file = System.getProperty("user.dir") + "/StargazerUIBlackRaven/"+"BackGround.png";
		StargazerMainInterface stargazerMainFrame = new StargazerMainInterface(file,System.getProperty("user.dir") + "/StargazerUIBlackRaven/"+"logo.png");
		stargazerMainFrame.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			new MainFrameUIStart();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}
