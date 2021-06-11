package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Listar_Lavadora extends JInternalFrame implements ActionListener {
	private JTextArea txtLista;
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scrollPane;

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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 216);
		getContentPane().add(scrollPane);
		
		txtLista = new JTextArea();
		scrollPane.setViewportView(txtLista);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(112, 238, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(242, 238, 89, 23);
		getContentPane().add(btnListar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		ListaLavadoras();
	}
	
	public void ListaLavadoras() {

			txtLista.setText("LISTADO DE LAVADORAS"+"\n\n");
			
			txtLista.append("Modelo	: "+Lista_Lavadora.modelo0+"\n");
			txtLista.append("Precio	: "+"S/. "+String.valueOf(Lista_Lavadora.precio0)+"\n");
			txtLista.append("Profundidad	: "+String.valueOf(Lista_Lavadora.fondo0)+" cm"+"\n");
			txtLista.append("Ancho	: "+String.valueOf(Lista_Lavadora.ancho0)+" cm"+"\n");
			txtLista.append("Alto	: "+String.valueOf(Lista_Lavadora.alto0)+" cm"+"\n");
			txtLista.append("Capacidad	: "+String.valueOf(Lista_Lavadora.capacidad0)+" Kg"+"\n");
			txtLista.append("\n");
			txtLista.append("Modelo	: "+Lista_Lavadora.modelo1+"\n");
			txtLista.append("Precio	: "+"S/. "+String.valueOf(Lista_Lavadora.precio1)+"\n");
			txtLista.append("Profundidad	: "+String.valueOf(Lista_Lavadora.fondo1)+" cm"+"\n");
			txtLista.append("Ancho	: "+String.valueOf(Lista_Lavadora.ancho1)+" cm"+"\n");
			txtLista.append("Alto	: "+String.valueOf(Lista_Lavadora.alto1)+" cm"+"\n");
			txtLista.append("Capacidad	: "+String.valueOf(Lista_Lavadora.capacidad1)+" Kg"+"\n");
			txtLista.append("\n");
			txtLista.append("Modelo	: "+Lista_Lavadora.modelo2+"\n");
			txtLista.append("Precio	: "+"S/. "+String.valueOf(Lista_Lavadora.precio2)+"\n");
			txtLista.append("Profundidad	: "+String.valueOf(Lista_Lavadora.fondo2)+" cm"+"\n");
			txtLista.append("Ancho	: "+String.valueOf(Lista_Lavadora.ancho2)+" cm"+"\n");
			txtLista.append("Alto	: "+String.valueOf(Lista_Lavadora.alto2)+" cm"+"\n");
			txtLista.append("Capacidad	: "+String.valueOf(Lista_Lavadora.capacidad2)+" Kg"+"\n");
			txtLista.append("\n");
			txtLista.append("Modelo	: "+Lista_Lavadora.modelo3+"\n");
			txtLista.append("Precio	: "+"S/. "+String.valueOf(Lista_Lavadora.precio3)+"\n");
			txtLista.append("Profundidad	: "+String.valueOf(Lista_Lavadora.fondo3)+" cm"+"\n");
			txtLista.append("Ancho	: "+String.valueOf(Lista_Lavadora.ancho3)+" cm"+"\n");
			txtLista.append("Alto	: "+String.valueOf(Lista_Lavadora.alto3)+" cm"+"\n");
			txtLista.append("Capacidad	: "+String.valueOf(Lista_Lavadora.capacidad3)+" Kg"+"\n");
			txtLista.append("\n");
			txtLista.append("Modelo	: "+Lista_Lavadora.modelo4+"\n");
			txtLista.append("Precio	: "+"S/. "+String.valueOf(Lista_Lavadora.precio4)+"\n");
			txtLista.append("Profundidad	: "+String.valueOf(Lista_Lavadora.fondo4)+" cm"+"\n");
			txtLista.append("Ancho	: "+String.valueOf(Lista_Lavadora.ancho4)+" cm"+"\n");
			txtLista.append("Alto	: "+String.valueOf(Lista_Lavadora.alto4)+" cm"+"\n");
			txtLista.append("Capacidad	: "+String.valueOf(Lista_Lavadora.capacidad4)+" Kg"+"\n");
		
		
	}
}
