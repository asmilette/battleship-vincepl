package com.isi.prjBattleship.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.isi.prjBattleship.entities.Grids;
import com.isi.prjBattleship.listeners.*;

public class Deck extends JFrame {
	private static final long serialVersionUID = -2456053938512001747L;
	//private Ship ships[];
	//private int Grid[][];
	//private int lenX;
	//private int lenY;
	JPanel pPrincipale;
	JPanel pTitle;
	Grids player;
	Grids oponent;
	JPanel pHqOutput;
	JPanel pNetOutput;
	JPanel pInput;
	private Insets insets;

	
	public Deck() {
		//Frame
		this.setTitle("BattleShip");
		this.setSize(1050, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		
		//Panel Principale
		pPrincipale = new JPanel();
		pPrincipale.setLayout(new GridBagLayout());
		pPrincipale.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		//Panel Titre
		pTitle = new JPanel();		
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
	
	//Panel Principale
	pPrincipale = new JPanel();
	pPrincipale.setLayout(new GridBagLayout());
	pPrincipale.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	
	//Menu bar	
	JMenuBar jmBar = new JMenuBar();
	JMenu mFichier = new JMenu("Fichier");
	JMenuItem miNouveau = new JMenuItem("Nouveau");
	miNouveau.addActionListener(new Menu_Listener());
	JMenuItem miPause = new JMenuItem("Pause");
	miPause.addActionListener(new Menu_Listener());
	JMenuItem miFermer = new JMenuItem("Fermer");
	miFermer.addActionListener(new Menu_Listener());
	mFichier.add(miNouveau);
	mFichier.add(miPause);
	mFichier.addSeparator();
	mFichier.add(miFermer);
	jmBar.add(mFichier);
	
	insets = new Insets(0, 0, 0, 0);
	addComponent(pPrincipale, jmBar, 0, 0, 1050, 25, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);	
	
	//Panel Grids
	this.player = new Grids(false);
	this.oponent = new Grids(true);
	
	insets = new Insets(45,0,0,0);
	addComponent(pPrincipale, this.player.getGrid(), 0, 1, 0, 0, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);
	
	insets = new Insets(45,0,0,0);
	addComponent(pPrincipale, this.oponent.getGrid(), 0, 1, 0, 0, GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE, insets);

	//Panel Output HQ
	pHqOutput = new JPanel();
	insets = new Insets(120,0,0,0);
	pHqOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pHqOutput, 0, 0, 140, 250, GridBagConstraints.PAGE_START, GridBagConstraints.NONE, insets);
	
	//Panel Output Network
	pNetOutput = new JPanel();
	insets = new Insets(475,250,0,250);
	pNetOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pNetOutput, 0, 1, 550, 150, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, insets);
	
	//Panel Input
	pInput = new JPanel();
	insets = new Insets(0,0,0,0);
	pInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	addComponent(pPrincipale, pInput, 0, 1, 550, 20, GridBagConstraints.PAGE_END, GridBagConstraints.NONE, insets);
	
	//Frame
	this.setTitle("BattleShip");
	this.setSize(1050, 700);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	this.setResizable(true);
	
	this.getContentPane().add(pPrincipale, BorderLayout.CENTER);
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
