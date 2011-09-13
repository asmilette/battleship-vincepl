import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;


public class test extends JFrame {
	
	public test(){
		
		//Frame
		this.setTitle("");
		this.setSize(450, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setResizable(false);
		
		//JPanel
		JPanel pan = new JPanel (new GridLayout (10,10));
		pan.setBackground(Color.BLACK);
		
		//Border Color
		Border GreenLine = BorderFactory.createLineBorder(Color.GREEN,1); 
		for(int i = 0; i<100;i++){
		   JPanel ptest = new JPanel();
		   ptest.setLayout(new BorderLayout());
		   ptest.setName("p" + (i+1));
		   vLabel ltest = new vLabel();
		   ltest.addMouseListener(new MouseOver(ltest));
		   ptest.add(ltest);
		   ptest.setBorder(GreenLine);
		   pan.add(ptest);
		}
		
		this.getContentPane().add(pan, BorderLayout.CENTER);
	}
}
