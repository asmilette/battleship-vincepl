package com.isi.prjBattleship.windows;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.isi.prjBattleship.entities.BtnMenu;
import com.isi.prjBattleship.listeners.L_Btn_Menu;

public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Menu(){
		this.setSize(600, 600);
		this.setTitle("BattleShip");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		L_Btn_Menu lm = new L_Btn_Menu(this);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		
		BtnMenu btnSingle = new BtnMenu("Single Player", 1);
		btnSingle.addMouseListener(lm);
		btnSingle.setAlignmentX(CENTER_ALIGNMENT);
		p.add(btnSingle);
		
		BtnMenu btnMulti = new BtnMenu("Multiplayer", 2);
		btnMulti.setAlignmentX(CENTER_ALIGNMENT);
		btnMulti.addMouseListener(lm);
		p.add(btnMulti);
		
		BtnMenu btnOptions = new BtnMenu("Options", 3);
		btnOptions.setAlignmentX(CENTER_ALIGNMENT);
		btnOptions.addMouseListener(lm);
		p.add(btnOptions);
		
		BtnMenu btnQuit = new BtnMenu("Quitter", 4);
		btnQuit.setAlignmentX(CENTER_ALIGNMENT);
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
