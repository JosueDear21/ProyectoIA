package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Generar_Reporte extends JInternalFrame {
	private JLabel lblTipoReporte;
	private JComboBox cboTipoReporte;
	private JButton btnCerrar;
	private JTextArea textResultado;

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
		setTitle("GENERAR REPORTE");
		setBounds(100, 100, 461, 300);
		getContentPane().setLayout(null);
		
		lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(10, 15, 84, 14);
		getContentPane().add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox();
		cboTipoReporte.setBounds(104, 11, 228, 22);
		getContentPane().add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(345, 11, 89, 23);
		getContentPane().add(btnCerrar);
		
		textResultado = new JTextArea();
		textResultado.setBounds(10, 40, 424, 225);
		getContentPane().add(textResultado);

	}

}
