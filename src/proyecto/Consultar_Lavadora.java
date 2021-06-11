package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;

public class Consultar_Lavadora extends JInternalFrame implements ItemListener, ComponentListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblCapacidad;
	private JComboBox cboModeloLavadora;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtCapacidad;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar_Lavadora frame = new Consultar_Lavadora();
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
	public Consultar_Lavadora() {
		addComponentListener(this);
		setTitle("CONSULTAR LAVADORA");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 15, 101, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 40, 101, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 65, 101, 14);
		getContentPane().add(lblAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 90, 101, 14);
		getContentPane().add(lblAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 115, 101, 14);
		getContentPane().add(lblFondo);
		
		lblCapacidad = new JLabel("Capacidad (kg)");
		lblCapacidad.setBounds(10, 140, 101, 14);
		getContentPane().add(lblCapacidad);
		
		cboModeloLavadora = new JComboBox();
		cboModeloLavadora.addItemListener(this);
		//cboModeloLavadora.setModel(new DefaultComboBoxModel(new String[] {Lista_Lavadora.modelo0,Lista_Lavadora.modelo1,Lista_Lavadora.modelo2,Lista_Lavadora.modelo3,Lista_Lavadora.modelo4}));
		cboModeloLavadora.setBounds(121, 11, 152, 22);
		getContentPane().add(cboModeloLavadora);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(121, 37, 152, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(121, 62, 152, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(121, 87, 152, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(121, 112, 152, 20);
		getContentPane().add(txtFondo);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setEditable(false);
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(121, 137, 152, 20);
		getContentPane().add(txtCapacidad);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(312, 11, 89, 23);
		getContentPane().add(btnCerrar);

	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboModeloLavadora) {
			itemStateChangedCboModeloLavadora(e);
		}
	}
	protected void itemStateChangedCboModeloLavadora(ItemEvent e) {
		Mostrar();
	}
	
	private void Mostrar() {
		if(cboModeloLavadora.getSelectedIndex()==0) {
			txtPrecio.setText(String.valueOf(Lista_Lavadora.precio0));
			txtFondo.setText(String.valueOf(Lista_Lavadora.fondo0));
			txtAncho.setText(String.valueOf(Lista_Lavadora.ancho0));
			txtAlto.setText(String.valueOf(Lista_Lavadora.alto0));
			txtCapacidad.setText(String.valueOf(Lista_Lavadora.capacidad0));
		}
		
		else if(cboModeloLavadora.getSelectedIndex()==1) {			
			txtPrecio.setText(String.valueOf(Lista_Lavadora.precio1));
			txtFondo.setText(String.valueOf(Lista_Lavadora.fondo1));
			txtAncho.setText(String.valueOf(Lista_Lavadora.ancho1));
			txtAlto.setText(String.valueOf(Lista_Lavadora.alto1));
			txtCapacidad.setText(String.valueOf(Lista_Lavadora.capacidad1));
		}
		else	if(cboModeloLavadora.getSelectedIndex()==2) {
			txtPrecio.setText(String.valueOf(Lista_Lavadora.precio2));
			txtFondo.setText(String.valueOf(Lista_Lavadora.fondo2));
			txtAncho.setText(String.valueOf(Lista_Lavadora.ancho2));
			txtAlto.setText(String.valueOf(Lista_Lavadora.alto2));
			txtCapacidad.setText(String.valueOf(Lista_Lavadora.capacidad2));
		}
		
		else if(cboModeloLavadora.getSelectedIndex()==3) {
			txtPrecio.setText(String.valueOf(Lista_Lavadora.precio3));
			txtFondo.setText(String.valueOf(Lista_Lavadora.fondo3));
			txtAncho.setText(String.valueOf(Lista_Lavadora.ancho3));
			txtAlto.setText(String.valueOf(Lista_Lavadora.alto3));
			txtCapacidad.setText(String.valueOf(Lista_Lavadora.capacidad3));
		}
		else if(cboModeloLavadora.getSelectedIndex()==4) {
			txtPrecio.setText(String.valueOf(Lista_Lavadora.precio4));
			txtFondo.setText(String.valueOf(Lista_Lavadora.fondo4));
			txtAncho.setText(String.valueOf(Lista_Lavadora.ancho4));
			txtAlto.setText(String.valueOf(Lista_Lavadora.alto4));
			txtCapacidad.setText(String.valueOf(Lista_Lavadora.capacidad4));
		}
	}
	public void componentHidden(ComponentEvent e) {
	}
	public void componentMoved(ComponentEvent e) {
	}
	public void componentResized(ComponentEvent e) {
	}
	public void componentShown(ComponentEvent e) {
		if (e.getSource() == this) {
			componentShownThis(e);
		}
	}
	protected void componentShownThis(ComponentEvent e) {
		Lista();
	}
	private void Lista() {
		cboModeloLavadora.addItem(Lista_Lavadora.modelo0);
		cboModeloLavadora.addItem(Lista_Lavadora.modelo1);
		cboModeloLavadora.addItem(Lista_Lavadora.modelo2);
		cboModeloLavadora.addItem(Lista_Lavadora.modelo3);
		cboModeloLavadora.addItem(Lista_Lavadora.modelo4);
	}
	/* Sin uso
	private void ListaModelo() {
		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		modelo.addElement(Lista_Lavadora.modelo0);
		modelo.addElement(Lista_Lavadora.modelo1);
		modelo.addElement(Lista_Lavadora.modelo2);
		modelo.addElement(Lista_Lavadora.modelo3);
		modelo.addElement(Lista_Lavadora.modelo4);

		cboModeloLavadora.setModel(modelo);
	}
	*/
}
