package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Generar_Reporte extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generar_Reporte frame = new Generar_Reporte();
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
	public Generar_Reporte() {
		setBounds(100, 100, 450, 300);

	}

}
