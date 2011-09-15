package com.isi.prjBattleship.entities;

import javax.swing.SwingUtilities;
import com.isi.prjBattleship.listeners.Splash_Listener;
import com.isi.prjBattleship.windows.Menu;
import com.isi.prjBattleship.windows.Splash;

public class Init {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Splash s = new Splash();
				Menu m = new Menu();
				Splash_Listener sl = new Splash_Listener(s, m);
				s.addMouseListener(sl);
				s.setVisible(true);
			}
		});
	}
}
