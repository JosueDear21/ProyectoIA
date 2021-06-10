package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Listar_Lavadora extends JInternalFrame {
	private JTextArea txtLista;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar_Lavadora frame = new Listar_Lavadora();
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
	public Listar_Lavadora() {
		setTitle("LISTAR LAVADORA");
		setBounds(100, 100, 460, 300);
		getContentPane().setLayout(null);
		
		txtLista = new JTextArea();
		txtLista.setBounds(10, 11, 424, 216);
		getContentPane().add(txtLista);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(112, 238, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(242, 238, 89, 23);
		getContentPane().add(btnListar);

	}

}
