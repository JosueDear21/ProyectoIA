package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mniSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mniConsultarLavadora;
	private JMenuItem mniModificarLavadora;
	private JMenuItem mniListarLavadoras;
	private JMenu mnVentas;
	private JMenuItem mniVender;
	private JMenuItem mniGenerarReportes;
	private JMenu mnConfiguracion;
	private JMenuItem mniGenerarDescuentos;
	private JMenuItem mniConfigurarObsequio;
	private JMenuItem mniConfigurarCantidadOptima;
	private JMenuItem mniConfigurarCuotaDiaria;
	private JMenu mnAyuda;
	private JMenuItem mniAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mniSalir = new JMenuItem("Salir");
		mniSalir.addActionListener(this);
		mnArchivo.add(mniSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mniConsultarLavadora = new JMenuItem("Consultar Lavadora");
		mnMantenimiento.add(mniConsultarLavadora);
		
		mniModificarLavadora = new JMenuItem("Modificar Lavadora");
		mnMantenimiento.add(mniModificarLavadora);
		
		mniListarLavadoras = new JMenuItem("Listar Lavadoras");
		mnMantenimiento.add(mniListarLavadoras);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mniVender = new JMenuItem("Vender");
		mnVentas.add(mniVender);
		
		mniGenerarReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mniGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mniGenerarDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracion.add(mniGenerarDescuentos);
		
		mniConfigurarObsequio = new JMenuItem("Configurar Obsequio");
		mnConfiguracion.add(mniConfigurarObsequio);
		
		mniConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad Optima");
		mnConfiguracion.add(mniConfigurarCantidadOptima);
		
		mniConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mnConfiguracion.add(mniConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mniAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mniAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mniSalir) {
			actionPerformedMniSalir(e);
		}
	}
	protected void actionPerformedMniSalir(ActionEvent e) {
		Salir();
	}
	//Metodo Salir
	public void Salir() {
		int valor = JOptionPane.showConfirmDialog(this,"Desea salir del programa", "Advertencia", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		if(valor == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "Gracias por usar nuestro software","Agradecimiento",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
