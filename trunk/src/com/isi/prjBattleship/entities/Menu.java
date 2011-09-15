package com.isi.prjBattleship.entities;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.isi.prjBattleship.listeners.L_Btn_Menu;

public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Menu(){
		this.setSize(600, 600);
		L_Btn_Menu lm = new L_Btn_Menu(this);
		JPanel p = new JPanel();
		
		JButton btnSingle = new JButton("Single Player");
		btnSingle.addMouseListener(lm);
		p.add(btnSingle);
		
		JButton btnMulti = new JButton("Multiplayer");
		btnMulti.addMouseListener(lm);
		p.add(btnMulti);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.addMouseListener(lm);
		p.add(btnOptions);
		
		JButton btnQuit = new JButton("Quitter");
		btnQuit.addMouseListener(lm);
		p.add(btnQuit);
		this.add(p);
	}
	
	public void StartGame(){
		Deck d = new Deck();
		d.setVisible(true);
		this.setVisible(false);
	}
}
