package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class frmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane escritorio;
	
	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	//ventas primera cocina
	public static int cantidadVenta0 = 0;
	public static int cantidadUnidadesVenta0 = 0;
	public static double importeVentaTotal0 = 0.0;
	public static double aporteCuotaDiaria0 = 0.0;
	//ventas primera cocina1
	public static int cantidadVenta1 = 0;
	public static int cantidadUnidadesVenta1 = 0;
	public static double importeVentaTotal1 = 0.0;
	public static double aporteCuotaDiaria1 = 0.0;
	//ventas primera cocina2
	public static int cantidadVenta2 = 0;
	public static int cantidadUnidadesVenta2 = 0;
	public static double importeVentaTotal2 = 0.0;
	public static double aporteCuotaDiaria2 = 0.0;
	//ventas primera cocina3
	public static int cantidadVenta3 = 0;
	public static int cantidadUnidadesVenta3 = 0;
	public static double importeVentaTotal3 = 0.0;
	public static double aporteCuotaDiaria3 = 0.0;
	//ventas primera cocina4
	public static int cantidadVenta4 = 0;
	public static int cantidadUnidadesVenta4 = 0;
	public static double importeVentaTotal4 = 0.0;
	public static double aporteCuotaDiaria4 = 0.0;
	//ventas totales
	public static int totalVentas = 0;
	public static double totalImporteVentas = 0.0;
	// Cesar espinoza
	public static int contadorVenta0, contadorVenta1, contadorVenta2, contadorVenta3, contadorVenta4;
	public static int cantUniVendidas0, cantUniVendidas1, cantUniVendidas2, cantUniVendidas3, cantUniVendidas4;
	public static double importeAcumulado0, importeAcumulado1, importeAcumulado2, importeAcumulado3,importeAcumulado4;
	public static double porcentajeCuota0, porcentajeCuota1, porcentajeCuota2, porcentajeCuota3, porcentajeCuota4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("Grupo 02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArch = new JMenu("Archivo");
		menuBar.add(mnArch);
		
		JMenuItem mnArchSalir = new JMenuItem("Salir");
		mnArchSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}			
		});
		mnArch.add(mnArchSalir);
		
		JMenu mnMant = new JMenu("Mantenimiento");
		menuBar.add(mnMant);
		
		JMenuItem mnMantConsultar = new JMenuItem("Consultar cocina");
		mnMantConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmConsCocina ifrm = new ifrmConsCocina();
				//ifrm.txtCantidad.setText("" + cantidadOptima);
				ifrm.cboModelo.addItem(modelo0);
				ifrm.cboModelo.addItem(modelo1);
				ifrm.cboModelo.addItem(modelo2);
				ifrm.cboModelo.addItem(modelo3);
				ifrm.cboModelo.addItem(modelo4);
				
				ifrm.txtPrecio.setText("" + precio0);
				ifrm.txtAncho.setText("" + ancho0);
				ifrm.txtAlto.setText("" + alto0);
				ifrm.txtFondo.setText("" + fondo0);
				ifrm.txtQuemadores.setText("" + quemadores0);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnMant.add(mnMantConsultar);
		
		JMenuItem mnMantModificar = new JMenuItem("Modificar Cocina");
		mnMantModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmModifCocina ifrm = new ifrmModifCocina();
				//ifrm.txtCantidad.setText("" + cantidadOptima);
				ifrm.cboModelo.addItem(modelo0);
				ifrm.cboModelo.addItem(modelo1);
				ifrm.cboModelo.addItem(modelo2);
				ifrm.cboModelo.addItem(modelo3);
				ifrm.cboModelo.addItem(modelo4);
				
				ifrm.txtPrecio.setText("" + precio0);
				ifrm.txtAncho.setText("" + ancho0);
				ifrm.txtAlto.setText("" + alto0);
				ifrm.txtFondo.setText("" + fondo0);
				ifrm.txtQuemadores.setText("" + quemadores0);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnMant.add(mnMantModificar);
		
		JMenuItem mnMantListar = new JMenuItem("Listar cocinas");
		mnMantListar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		mnMantListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmListaCocinas ifrm = new ifrmListaCocinas();
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnMant.add(mnMantListar);
		
		JMenu mnVenta = new JMenu("Ventas");
		menuBar.add(mnVenta);
		
		JMenuItem mntmVentaVender = new JMenuItem("Vender");
		mntmVentaVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmVentaCocina ifrm = new ifrmVentaCocina();
				
				ifrm.cboModelo.addItem(modelo0);
				ifrm.cboModelo.addItem(modelo1);
				ifrm.cboModelo.addItem(modelo2);
				ifrm.cboModelo.addItem(modelo3);
				ifrm.cboModelo.addItem(modelo4);
				
				ifrm.txtPrecio.setText("" + precio0);
				ifrm.txtCantidad.setText("0");
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();

			}
		});
		mnVenta.add(mntmVentaVender);
		
		JMenuItem mntmVentaReportes = new JMenuItem("Generar reportes");
		mntmVentaReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmVentaReportes ifrm = new ifrmVentaReportes();
				
				ifrm.cboTipoReporte.addItem("Ventas por modelo");
				ifrm.cboTipoReporte.addItem("Ventas en relación a la venta óptima");
				ifrm.cboTipoReporte.addItem("Precios en relación al precio promedio");
				ifrm.cboTipoReporte.addItem("Promedios, menores y mayores");
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnVenta.add(mntmVentaReportes);
		
		JMenu mnConf = new JMenu("Configuración");
		menuBar.add(mnConf);
		
		JMenuItem mntmConfigDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmConfDescuentos ifrm = new ifrmConfDescuentos();
				ifrm.txtH5.setText("" + porcentaje1);
				ifrm.txtH10.setText("" + porcentaje2);
				ifrm.txtH15.setText("" + porcentaje3);
				ifrm.txtM15.setText("" + porcentaje4);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnConf.add(mntmConfigDescuentos);
		
		JMenuItem mntmConfigObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigObsequios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmConfObsequios ifrm = new ifrmConfObsequios();
				//ifrm.txtMonto.setText("" + cuotaDiaria);
				ifrm.txtH1.setText("" + obsequio1);
				ifrm.txtH5.setText("" + obsequio2);
				ifrm.txtM5.setText("" + obsequio3);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnConf.add(mntmConfigObsequios);
		
		JMenuItem mntmConfigCantOptima = new JMenuItem("Configurar cantidad óptima");
		mntmConfigCantOptima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ifrmConfCantOptima ifrm = new ifrmConfCantOptima();
				ifrm.txtCantidad.setText("" + cantidadOptima);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnConf.add(mntmConfigCantOptima);
		
		JMenuItem mntmConfigCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigCuotaDiaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IfrmCuotaDiaria ifrm = new IfrmCuotaDiaria();
				ifrm.txtMonto.setText("" + cuotaDiaria);
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnConf.add(mntmConfigCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyudaAcerca = new JMenuItem("Acerca de la tienda");
		mntmAyudaAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IfrmNosotros ifrm = new IfrmNosotros();
				
				int pointX = escritorio.getWidth() / 2,pointY = escritorio.getHeight() / 2;
				escritorio.add(ifrm);
				ifrm.setLocation(pointX - ifrm.getWidth() / 2, pointY - ifrm.getHeight() / 2);
				ifrm.toFront();
				ifrm.show();
				
			}
		});
		mnAyuda.add(mntmAyudaAcerca);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		escritorio = new JDesktopPane();
		escritorio.setBackground(Color.WHITE);
		contentPane.add(escritorio, BorderLayout.CENTER);

	}
	
}
