package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Font;
import javax.swing.ListSelectionModel;

public class ifrmListaCocinas extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JList listCocinas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmListaCocinas frame = new ifrmListaCocinas();
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
	public ifrmListaCocinas() {
		setTitle("Listado de cocinas");
		setClosable(true);
		setBounds(100, 100, 550, 450);
		getContentPane().setLayout(null);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(144, 353, 117, 29);
		getContentPane().add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarCocinas();
			}
		});
		btnListar.setBounds(272, 353, 117, 29);
		getContentPane().add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 500, 330);
		getContentPane().add(scrollPane);
		
		listCocinas = new JList();
		scrollPane.setViewportView(listCocinas);
		listCocinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listCocinas.setFont(new Font("Courier New", Font.PLAIN, 12));
		listCocinas.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});

	}
	
	void listarCocinas () {
		frmPrincipal frmPrin = new frmPrincipal();
		
		DefaultListModel modelo = new DefaultListModel();
		
		modelo.addElement("LISTADO DE COCINAS");
		modelo.addElement("\n");
		modelo.addElement("Modelo       :" + frmPrin.modelo0);
		modelo.addElement("Precio       :" + frmPrin.precio0);
		modelo.addElement("Profundidad  :" + frmPrin.fondo0);
		modelo.addElement("Ancho        :" + frmPrin.ancho0);
		modelo.addElement("Alto         :" + frmPrin.alto0);
		modelo.addElement("Quemadores   :" + frmPrin.quemadores0);
	
		modelo.addElement("\n");
		modelo.addElement("Modelo       :" + frmPrin.modelo1);
		modelo.addElement("Precio       :" + frmPrin.precio1);
		modelo.addElement("Profundidad  :" + frmPrin.fondo1);
		modelo.addElement("Ancho        :" + frmPrin.ancho1);
		modelo.addElement("Alto         :" + frmPrin.alto1);
		modelo.addElement("Quemadores   :" + frmPrin.quemadores1);
	
		modelo.addElement("\n");
		modelo.addElement("Modelo       :" + frmPrin.modelo2);
		modelo.addElement("Precio       :" + frmPrin.precio2);
		modelo.addElement("Profundidad  :" + frmPrin.fondo2);
		modelo.addElement("Ancho        :" + frmPrin.ancho2);
		modelo.addElement("Alto         :" + frmPrin.alto2);
		modelo.addElement("Quemadores   :" + frmPrin.quemadores2);
		
		modelo.addElement("\n");
		modelo.addElement("Modelo       :" + frmPrin.modelo3);
		modelo.addElement("Precio       :" + frmPrin.precio3);
		modelo.addElement("Profundidad  :" + frmPrin.fondo3);
		modelo.addElement("Ancho        :" + frmPrin.ancho3);
		modelo.addElement("Alto         :" + frmPrin.alto3);
		modelo.addElement("Quemadores   :" + frmPrin.quemadores3);
		
		modelo.addElement("\n");
		modelo.addElement("Modelo       :" + frmPrin.modelo4);
		modelo.addElement("Precio       :" + frmPrin.precio4);
		modelo.addElement("Profundidad  :" + frmPrin.fondo4);
		modelo.addElement("Ancho        :" + frmPrin.ancho4);
		modelo.addElement("Alto         :" + frmPrin.alto4);
		modelo.addElement("Quemadores   :" + frmPrin.quemadores4);
		
		listCocinas.setModel(modelo);
		
	}
}
