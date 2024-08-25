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
		setTitle("La Comercial S.A.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
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
				
				escritorio.add(ifrm);
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
				
				escritorio.add(ifrm);
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
				
				escritorio.add(ifrm);
				ifrm.toFront();
				ifrm.show();
			}
		});
		mnMant.add(mnMantListar);
		
		JMenu mnVenta = new JMenu("Ventas");
		menuBar.add(mnVenta);
		
		JMenuItem mntmVentaVender = new JMenuItem("Vender");
		mnVenta.add(mntmVentaVender);
		
		JMenuItem mntmVentaReportes = new JMenuItem("Generar reportes");
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
				
				escritorio.add(ifrm);
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
				escritorio.add(ifrm);
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
				
				escritorio.add(ifrm);
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
				
				escritorio.add(ifrm);
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
				IfrmNosotros frmAbout = new IfrmNosotros();
				
				escritorio.add(frmAbout);
				frmAbout.toFront();
				frmAbout.show();
				
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
