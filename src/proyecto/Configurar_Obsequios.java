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

public class Configurar_Obsequios extends JInternalFrame implements InternalFrameListener, ActionListener {
	private JLabel lblUnidad;
	private JLabel lblUnidad2a5;
	private JLabel lblUnidad6Mas;
	private JTextField txtUnidad1;
	private JTextField txtUnidad2a5;
	private JTextField txtUnidad6mas;
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
		addInternalFrameListener(this);
		setTitle("CONFIGURACION DE OBSEQUIOS");
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
		
		txtUnidad2a5 = new JTextField();
		txtUnidad2a5.setColumns(10);
		txtUnidad2a5.setBounds(125, 36, 159, 20);
		getContentPane().add(txtUnidad2a5);
		
		txtUnidad6mas = new JTextField();
		txtUnidad6mas.setColumns(10);
		txtUnidad6mas.setBounds(125, 61, 159, 20);
		getContentPane().add(txtUnidad6mas);
		
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
		txtUnidad1.setText(Lista_Lavadora.obsequio1);
		txtUnidad2a5.setText(Lista_Lavadora.obsequio2);
		txtUnidad6mas.setText(Lista_Lavadora.obsequio3);
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
		Lista_Lavadora.obsequio1=txtUnidad1.getText();
		Lista_Lavadora.obsequio2=txtUnidad2a5.getText();
		Lista_Lavadora.obsequio3=txtUnidad6mas.getText();
		 JOptionPane.showMessageDialog(null, "Modificacion grabada");
		 			
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
