package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mod_Lavadora extends JInternalFrame implements ItemListener, ComponentListener, ActionListener {
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
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mod_Lavadora frame = new Mod_Lavadora();
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
	public Mod_Lavadora() {
		addComponentListener(this);
		setTitle("MODIFICAR LAVADORA");
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
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(121, 37, 152, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(121, 62, 152, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(121, 87, 152, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(121, 112, 152, 20);
		getContentPane().add(txtFondo);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(121, 137, 152, 20);
		getContentPane().add(txtCapacidad);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(312, 11, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(312, 36, 89, 23);
		getContentPane().add(btnGrabar);

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
		//ListaModelo();
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		modificar();
	}
	
	private void modificar() {

		if(cboModeloLavadora.getSelectedIndex()==0) {
			Lista_Lavadora.precio0 = Double.parseDouble(txtPrecio.getText());
			Lista_Lavadora.fondo0 = Double.parseDouble(txtFondo.getText());
			Lista_Lavadora.ancho0 = Double.parseDouble(txtAncho.getText());
			Lista_Lavadora.alto0 = Double.parseDouble(txtAlto.getText());
			Lista_Lavadora.capacidad0 = Double.parseDouble(txtCapacidad.getText());
		}
		if(cboModeloLavadora.getSelectedIndex()==1) {
			Lista_Lavadora.precio1 = Double.parseDouble(txtPrecio.getText());
			Lista_Lavadora.fondo1 = Double.parseDouble(txtFondo.getText());
			Lista_Lavadora.ancho1 = Double.parseDouble(txtAncho.getText());
			Lista_Lavadora.alto1 = Double.parseDouble(txtAlto.getText());
			Lista_Lavadora.capacidad1 =Double.parseDouble(txtCapacidad.getText());
		}
		if(cboModeloLavadora.getSelectedIndex()==2) {
			Lista_Lavadora.precio2 = Double.parseDouble(txtPrecio.getText());
			Lista_Lavadora.fondo2 = Double.parseDouble(txtFondo.getText());
			Lista_Lavadora.ancho2 = Double.parseDouble(txtAncho.getText());
			Lista_Lavadora.alto2 = Double.parseDouble(txtAlto.getSelectedText());
			Lista_Lavadora.capacidad2 = Double.parseDouble(txtCapacidad.getText());
		}
		if(cboModeloLavadora.getSelectedIndex()==3) {
			Lista_Lavadora.precio3 = Double.parseDouble(txtPrecio.getText());
			Lista_Lavadora.fondo3 =Double.parseDouble(txtFondo.getText());
			Lista_Lavadora.ancho3 = Double.parseDouble(txtAncho.getText());
			Lista_Lavadora.alto3 = Double.parseDouble(txtAlto.getText());
			Lista_Lavadora.capacidad3 = Double.parseDouble(txtCapacidad.getText());
		}
		if(cboModeloLavadora.getSelectedIndex()==4) {
			Lista_Lavadora.precio4 = Double.parseDouble(txtPrecio.getText());
			Lista_Lavadora.fondo4 = Double.parseDouble(txtFondo.getText());
			Lista_Lavadora.ancho4 = Double.parseDouble(txtAncho.getText());
			Lista_Lavadora.alto4 = Double.parseDouble(txtAlto.getText());
			Lista_Lavadora.capacidad4 = Double.parseDouble(txtCapacidad.getText());
		}
	}
}
