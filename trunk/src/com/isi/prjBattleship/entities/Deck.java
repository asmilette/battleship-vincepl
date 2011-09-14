package com.isi.prjBattleship.entities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Deck extends JFrame {
	private Ship ships[];
	private int Grid[][];
	private int lenX;
	private int lenY;
	Grids player;
	Grids oponent;
	private Insets insets;

	
	public Deck(int lenX, int lenY) {
		/*for(int i = 0; i < lenX; i++)
		for(int j = 0; j < lenY; j++)
			this.Grid[i][j] = 1;
	this.lenX = lenX;
	this.lenY = lenY;*/
	
	//Panel Principale
	JPanel pPrincipale = new JPanel();
	pPrincipale.setLayout(new GridBagLayout());
	pPrincipale.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	
	//Panel Titre
	JPanel pTitle = new JPanel();		
	insets = new Insets(0, 0, 0, 0);
	pTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pTitle, 0, 0, 1050, 25, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);	
	
	//Panel Grids
	this.player = new Grids(false);
	this.oponent = new Grids(true);
	
	insets = new Insets(45,0,0,0);
	addComponent(pPrincipale, this.player.getGrid(), 0, 1, 0, 0, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);
	
	insets = new Insets(45,0,0,0);
	addComponent(pPrincipale, this.oponent.getGrid(), 0, 1, 0, 0, GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE, insets);

	//Panel Output HQ
	JPanel pHqOutput = new JPanel();
	insets = new Insets(120,0,0,0);
	pHqOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pHqOutput, 0, 0, 140, 250, GridBagConstraints.PAGE_START, GridBagConstraints.NONE, insets);
	
	//Panel Output Network
	JPanel pNetOutput = new JPanel();
	insets = new Insets(475,250,0,250);
	pNetOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pNetOutput, 0, 1, 550, 150, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);
	
	//Panel Input
	JPanel pInput = new JPanel();
	insets = new Insets(0,0,0,0);
	pInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pInput, 0, 1, 90, 20, GridBagConstraints.PAGE_END, GridBagConstraints.NONE, insets);
	
	//Frame
	this.setTitle("BattleShip");
	this.setSize(1050, 700);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	this.setResizable(false);
	
	this.getContentPane().add(pPrincipale, BorderLayout.CENTER);
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
	 private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int ipadx, int ipady, int anchor, int fill, Insets i) {
		    GridBagConstraints gbc = new GridBagConstraints();
		    gbc.gridx = gridx;
		    gbc.gridy = gridy;
		    gbc.gridwidth = 0;
		    gbc.gridheight = 0;
		    gbc.weightx = 1.0;
		    gbc.weighty = 1.0;
		    gbc.anchor = anchor;
		    gbc.fill = fill;
		    gbc.insets = i;
		    gbc.ipadx = ipadx;
		    gbc.ipady = ipady;
		    
		    container.add(component, gbc);
		  }
}
