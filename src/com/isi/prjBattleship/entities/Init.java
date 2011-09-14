package com.isi.prjBattleship.entities;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import com.isi.prjBattleship.interfaces.Splash_Listener;

public class Init {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//Splash screen
				Splash s = new Splash();
				Splash_Listener sl = new Splash_Listener(s);
				s.addMouseListener(sl);
				
				//Deck
				Deck d = new Deck();
				
				s.setVisible(true);
			}
		});
	}
}
