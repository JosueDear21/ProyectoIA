package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Configurar_Cuota_Diaria extends JInternalFrame {
	private JLabel lblCuotaDiariaEsperada;
	private JTextField txtCuotaDiaria;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
		setBounds(100, 100, 459, 300);
		getContentPane().setLayout(null);
		
		lblCuotaDiariaEsperada = new JLabel("Cuota diaria esperada (S/)");
		lblCuotaDiariaEsperada.setBounds(10, 17, 136, 14);
		getContentPane().add(lblCuotaDiariaEsperada);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setColumns(10);
		txtCuotaDiaria.setBounds(156, 11, 145, 20);
		getContentPane().add(txtCuotaDiaria);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(345, 13, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(345, 42, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
