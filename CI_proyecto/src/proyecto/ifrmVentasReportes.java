package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ifrmVentasReportes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JLabel lblTipoReporte;
	private JComboBox cboTipoReporte;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmVentasReportes frame = new ifrmVentasReportes();
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
	public ifrmVentasReportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
				
				dispose();
			}
		});
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(10, 15, 97, 14);
		getContentPane().add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox();
		cboTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relación al precio promedio", "Pecios en relación al precio promedio", "Promedios, menores y mayores"}));
		cboTipoReporte.setBounds(118, 11, 181, 22);
		getContentPane().add(cboTipoReporte);
		scrollPane.setBounds(10, 50, 414, 209);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);

	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	}
}
