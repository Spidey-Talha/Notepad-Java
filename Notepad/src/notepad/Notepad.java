package notepad;
import javax.swing.JFrame;
/**
 *
 * @author Kzp12
 */
public class Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		JFrame frame = new Grid();
		frame.setTitle("Notepad");
		frame.setVisible(true);
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
	}
 }

