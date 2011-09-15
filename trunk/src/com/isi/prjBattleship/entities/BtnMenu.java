package com.isi.prjBattleship.entities;

import javax.swing.JButton;

public class BtnMenu extends JButton{
	private static final long serialVersionUID = 5864802015232419851L;
	private int id;
	public BtnMenu(String title, int id){
		super(title);
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
