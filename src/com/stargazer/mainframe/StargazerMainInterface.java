package com.stargazer.mainframe;

import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.UnsupportedLookAndFeelException;

import com.stargazer.ui.util.ConsoleTextArea;
import com.stargazer.ui.util.UIUtil;

/**
 * 加载进度界面
 * 
 * @author felixsion
 * **/
public class StargazerMainInterface extends MainFrame {
	private JScrollPane jScrollPane =new MainFrameJScrollPane().mainFrameJScrollPane(new ConsoleTextArea());
	private Point origin = new Point();
	private static final long serialVersionUID = -781617113970117755L;
	/**
	 * 初始化
	 * @author felixsion
	 * 
	 * **/
	public StargazerMainInterface(String loadingBackGroundFile,String logo) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		this.frameLayout();
		this.setUndecorated(true);
		this.getLayeredPane().add(new MainFrameBackgroundJlabel().mainFrameBackgroundJlabel(new ImageIcon(loadingBackGroundFile)), new Integer(Integer.MIN_VALUE));
		this.getLayeredPane().add(new MainFrameLogoJlabel().mainFrameLogoJlabel(new ImageIcon(logo),origin,this), 10); 
        this.setSize(new ImageIcon(loadingBackGroundFile).getIconWidth(), new ImageIcon(loadingBackGroundFile).getIconHeight());
    	    this.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/StargazerUIBlackRaven/" + "logo.png"));
        UIUtil.changeFrameToCenter(this);  
	}

	/**窗口布局**/
	public void frameLayout() {
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			  .addComponent(jScrollPane, GroupLayout.Alignment.TRAILING,GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			  .addGroup(GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
			  .addContainerGap(265, Short.MAX_VALUE)
			  .addComponent(jScrollPane,GroupLayout.PREFERRED_SIZE, 617,GroupLayout.PREFERRED_SIZE)));
	}
}