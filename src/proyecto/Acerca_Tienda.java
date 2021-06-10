package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Acerca_Tienda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acerca_Tienda frame = new Acerca_Tienda();
					frame.setMaximum(true);
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
		setBorder(null);
		setTitle("INFORMACION DE TIENDA Y DE LOS CREADORES");
		setBounds(100, 100, 450, 300);
		
	}

}
