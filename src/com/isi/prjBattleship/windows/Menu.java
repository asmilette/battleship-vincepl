package com.isi.prjBattleship.windows;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.isi.prjBattleship.entities.BtnMenu;
import com.isi.prjBattleship.listeners.L_Btn_Menu;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Menu(){
		this.setSize(400, 400);
		this.setTitle("BattleShip");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 200, 100, 0};
		gridBagLayout.rowHeights = new int[]{75, 36, 50, 0, 0, 0, 43, 0, 57, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblTitle = new JLabel("Battleship");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 1;
		getContentPane().add(lblTitle, gbc_lblTitle);
		
		JButton btnSolo = new JButton("Solo");
		btnSolo.addActionListener(new L_Btn_Menu(this));
		GridBagConstraints gbc_btnSolo = new GridBagConstraints();
		gbc_btnSolo.fill = GridBagConstraints.BOTH;
		gbc_btnSolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnSolo.gridx = 1;
		gbc_btnSolo.gridy = 3;
		getContentPane().add(btnSolo, gbc_btnSolo);
		
		JButton btnMulti = new JButton("Muli-Joueur");
		btnMulti.addActionListener(new L_Btn_Menu(this));
		GridBagConstraints gbc_btnMulti = new GridBagConstraints();
		gbc_btnMulti.fill = GridBagConstraints.BOTH;
		gbc_btnMulti.insets = new Insets(0, 0, 5, 5);
		gbc_btnMulti.gridx = 1;
		gbc_btnMulti.gridy = 4;
		getContentPane().add(btnMulti, gbc_btnMulti);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.addActionListener(new L_Btn_Menu(this));
		GridBagConstraints gbc_btnOptions = new GridBagConstraints();
		gbc_btnOptions.fill = GridBagConstraints.BOTH;
		gbc_btnOptions.insets = new Insets(0, 0, 5, 5);
		gbc_btnOptions.gridx = 1;
		gbc_btnOptions.gridy = 5;
		getContentPane().add(btnOptions, gbc_btnOptions);
		
		JButton btnQuit = new JButton("Quitter");
		btnQuit.addActionListener(new L_Btn_Menu(this));
		GridBagConstraints gbc_btnQuit = new GridBagConstraints();
		gbc_btnQuit.fill = GridBagConstraints.BOTH;
		gbc_btnQuit.insets = new Insets(0, 0, 5, 5);
		gbc_btnQuit.gridx = 1;
		gbc_btnQuit.gridy = 7;
		getContentPane().add(btnQuit, gbc_btnQuit);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblTitle, btnSolo, btnMulti, btnOptions, btnQuit}));
	}
	
	public void startGame(){
		Deck d = new Deck();
		d.setVisible(true);
		this.setVisible(false);
	}
	
	public void options(){
		Options o = new Options(this);
		o.setVisible(true);
		this.setVisible(false);
	}
	
	public void quitter(){
		System.exit(0);
	}
}
