package com.isi.prjBattleship.entities;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.isi.prjBattleship.interfaces.MouseOver;

public class Grids extends JFrame {
	private static final long serialVersionUID = 1935683268551345477L;
	public JPanel Grid;

	public Grids(boolean Enab){
		
		
		//JPanel
		JPanel pan = new JPanel (new GridLayout (10,10));
		pan.setBackground(Color.BLACK);
		
		//Border Color
		Border GreenLine = BorderFactory.createLineBorder(Color.GREEN,1); 
		
		//Tableau Label
		vLabel[] lbGrid = new vLabel[100];
		for(int i = 0; i<100;i++){

		   lbGrid[i] = new vLabel(Enab);
		   lbGrid[i].addMouseListener(new MouseOver(lbGrid[i]));
		   
		   lbGrid[i].setBorder(GreenLine);
		   pan.add(lbGrid[i]);
		}
		
		this.Grid = pan;
	}
	public JPanel getGrid(){
		return this.Grid;
	}
}
