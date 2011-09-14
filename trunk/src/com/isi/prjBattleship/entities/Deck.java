package com.isi.prjBattleship.entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Deck extends JFrame {
	private Ship ships[];
	private int Grid[][];
	private int lenX;
	private int lenY;
	Grids player;
	Grids oponent;


	
	public Deck(int lenX, int lenY) {
		/*for(int i = 0; i < lenX; i++)
		for(int j = 0; j < lenY; j++)
			this.Grid[i][j] = 1;
	this.lenX = lenX;
	this.lenY = lenY;*/
	
	//Panel Principale
	JPanel pPrincipale = new JPanel();
	pPrincipale.setLayout(new GridLayout(4,1));
	
	//Panel Titre
	JPanel pTitle = new JPanel();		
	
	//Panel Grids
	JPanel pgrids = new JPanel();
	pgrids.setLayout(new GridLayout(1,3));
	pgrids.setBackground(Color.BLACK);
	
	this.player = new Grids(false);
	this.oponent = new Grids(true);
	
	pgrids.add(this.player.getGrid());
	pgrids.add(this.oponent.getGrid());

	//Panel Output
	JPanel pOutput = new JPanel();
	
	//Panel Input
	JPanel pInput = new JPanel();
			
	
	pPrincipale.add(pTitle);
	pPrincipale.add(pgrids);
	pPrincipale.add(pOutput);
	pPrincipale.add(pInput);
	this.getContentPane().add(pPrincipale, BorderLayout.CENTER);
	
	//Frame
	this.setTitle("");
	this.setSize(950, 450);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	this.setResizable(false);
	}
	
	public int addShip(Ship s) {
		switch(s.getDir()){
		case 1:
			for(int i=s.getPosX(); i<s.getPosX()+s.getLen(); i++)
				if(isAvailable(i, s.getPosY()))
					return -1;
			break;
		}
		//this.ships[0] = new Ship(123,123,123,1,new ImageIcon("Img/Destroyer.gif"));
		return -1;
	}
	
	public boolean isAvailable(int X, int Y){
		return true;
	}
}
