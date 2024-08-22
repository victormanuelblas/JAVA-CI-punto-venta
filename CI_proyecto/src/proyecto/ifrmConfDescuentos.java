package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ifrmConfDescuentos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtH5;
	public JTextField txtH10;
	public JTextField txtH15;
	public JTextField txtM15;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmConfDescuentos frame = new ifrmConfDescuentos();
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
	public ifrmConfDescuentos() {
		getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		setClosable(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblH5 = new JLabel("1 a 5 unidades");
		lblH5.setBounds(20, 40, 100, 16);
		getContentPane().add(lblH5);
		
		txtH5 = new JTextField();
		txtH5.setBounds(130, 35, 70, 26);
		getContentPane().add(txtH5);
		txtH5.setColumns(10);
		
		JLabel lblH5P = new JLabel("%");
		lblH5P.setBounds(200, 40, 30, 16);
		getContentPane().add(lblH5P);
		
		JLabel lblH10 = new JLabel("6 a 10 unidades");
		lblH10.setBounds(20, 70, 100, 16);
		getContentPane().add(lblH10);
		
		txtH10 = new JTextField();
		txtH10.setBounds(130, 65, 70, 26);
		getContentPane().add(txtH10);
		txtH10.setColumns(10);
		
		JLabel lblH10P = new JLabel("%");
		lblH10P.setBounds(200, 70, 30, 16);
		getContentPane().add(lblH10P);
		
		JLabel lblH15 = new JLabel("11 a 15 unidades");
		lblH15.setBounds(20, 100, 108, 16);
		getContentPane().add(lblH15);
		
		txtH15 = new JTextField();
		txtH15.setBounds(130, 95, 70, 26);
		getContentPane().add(txtH15);
		txtH15.setColumns(10);
		
		JLabel lblH15P = new JLabel("%");
		lblH15P.setBounds(200, 100, 30, 16);
		getContentPane().add(lblH15P);

		JLabel lblM15 = new JLabel("más de 15");
		lblM15.setBounds(20, 130, 100, 16);
		getContentPane().add(lblM15);
		
		txtM15 = new JTextField();
		txtM15.setBounds(130, 125, 70, 26);
		getContentPane().add(txtM15);
		txtM15.setColumns(10);
		
		JLabel lblM15P = new JLabel("%");
		lblM15P.setBounds(200, 130, 30, 16);
		getContentPane().add(lblM15P);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarPorcentajes();
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
	
	void actualizarPorcentajes() {
		frmPrincipal frmprin = new frmPrincipal();
		frmprin.porcentaje1 = Double.parseDouble(txtH5.getText());
		frmprin.porcentaje2 = Double.parseDouble(txtH10.getText());
		frmprin.porcentaje3 = Double.parseDouble(txtH15.getText());
		frmprin.porcentaje4 = Double.parseDouble(txtM15.getText());
	}

}
