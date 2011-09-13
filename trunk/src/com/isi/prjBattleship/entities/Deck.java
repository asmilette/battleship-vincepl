package com.isi.prjBattleship.entities;

import javax.swing.ImageIcon;

public class Deck {
	private Ship ships[];
	private int Grid[][];
	private int lenX;
	private int lenY;
	
	public Deck(int lenX, int lenY) {
		for(int i = 0; i < lenX; i++)
			for(int j = 0; j < lenY; j++)
				this.Grid[i][j] = 1;
		this.lenX = lenX;
		this.lenY = lenY;
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
