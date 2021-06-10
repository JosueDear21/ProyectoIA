package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Mod_Lavadora extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mod_Lavadora frame = new Mod_Lavadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mod_Lavadora() {
		setBounds(100, 100, 450, 300);

	}

}
