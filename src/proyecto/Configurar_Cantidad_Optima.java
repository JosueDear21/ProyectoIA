package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Configurar_Cantidad_Optima extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Cantidad_Optima frame = new Configurar_Cantidad_Optima();
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
	public Configurar_Cantidad_Optima() {
		setBounds(100, 100, 450, 300);

	}

}
