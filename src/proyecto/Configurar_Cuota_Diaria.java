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

public class Configurar_Cuota_Diaria extends JInternalFrame implements InternalFrameListener, ActionListener {
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
		addInternalFrameListener(this);
		setTitle("CONFIGURACION DE CUOTA DIARIA");
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
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(345, 13, 89, 23);
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
		txtCuotaDiaria.setText(String.valueOf(Lista_Lavadora.cuotaDiaria));
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
		Lista_Lavadora.cuotaDiaria=Double.parseDouble(txtCuotaDiaria.getText());
		JOptionPane.showMessageDialog(null, "Modificacion grabada");
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
