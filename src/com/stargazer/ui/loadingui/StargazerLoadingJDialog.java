package com.stargazer.ui.loadingui;

import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.UnsupportedLookAndFeelException;

import com.stargazer.ui.util.UIUtil;
/**
 * 加载进度界面
 * 
 * @author felixsion
 * **/
public class StargazerLoadingJDialog extends LoadingJDialog {

	private static final long serialVersionUID = -781617113970117755L;
	private JLabel backgroundlabel;
	private LoadingProgressInfo progressInfo;
	private ImageIcon background;
	private LoadingJProgressBar progressBar;

	public StargazerLoadingJDialog(String loadingBackGroundFile) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        progressInfo = new LoadingProgressInfo();
        progressBar = new LoadingJProgressBar();
		background = new ImageIcon(loadingBackGroundFile);
		backgroundlabel = new JLabel(background);
		backgroundlabel.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		this.frameLayout();
		this.setUndecorated(true);
		this.getLayeredPane().add(backgroundlabel, new Integer(Integer.MIN_VALUE)); 
        this.setSize(background.getIconWidth(), background.getIconHeight());
        UIUtil.changeJDialogToCenter(this);  
	}
	/**窗口布局**/
	public void frameLayout() {
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			  .addComponent(progressBar, GroupLayout.Alignment.TRAILING,GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
			  .addComponent(progressInfo, GroupLayout.Alignment.TRAILING,GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			  .addGroup(GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
			  .addContainerGap(265, Short.MAX_VALUE)
			  .addComponent(progressInfo,GroupLayout.PREFERRED_SIZE, 18,GroupLayout.PREFERRED_SIZE)
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addComponent(progressBar,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)));
	}
	/**
	 * 更新进度条
	 * @author felixsion
	 * **/
    public void updateProcess(String info, int value) {  
        progressInfo.setText(info);  
        progressBar.setValue(value);  
    }
}
