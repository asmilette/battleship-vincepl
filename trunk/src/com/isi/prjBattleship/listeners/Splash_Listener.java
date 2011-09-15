package com.isi.prjBattleship.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.isi.prjBattleship.windows.Menu;
import com.isi.prjBattleship.windows.Splash;

public class Splash_Listener implements MouseListener {
	private Splash s;
	private Menu m;
	
	public Splash_Listener(Splash s, Menu d){
		this.s = s;
		this.m = d;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.s.dispose();
		this.m.setVisible(true);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}
	
}
