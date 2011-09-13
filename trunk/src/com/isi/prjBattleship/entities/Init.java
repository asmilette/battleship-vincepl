package com.isi.prjBattleship.entities;
import javax.swing.SwingUtilities;

import com.isi.prjBattleship.interfaces.Splash_Listener;

public class Init {
	private static Splash s = new Splash();
	private static Menu m = new Menu();
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				s.setVisible(true);
			}
		});
	}
	
	public void openMenu() {
		s.setVisible(false);
		m.setVisible(true);
	}
}
