package com.isi.prjBattleship.entities;

import javax.swing.SwingUtilities;
import com.isi.prjBattleship.interfaces.Splash_Listener;

public class Init {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//Initier les instances
				Splash s = new Splash();
				Menu m = new Menu();
				
				//Créer le listener pour le splash screen
				Splash_Listener sl = new Splash_Listener(s, m);
				s.addMouseListener(sl);
				
				//Afficher
				s.setVisible(true);
			}
		});
	}
}
