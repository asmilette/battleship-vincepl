package com.isi.prjBattleship.entities;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {
	private static final long serialVersionUID = 696477034595205609L;
	public Splash(){
		this.setTitle("JAVA Battleship");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Welcome to JAVA Battleships");
		title.setIcon(new ImageIcon("Img/java.jpg"));
		title.setSize(400, 400);
		title.setVisible(true);
		this.add(title);
		
		this.setVisible(true);
	}
}
