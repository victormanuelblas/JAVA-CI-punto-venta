package proyecto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ifrmConfCantOptima extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtCantidad;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmConfCantOptima frame = new ifrmConfCantOptima();
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
	public ifrmConfCantOptima() {
		setClosable(true);
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad óptima de unidades vendidas:");
		lblNewLabel.setBounds(16, 28, 257, 16);
		getContentPane().add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(272, 23, 55, 26);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarCantidadOptima();
			}
		});
		btnAceptar.setBounds(339, 23, 117, 29);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(339, 64, 117, 29);
		getContentPane().add(btnCancelar);


	}
	
	void actualizarCantidadOptima () {
		frmPrincipal frmprin = new frmPrincipal();
		frmprin.cantidadOptima = Integer.parseInt(txtCantidad.getText()); 
	}

}
