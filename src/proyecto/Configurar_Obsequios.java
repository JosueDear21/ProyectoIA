package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Configurar_Obsequios extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Obsequios frame = new Configurar_Obsequios();
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
	public Configurar_Obsequios() {
		setBounds(100, 100, 450, 300);

	}

}
