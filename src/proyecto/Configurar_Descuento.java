package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Configurar_Descuento extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Descuento frame = new Configurar_Descuento();
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
	public Configurar_Descuento() {
		setBounds(100, 100, 450, 300);

	}

}
