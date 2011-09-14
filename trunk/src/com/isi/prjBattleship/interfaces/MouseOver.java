package com.isi.prjBattleship.interfaces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import com.isi.prjBattleship.entities.vLabel;

public class MouseOver implements MouseListener {
	boolean missed = false;
	boolean hit = false;
	vLabel lbt;
	ImageIcon iconWater = new ImageIcon("Img/water.gif");
	ImageIcon iconFeu = new ImageIcon("Img/FeuAnim.gif");
	ImageIcon iconMiss = new ImageIcon("Img/Miss.gif");
	ImageIcon iconCible = new ImageIcon("Img/WaterTarget.gif");

	public MouseOver(vLabel lb){
			this.lbt = lb;
			this.lbt.setFlag(0);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (this.lbt.isEnable() == true){
			missed = true;
			if (missed == true){
				this.lbt.setFlag(1);
			}
			else if (hit == true){
				this.lbt.setFlag(2);
			}
			changeIcon();
		}
	}
	
	public void changeIcon(){
		 switch (this.lbt.getFlag()) {
         case 1:  
	        this.lbt.setIcon(iconMiss);
	        break;
         case 2:  
			this.lbt.setIcon(iconFeu);       
	         break;
         case 3:
        	 this.lbt.setIcon(iconCible);
        	 break;
         default: 
			this.lbt.setIcon(iconWater);
        	break;
		 }
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (this.lbt.isEnable() == true){
			if (missed == true){
				this.lbt.setFlag(1);
			}
			else if (hit == true){
				this.lbt.setFlag(2);
			}
			else {
				this.lbt.setFlag(3);
			}
			changeIcon();
		}
		
}

	@Override
	public void mouseExited(MouseEvent e) {
		if (this.lbt.isEnable() == true) {
			if (missed == true){
				this.lbt.setFlag(1);
			}
			else if (hit == true){
				this.lbt.setFlag(2);
			}
			else {
				this.lbt.setFlag(0);
			}
			changeIcon();
		}
	
 }

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
