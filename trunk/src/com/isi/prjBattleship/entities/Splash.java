package com.isi.prjBattleship.entities;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {
	private static final long serialVersionUID = 696477034595205609L;
	
	JLabel title;
	
	
	public Splash(){
		this.setTitle("JAVA Battleship");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.title = new JLabel("Welcome to JAVA Battleships");
		this.title.setIcon(new ImageIcon("Img/java.jpg"));
		this.title.setSize(400, 400);
		this.title.setVisible(true);
		//this.title.addMouseListener(new Splash_Listener());
		this.add(title);
	}
}
