package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane escritorio;
	
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
		mnMant.add(mnMantConsultar);
		
		JMenuItem mnMantModificar = new JMenuItem("Modificar Cocina");
		mnMant.add(mnMantModificar);
		
		JMenuItem mnMantListar = new JMenuItem("Listar cocinas");
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
		mnConf.add(mntmConfigDescuentos);
		
		JMenuItem mntmConfigObsequios = new JMenuItem("Configurar obsequios");
		mnConf.add(mntmConfigObsequios);
		
		JMenuItem mntmConfigCantOptima = new JMenuItem("Configurar cantidad óptima");
		mnConf.add(mntmConfigCantOptima);
		
		JMenuItem mntmConfigCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigCuotaDiaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IfrmCuotaDiaria ifrm = new IfrmCuotaDiaria();
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
