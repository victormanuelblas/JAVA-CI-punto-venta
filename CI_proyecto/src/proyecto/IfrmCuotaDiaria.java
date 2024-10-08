package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class IfrmCuotaDiaria extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IfrmCuotaDiaria frame = new IfrmCuotaDiaria();
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
	public IfrmCuotaDiaria() {
		getContentPane().addComponentListener(new ComponentAdapter() {
		});
		setTitle("Configurar cuota diaria");
		setClosable(true);
		setBounds(100, 100, 450, 169);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cuota diaria esperada (S/)");
		lblNewLabel.setBounds(16, 28, 179, 16);
		getContentPane().add(lblNewLabel);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(196, 23, 81, 26);
		getContentPane().add(txtMonto);
		txtMonto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarCuotaDiaria();
			}
		});
		btnAceptar.setBounds(303, 23, 117, 29);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(303, 62, 117, 29);
		getContentPane().add(btnCancelar);

	}
	
	void actualizarCuotaDiaria () {
		frmPrincipal frmprin = new frmPrincipal();
		frmprin.cuotaDiaria = Integer.parseInt(txtMonto.getText()); 
	}

}
