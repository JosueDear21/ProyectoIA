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
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
/*
import proyecto.Acerca_Tienda;
import proyecto.Configurar_Cantidad_Optima;
import proyecto.Configurar_Cuota_Diaria;
import proyecto.Configurar_Descuento;
import proyecto.Configurar_Obsequios;
import proyecto.Consultar_Lavadora;
import proyecto.Generar_Reporte;
import proyecto.Listar_Lavadora;
import proyecto.Mod_Lavadora;
import proyecto.Vender;
import proyecto.Lista_Lavadora;
*/



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
	private JDesktopPane escritorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
		mniConsultarLavadora.addActionListener(this);
		mnMantenimiento.add(mniConsultarLavadora);
		
		mniModificarLavadora = new JMenuItem("Modificar Lavadora");
		mniModificarLavadora.addActionListener(this);
		mnMantenimiento.add(mniModificarLavadora);
		
		mniListarLavadoras = new JMenuItem("Listar Lavadoras");
		mniListarLavadoras.addActionListener(this);
		mnMantenimiento.add(mniListarLavadoras);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mniVender = new JMenuItem("Vender");
		mniVender.addActionListener(this);
		mnVentas.add(mniVender);
		
		mniGenerarReportes = new JMenuItem("Generar Reportes");
		mniGenerarReportes.addActionListener(this);
		mnVentas.add(mniGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mniGenerarDescuentos = new JMenuItem("Configurar Descuentos");
		mniGenerarDescuentos.addActionListener(this);
		mnConfiguracion.add(mniGenerarDescuentos);
		
		mniConfigurarObsequio = new JMenuItem("Configurar Obsequio");
		mniConfigurarObsequio.addActionListener(this);
		mnConfiguracion.add(mniConfigurarObsequio);
		
		mniConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad Optima");
		mniConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mniConfigurarCantidadOptima);
		
		mniConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mniConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mniConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mniAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mniAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mniAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		escritorio = new JDesktopPane();
		contentPane.add(escritorio);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mniAcercaDeTienda) {
			actionPerformedMniAcercaDeTienda(e);
		}
		if (e.getSource() == mniConfigurarCuotaDiaria) {
			actionPerformedMniConfigurarCuotaDiaria(e);
		}
		if (e.getSource() == mniConfigurarCantidadOptima) {
			actionPerformedMniConfigurarCantidadOptima(e);
		}
		if (e.getSource() == mniConfigurarObsequio) {
			actionPerformedMniConfigurarObsequio(e);
		}
		if (e.getSource() == mniGenerarDescuentos) {
			actionPerformedMniGenerarDescuentos(e);
		}
		if (e.getSource() == mniGenerarReportes) {
			actionPerformedMniGenerarReportes(e);
		}
		if (e.getSource() == mniVender) {
			actionPerformedMniVender(e);
		}
		if (e.getSource() == mniListarLavadoras) {
			actionPerformedMniListarLavadoras(e);
		}
		if (e.getSource() == mniModificarLavadora) {
			actionPerformedMniModificarLavadora(e);
		}
		if (e.getSource() == mniConsultarLavadora) {
			actionPerformedMniConsultarLavadora(e);
		}
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
	//Mantenimiento - Consultar Lavadora
	protected void actionPerformedMniConsultarLavadora(ActionEvent e) {
		Consultar_Lavadora();
	}
	
	//Metodo Consultar Lavadora
	public void Consultar_Lavadora() {
		Consultar_Lavadora consultar = new Consultar_Lavadora();
		escritorio.add(consultar);
		consultar.setVisible(true);
	}
	
	//Mantenimiento - Modificar Lavadora
	protected void actionPerformedMniModificarLavadora(ActionEvent e) {
		Modificar_Lavadora();
	}
	
	//Metodo Modificar Lavadora
	public void Modificar_Lavadora() {
		Mod_Lavadora modificar = new Mod_Lavadora();
		escritorio.add(modificar);
		modificar.setVisible(true);
	}
	
	//Mantenimiento - Listar Lavadoras
	protected void actionPerformedMniListarLavadoras(ActionEvent e) {
		Listar_Lavadora();
	}
	
	//Metodo Listar Lavadora
	public void Listar_Lavadora() {
		Listar_Lavadora listar = new Listar_Lavadora();
		escritorio.add(listar);
		listar.setVisible(true);
	}
	
	//Ventas - Vender
	protected void actionPerformedMniVender(ActionEvent e) {
		Vender();
	}
	
	//Metodo Vender
	public void Vender() {
		Vender _vender = new Vender();
		escritorio.add(_vender);
		_vender.setVisible(true);
	}
	
	//Ventas - Generar Reporte
	protected void actionPerformedMniGenerarReportes(ActionEvent e) {
		GenerarReporte();
	}
	
	//Metodo Generar Reporte
	public void GenerarReporte() {
		Generar_Reporte reporte = new Generar_Reporte();
		escritorio.add(reporte);
		reporte.setVisible(true);
	}
	
	//Configuracion - Generar Descuento
	protected void actionPerformedMniGenerarDescuentos(ActionEvent e) {
		Configurar_Descuento();
	}
	
	//Metodo Configurar Descuentos
	public void Configurar_Descuento() {
		Configurar_Descuento descuento = new Configurar_Descuento();
		escritorio.add(descuento);
		descuento.setVisible(true);
	}
	
	//Configuracion - Configurar Obsequio
	protected void actionPerformedMniConfigurarObsequio(ActionEvent e) {
		Configurar_Obsequio();
	}
	
	//Metodo Configurar	Obsequios
	public void Configurar_Obsequio() {
		Configurar_Obsequios obsequio = new Configurar_Obsequios();
		escritorio.add(obsequio);
		obsequio.setVisible(true);
	}
	
	//Configuracion - Configurar Cantidad
	protected void actionPerformedMniConfigurarCantidadOptima(ActionEvent e) {
		Cantidad_CantidadDiaria();
	}
	
	//Metodo Configurar Cantidad Optima
	public void Cantidad_CantidadDiaria() {
		Configurar_Cantidad_Optima optima = new Configurar_Cantidad_Optima();
		escritorio.add(optima);
		optima.setVisible(true);
	}
	
	//Configuracion - Configurar Cuota Diaria
	protected void actionPerformedMniConfigurarCuotaDiaria(ActionEvent e) {
		Cantidad_CuotaDiaria();
	}
	
	//Metodo Configurar Cuota Diaria
	public void Cantidad_CuotaDiaria() {
		Configurar_Cuota_Diaria cuota = new Configurar_Cuota_Diaria();
		escritorio.add(cuota);
		cuota.setVisible(true);
	}
	
	//Ayuda - Acerca de Tienda
	protected void actionPerformedMniAcercaDeTienda(ActionEvent e) {
		AcercaDeTienda();
	}
	
	//Metodo Acerca de Tienda
	public void AcercaDeTienda() {
		Acerca_Tienda acerca = new Acerca_Tienda();
		escritorio.add(acerca);
		acerca.setVisible(true);				
	}
}
