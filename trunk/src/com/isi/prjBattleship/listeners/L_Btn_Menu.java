package com.isi.prjBattleship.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.isi.prjBattleship.entities.BtnMenu;
import com.isi.prjBattleship.windows.Menu;

public class L_Btn_Menu implements MouseListener{
	private Menu m;
	
	public L_Btn_Menu(Menu m){
		this.m = m;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(((BtnMenu)e.getComponent()).getId() == 1)
			this.m.StartGame();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
