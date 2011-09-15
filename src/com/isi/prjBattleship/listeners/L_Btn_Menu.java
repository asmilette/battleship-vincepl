package com.isi.prjBattleship.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.isi.prjBattleship.windows.Menu;
import com.isi.prjBattleship.windows.Options;

public class L_Btn_Menu implements ActionListener{
	private JFrame m;
	
	public L_Btn_Menu(JFrame m){
		this.m = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(((JButton)e.getSource()).getText() == "Solo")
			((Menu)this.m).startGame();
		else if(((JButton)e.getSource()).getText() == "Multi-Joueur")
			((Menu)this.m).quitter();
		else if(((JButton)e.getSource()).getText() == "Options")
			((Menu)this.m).options();
		else if(((JButton)e.getSource()).getText() == "Quitter")
			((Menu)this.m).quitter();
		else if(((JButton)e.getSource()).getText() == "Retour")
			((Options)this.m).retour();
	}
}
