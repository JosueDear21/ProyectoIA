package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Vender extends JInternalFrame {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox cboModeloLavadora;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("VENTANAS DE VENTAS");
		setBounds(100, 100, 465, 301);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 15, 66, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 40, 66, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 65, 66, 14);
		getContentPane().add(lblCantidad);
		
		cboModeloLavadora = new JComboBox();
		cboModeloLavadora.setBounds(86, 11, 163, 22);
		getContentPane().add(cboModeloLavadora);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(86, 37, 163, 20);
		getContentPane().add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(86, 62, 163, 20);
		getContentPane().add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(345, 11, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(345, 36, 89, 23);
		getContentPane().add(btnCerrar);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(10, 90, 429, 175);
		getContentPane().add(txtResultado);

	}
}
