import javax.swing.SwingUtilities;


public class Demarrer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

				SwingUtilities.invokeLater(new Runnable() {	
					
					@Override
					public void run() {
			
						new test();
				}
			});
			
		}
}
