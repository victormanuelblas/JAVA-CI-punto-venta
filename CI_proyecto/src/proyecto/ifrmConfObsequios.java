package proyecto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ifrmConfObsequios extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtH1;
	public JTextField txtH5;
	public JTextField txtM5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmConfObsequios frame = new ifrmConfObsequios();
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
	public ifrmConfObsequios() {
		setClosable(true);
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblH1 = new JLabel("1 unidad");
		lblH1.setBounds(20, 40, 100, 16);
		getContentPane().add(lblH1);
		
		txtH1 = new JTextField();
		txtH1.setBounds(150, 35, 100, 26);
		getContentPane().add(txtH1);
		txtH1.setColumns(10);
				
		JLabel lblH5 = new JLabel("2 a 5 unidades");
		lblH5.setBounds(20, 70, 100, 16);
		getContentPane().add(lblH5);
		
		txtH5 = new JTextField();
		txtH5.setBounds(150, 65, 100, 26);
		getContentPane().add(txtH5);
		txtH5.setColumns(10);
		
		JLabel lblM5 = new JLabel("6 a más unidades");
		lblM5.setBounds(20, 100, 118, 16);
		getContentPane().add(lblM5);
		
		txtM5 = new JTextField();
		txtM5.setBounds(150, 95, 100, 26);
		getContentPane().add(txtM5);
		txtM5.setColumns(10);
				
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarObsequios();
			}
		});
		btnAceptar.setBounds(289, 35, 117, 29);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(289, 74, 117, 29);
		getContentPane().add(btnCancelar);

	}
	
	void actualizarObsequios() {
		frmPrincipal frmprin = new frmPrincipal();
		frmprin.obsequio1 = txtH1.getText();
		frmprin.obsequio2 = txtH5.getText();
		frmprin.obsequio3 = txtM5.getText();
	}

}
