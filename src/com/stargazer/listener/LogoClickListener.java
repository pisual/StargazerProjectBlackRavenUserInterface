package com.stargazer.listener;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.stargazer.mainframe.MainFrame;

public class LogoClickListener extends MouseAdapter {
	private MainFrame mainFrame;
	public LogoClickListener(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	 public void mouseClicked(MouseEvent evt) {
		 if (evt.getClickCount() == 3) {
			 System.out.println("System has Exit By User");
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.exit(0);
		 } else if (evt.getClickCount() == 5) {
			 mainFrame.setExtendedState(Frame.ICONIFIED);
		 }
		 }
}
