package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Configurar_Cuota_Diaria extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Cuota_Diaria frame = new Configurar_Cuota_Diaria();
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
	public Configurar_Cuota_Diaria() {
		setBounds(100, 100, 450, 300);

	}

}
