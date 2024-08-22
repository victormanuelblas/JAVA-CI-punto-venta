package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ifrmModifCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtPrecio;
	public JTextField txtAncho;
	public JTextField txtAlto;
	public JTextField txtFondo;
	public JTextField txtQuemadores;
	public JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmModifCocina frame = new ifrmModifCocina();
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
	public ifrmModifCocina() {
		setTitle("Modificar cocina");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(17, 21, 80, 16);
		getContentPane().add(lblModelo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(317, 16, 90, 29);
		getContentPane().add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarModelo(cboModelo.getSelectedIndex());
			}
		});
		cboModelo.setBounds(117, 17, 200, 27);
		getContentPane().add(cboModelo);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarModelo();
				dispose();
			}
		});
		btnGrabar.setBounds(317, 46, 90, 29);
		getContentPane().add(btnGrabar);

		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(17, 56, 80, 16);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(117, 52, 130, 26);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(117, 87, 130, 26);
		getContentPane().add(txtAncho);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(17, 91, 80, 16);
		getContentPane().add(lblAncho);
		
		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(17, 126, 80, 16);
		getContentPane().add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(117, 121, 130, 26);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(117, 157, 130, 26);
		getContentPane().add(txtFondo);
		
		JLabel lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(17, 161, 80, 16);
		getContentPane().add(lblFondo);
		
		JLabel lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(17, 196, 80, 16);
		getContentPane().add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(117, 191, 130, 26);
		getContentPane().add(txtQuemadores);

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
	
	void actualizarModelo() {
		frmPrincipal frmPrin = new frmPrincipal();
		int indx = cboModelo.getSelectedIndex();
		switch (indx) {
		case 0:
			frmPrin.precio0 = Double.parseDouble(txtPrecio.getText());
		 	frmPrin.ancho0 = Double.parseDouble(txtAncho.getText());
		 	frmPrin.alto0 = Double.parseDouble(txtAlto.getText());
		 	frmPrin.fondo0 = Double.parseDouble(txtFondo.getText());
		 	frmPrin.quemadores0 = Integer.parseInt(txtQuemadores.getText());
		 	break;
		case 1:
			frmPrin.precio1 = Double.parseDouble(txtPrecio.getText());
		 	frmPrin.ancho1 = Double.parseDouble(txtAncho.getText());
		 	frmPrin.alto1 = Double.parseDouble(txtAlto.getText());
		 	frmPrin.fondo1 = Double.parseDouble(txtFondo.getText());
		 	frmPrin.quemadores1 = Integer.parseInt(txtQuemadores.getText());
			break;
		case 2:
			frmPrin.precio2 = Double.parseDouble(txtPrecio.getText());
		 	frmPrin.ancho2 = Double.parseDouble(txtAncho.getText());
		 	frmPrin.alto2 = Double.parseDouble(txtAlto.getText());
		 	frmPrin.fondo2 = Double.parseDouble(txtFondo.getText());
		 	frmPrin.quemadores2 = Integer.parseInt(txtQuemadores.getText());
		 	break;
		case 3:
			frmPrin.precio3 = Double.parseDouble(txtPrecio.getText());
		 	frmPrin.ancho3 = Double.parseDouble(txtAncho.getText());
		 	frmPrin.alto3 = Double.parseDouble(txtAlto.getText());
		 	frmPrin.fondo3 = Double.parseDouble(txtFondo.getText());
		 	frmPrin.quemadores3 = Integer.parseInt(txtQuemadores.getText());
		 	break;
		case 4:
			frmPrin.precio4 = Double.parseDouble(txtPrecio.getText());
		 	frmPrin.ancho4 = Double.parseDouble(txtAncho.getText());
		 	frmPrin.alto4 = Double.parseDouble(txtAlto.getText());
		 	frmPrin.fondo4 = Double.parseDouble(txtFondo.getText());
		 	frmPrin.quemadores4 = Integer.parseInt(txtQuemadores.getText());
		 	break;
		}
	}

}
