package com.isi.prjBattleship.entities;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class vLabel extends JLabel {
	private static final long serialVersionUID = 5965173037966976706L;
	private int Flag;
	private boolean Enable;
	
	static private ImageIcon water = new ImageIcon("Img/Water.gif");
	
	public vLabel(boolean e){
		this.Enable = e;
		this.setIcon(water);	
		this.Flag = 0;
	}
	public void setFlag(int f){
		this.Flag = f;
	}
	public int getFlag(){
		return this.Flag;
	}
	public boolean isEnable(){
		return this.Enable;
	}
}
