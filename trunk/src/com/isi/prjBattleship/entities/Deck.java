package com.isi.prjBattleship.entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Deck extends JFrame {
	private Ship ships[];
	private int Grid[][];
	private int lenX;
	private int lenY;

	
	public Deck(int lenX, int lenY) {
		/*for(int i = 0; i < lenX; i++)
			for(int j = 0; j < lenY; j++)
				this.Grid[i][j] = 1;
		this.lenX = lenX;
		this.lenY = lenY;*/
		
		//Frame
		this.setTitle("");
		this.setSize(950, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		JPanel pgrids = new JPanel();
		pgrids.setBackground(Color.BLACK);
		Grids pla = new Grids();
		Grids cpu = new Grids();
		pgrids.add(pla.getGrid());
		pgrids.add(cpu.getGrid());
		this.getContentPane().add(pgrids, BorderLayout.CENTER);
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
