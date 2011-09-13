package com.isi.prjBattleship.entities;

public class Ship {
	private int len;
	private int dir;
	private boolean state[];
	private int posX;
	private int posY;
	
	public Ship(int posX, int posY, int len, int dir) {
		this.posX = posX;
		this.posY = posY;
		this.len = len;
		this.dir = dir;
	}
	
	public boolean isReveal() {
		for(int i = 0; i < this.len; i++)
			if(this.state[i])
				return false;
		return true;
	}
	
	public boolean isDamaged() {
		for(int i = 0; i < this.len; i++)
			if(this.state[i] == false)
				return true;
		return false;
	}

	public void setState(int i, boolean state) {
		this.state[i] = state;
	}
	
	public boolean getState(int i) {
		return this.state[i];
	}
	
	public int getLen() {
		return this.len;
	}
	
	public int getDir() {
		return this.dir;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
}
