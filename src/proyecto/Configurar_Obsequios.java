package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Configurar_Obsequios extends JInternalFrame {
	private JLabel lblUnidad;
	private JLabel lblUnidad2a5;
	private JLabel lblUnidad6Mas;
	private JTextField txtUnidad1;
	private JTextField txtUnidad6mas;
	private JTextField textField_2;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
		setBounds(100, 100, 460, 299);
		getContentPane().setLayout(null);
		
		lblUnidad = new JLabel("1 Unidad");
		lblUnidad.setBounds(10, 17, 105, 14);
		getContentPane().add(lblUnidad);
		
		lblUnidad2a5 = new JLabel("2 a 5 Unidades");
		lblUnidad2a5.setBounds(10, 42, 105, 14);
		getContentPane().add(lblUnidad2a5);
		
		lblUnidad6Mas = new JLabel("6 a m\u00E1s Unidades");
		lblUnidad6Mas.setBounds(10, 67, 105, 14);
		getContentPane().add(lblUnidad6Mas);
		
		txtUnidad1 = new JTextField();
		txtUnidad1.setColumns(10);
		txtUnidad1.setBounds(125, 11, 159, 20);
		getContentPane().add(txtUnidad1);
		
		txtUnidad6mas = new JTextField();
		txtUnidad6mas.setColumns(10);
		txtUnidad6mas.setBounds(125, 36, 159, 20);
		getContentPane().add(txtUnidad6mas);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 61, 159, 20);
		getContentPane().add(textField_2);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(345, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(345, 42, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
