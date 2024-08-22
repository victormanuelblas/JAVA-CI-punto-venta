package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ifrmConsCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JComboBox cboModelo;
	public JTextField txtPrecio;
	public JTextField txtAncho;
	public JTextField txtAlto;
	public JTextField txtFondo;
	public JTextField txtQuemadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmConsCocina frame = new ifrmConsCocina();
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
	public ifrmConsCocina() {
		setClosable(true);
		setTitle("Consultar cocina");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(20, 24, 80, 16);
		getContentPane().add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarModelo(cboModelo.getSelectedIndex());
			}
		});
		cboModelo.setBounds(120, 20, 200, 27);
		getContentPane().add(cboModelo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(320, 19, 90, 29);
		getContentPane().add(btnCerrar);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(20, 59, 80, 16);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setBounds(120, 55, 130, 26);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(20, 94, 80, 16);
		getContentPane().add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setEnabled(false);
		txtAncho.setBounds(120, 90, 130, 26);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(20, 129, 80, 16);
		getContentPane().add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setEnabled(false);
		txtAlto.setBounds(120, 124, 130, 26);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		JLabel lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(20, 164, 80, 16);
		getContentPane().add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setEnabled(false);
		txtFondo.setBounds(120, 160, 130, 26);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		JLabel lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(20, 199, 80, 16);
		getContentPane().add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEnabled(false);
		txtQuemadores.setBounds(120, 194, 130, 26);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);
		
	}
	
	void cambiarModelo(int indx) {
		frmPrincipal frmPrin = new frmPrincipal();
		
		switch (indx) {
		case 0:
		 	txtPrecio.setText("" + frmPrin.precio0);
		 	txtAncho.setText("" + frmPrin.ancho0);
		 	txtAlto.setText("" + frmPrin.alto0);
		 	txtFondo.setText("" + frmPrin.fondo0);
		 	txtQuemadores.setText("" + frmPrin.quemadores0);
		 	break;
		case 1:
		 	txtPrecio.setText("" + frmPrin.precio1);
		 	txtAncho.setText("" + frmPrin.ancho1);
		 	txtAlto.setText("" + frmPrin.alto1);
		 	txtFondo.setText("" + frmPrin.fondo1);
		 	txtQuemadores.setText("" + frmPrin.quemadores1);
		 	break;
		case 2:
		 	txtPrecio.setText("" + frmPrin.precio2);
		 	txtAncho.setText("" + frmPrin.ancho2);
		 	txtAlto.setText("" + frmPrin.alto2);
		 	txtFondo.setText("" + frmPrin.fondo2);
		 	txtQuemadores.setText("" + frmPrin.quemadores2);
		 	break;
		case 3:
		 	txtPrecio.setText("" + frmPrin.precio3);
		 	txtAncho.setText("" + frmPrin.ancho3);
		 	txtAlto.setText("" + frmPrin.alto3);
		 	txtFondo.setText("" + frmPrin.fondo3);
		 	txtQuemadores.setText("" + frmPrin.quemadores3);
		 	break;
		case 4:
		 	txtPrecio.setText("" + frmPrin.precio4);
		 	txtAncho.setText("" + frmPrin.ancho4);
		 	txtAlto.setText("" + frmPrin.alto4);
		 	txtFondo.setText("" + frmPrin.fondo4);
		 	txtQuemadores.setText("" + frmPrin.quemadores4);
		 	break;
		}
	}

}
