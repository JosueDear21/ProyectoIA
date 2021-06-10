package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Listar_Lavadora extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar_Lavadora frame = new Listar_Lavadora();
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
	public Listar_Lavadora() {
		setBounds(100, 100, 450, 300);

	}

}
