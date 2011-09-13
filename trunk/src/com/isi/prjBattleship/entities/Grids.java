package com.isi.prjBattleship.entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.isi.prjBattleship.interfaces.MouseOver;

public class Grids extends JFrame {

	public Grids(){
		
		//Frame
		this.setTitle("");
		this.setSize(450, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		
		
		
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
		
		this.getContentPane().add(pan, BorderLayout.CENTER);
	}
	
}
