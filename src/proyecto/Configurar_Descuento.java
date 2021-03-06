package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.InternalFrameEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurar_Descuento extends JInternalFrame implements InternalFrameListener, ActionListener {
	private JLabel lblunidad1a5;
	private JLabel lblunidad5a10;
	private JLabel lblunidad11a15;
	private JLabel lbl15amas;
	private JTextField txt1a5Unidades;
	private JTextField txt6a10Unidades;
	private JTextField txt11a15Unidades;
	private JTextField txtMas15Unidades;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Descuento frame = new Configurar_Descuento();
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
	public Configurar_Descuento() {
		addInternalFrameListener(this);
		setTitle("CONFIGURACION DE DESCUENTO");
		setBounds(100, 100, 467, 295);
		getContentPane().setLayout(null);
		
		lblunidad1a5 = new JLabel("1 a 5 Unidades");
		lblunidad1a5.setBounds(10, 17, 105, 14);
		getContentPane().add(lblunidad1a5);
		
		lblunidad5a10 = new JLabel("6 a 10 Unidades");
		lblunidad5a10.setBounds(10, 42, 105, 14);
		getContentPane().add(lblunidad5a10);
		
		lblunidad11a15 = new JLabel("11 a 15 Unidades");
		lblunidad11a15.setBounds(10, 67, 105, 14);
		getContentPane().add(lblunidad11a15);
		
		lbl15amas = new JLabel("M\u00E1s de 15 Unidades");
		lbl15amas.setBounds(10, 92, 105, 14);
		getContentPane().add(lbl15amas);
		
		txt1a5Unidades = new JTextField();
		txt1a5Unidades.setColumns(10);
		txt1a5Unidades.setBounds(125, 11, 96, 20);
		getContentPane().add(txt1a5Unidades);
		
		txt6a10Unidades = new JTextField();
		txt6a10Unidades.setColumns(10);
		txt6a10Unidades.setBounds(125, 36, 96, 20);
		getContentPane().add(txt6a10Unidades);
		
		txt11a15Unidades = new JTextField();
		txt11a15Unidades.setColumns(10);
		txt11a15Unidades.setBounds(125, 61, 96, 20);
		getContentPane().add(txt11a15Unidades);
		
		txtMas15Unidades = new JTextField();
		txtMas15Unidades.setColumns(10);
		txtMas15Unidades.setBounds(125, 86, 96, 20);
		getContentPane().add(txtMas15Unidades);
		
		lblNewLabel = new JLabel("%");
		lblNewLabel.setBounds(231, 14, 47, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(231, 39, 47, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setBounds(231, 64, 47, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(231, 89, 47, 14);
		getContentPane().add(lblNewLabel_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(345, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(345, 42, 89, 23);
		getContentPane().add(btnCancelar);

	}

	public void internalFrameActivated(InternalFrameEvent e) {
	}
	public void internalFrameClosed(InternalFrameEvent e) {
	}
	public void internalFrameClosing(InternalFrameEvent e) {
	}
	public void internalFrameDeactivated(InternalFrameEvent e) {
	}
	public void internalFrameDeiconified(InternalFrameEvent e) {
	}
	public void internalFrameIconified(InternalFrameEvent e) {
	}
	public void internalFrameOpened(InternalFrameEvent e) {
		if (e.getSource() == this) {
			internalFrameOpenedThis(e);
		}
	}
	protected void internalFrameOpenedThis(InternalFrameEvent e) {
		txt1a5Unidades.setText(String.valueOf(Lista_Lavadora.porcentaje1));
		txt6a10Unidades.setText(String.valueOf(Lista_Lavadora.porcentaje2));
		txt11a15Unidades.setText(String.valueOf(Lista_Lavadora.porcentaje3));
		txtMas15Unidades.setText(String.valueOf(Lista_Lavadora.porcentaje4));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		Lista_Lavadora.porcentaje1=Double.parseDouble(txt1a5Unidades.getText());
		Lista_Lavadora.porcentaje2=Double.parseDouble(txt6a10Unidades.getText());
		Lista_Lavadora.porcentaje3=Double.parseDouble(txt11a15Unidades.getText());
		Lista_Lavadora.porcentaje4=Double.parseDouble(txtMas15Unidades.getText());
		JOptionPane.showMessageDialog(null, "Modificacion grabada");
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
