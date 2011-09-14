package com.isi.prjBattleship.interfaces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import com.isi.prjBattleship.entities.Init;
import com.isi.prjBattleship.entities.Splash;

public class Splash_Listener implements MouseListener {
	private Splash s;
	
	public Splash_Listener(Splash s){
		this.s = s;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		s.dispose();
		//JOptionPane.showConfirmDialog(e.getComponent(), e.getClass());
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
