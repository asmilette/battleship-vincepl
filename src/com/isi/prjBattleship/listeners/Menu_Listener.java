package com.isi.prjBattleship.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class Menu_Listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Nouveau"){

		}else if (e.getActionCommand() == "Pause"){

		}else if (e.getActionCommand() == "Fermer"){
		System.exit(0);
		}
	}
}
