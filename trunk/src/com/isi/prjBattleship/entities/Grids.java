package com.isi.prjBattleship.entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.isi.prjBattleship.interfaces.MouseOver;

public class Grids extends JFrame {
	public JPanel Grid;

	public Grids(){
				
		//JPanel
		JPanel pan = new JPanel (new GridLayout (10,10));
		pan.setBackground(Color.BLACK);
		
		//Border Color
		Border GreenLine = BorderFactory.createLineBorder(Color.GREEN,1); 
		
		//
		for(int i = 0; i<100;i++){

		   vLabel ltest = new vLabel();
		   ltest.addMouseListener(new MouseOver(ltest));
		   
		   ltest.setBorder(GreenLine);
		   pan.add(ltest);
		}
		
		this.Grid = pan;
	}
	public JPanel getGrid(){
		return this.Grid;
	}
}
