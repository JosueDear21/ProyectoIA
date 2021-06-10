package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Acerca_Tienda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acerca_Tienda frame = new Acerca_Tienda();
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
	public Acerca_Tienda() {
		setBounds(100, 100, 450, 300);

	}

}
