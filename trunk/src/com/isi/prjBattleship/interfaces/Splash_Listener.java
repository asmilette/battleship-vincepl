package com.isi.prjBattleship.interfaces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.isi.prjBattleship.entities.*;

public class Splash_Listener implements MouseListener {
	Init mainref;
	
	public Splash_Listener(Init mainref){
		this.mainref = mainref;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.mainref.openMenu();
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
