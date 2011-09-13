package com.isi.prjBattleship.entities;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class vLabel extends JLabel {
	private int Flag;
	static private ImageIcon water = new ImageIcon("Img/Water.gif");
	
	public vLabel(){
		this.setIcon(water);	
		this.Flag = 0;
	}
	public void setFlag(int f){
		this.Flag = f;
	}
	public int getFlag(){
		return this.Flag;
	}
}
