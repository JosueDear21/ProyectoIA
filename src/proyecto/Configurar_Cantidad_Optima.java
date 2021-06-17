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

public class Configurar_Cantidad_Optima extends JInternalFrame implements InternalFrameListener, ActionListener {
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
		addInternalFrameListener(this);
		setTitle("CONFIGURACION DE CANTIDAD OPTIMA");
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
		txtCantidadOptima.setText(String.valueOf(Lista_Lavadora.cantidadOptima));
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
		Lista_Lavadora.cantidadOptima=Integer.parseInt(txtCantidadOptima.getText());
		JOptionPane.showMessageDialog(null, "Modificacion grabada");
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
