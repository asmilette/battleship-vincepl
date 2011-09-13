import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;


public class MouseOver implements MouseListener {
	boolean missed = false;
	boolean hit = false;
	vLabel lbt;
	ImageIcon water = new ImageIcon("Img/water.gif");
	ImageIcon feu = new ImageIcon("Img/FeuAnim.gif");
	ImageIcon miss = new ImageIcon("Img/Miss.gif");
	ImageIcon cible = new ImageIcon("Img/WaterTarget.gif");

	public MouseOver(vLabel lb){
		
		this.lbt = lb;
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		changeIcon();

	}
	
	public void changeIcon(){
		 switch (this.lbt.getFlag()) {
         case 1:  
	        this.lbt.setIcon(miss);
	        break;
         case 2:  
			this.lbt.setIcon(feu);       
	         break;
         case 3:
        	 this.lbt.setIcon(cible);
        	 break;
         default: 
			this.lbt.setIcon(water);
        	break;
		 }
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		this.lbt.setFlag(3);
		changeIcon();
		
}

	@Override
	public void mouseExited(MouseEvent e) {
		
		this.lbt.setFlag(0);
		changeIcon();
	
 }

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
