import com.isi.prjBattleship.entities.*;
import javax.swing.SwingUtilities;

public class Init {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Splash();
			}
		});
	}
}
