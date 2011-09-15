package com.isi.prjBattleship.entities;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.isi.prjBattleship.listeners.MouseOver;

public class Grids extends JFrame {
	private static final long serialVersionUID = 1935683268551345477L;
	public JPanel Grid;

	public Grids(boolean Enab){
		
		
		//JPanel
		JPanel pan = new JPanel (new GridLayout (10,10));
		pan.setBackground(Color.BLACK);
		
		//Border Color
		Border BorderColor = BorderFactory.createLineBorder(Color.GREEN,1); 
		
		//Tableau Label
		vLabel[][] lbGrid = new vLabel[10][10];
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10; j++){
			   lbGrid[i][j] = new vLabel(Enab);
			   lbGrid[i][j].addMouseListener(new MouseOver(lbGrid[i][j]));
			   
			   lbGrid[i][j].setBorder(BorderColor);
			   pan.add(lbGrid[i][j]);	
			}
		}
		
		this.Grid = pan;
	}
	public JPanel getGrid(){
		return this.Grid;
	}
}
