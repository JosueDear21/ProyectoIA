package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Configurar_Cantidad_Optima extends JInternalFrame {
	private JLabel lblCantidaptimaDe;
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
		setBounds(100, 100, 470, 300);
		getContentPane().setLayout(null);
		
		lblCantidaptimaDe = new JLabel("Cantida \u00F3ptima de unidades vendidas");
		lblCantidaptimaDe.setBounds(10, 17, 223, 14);
		getContentPane().add(lblCantidaptimaDe);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setColumns(10);
		txtCantidadOptima.setBounds(243, 11, 74, 20);
		getContentPane().add(txtCantidadOptima);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(345, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(345, 42, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
