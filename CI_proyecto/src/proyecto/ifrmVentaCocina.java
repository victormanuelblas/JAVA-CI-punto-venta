package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ifrmVentaCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtPrecio;
	public JTextField txtCantidad;
	private JList listVenta;
	public JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmVentaCocina frame = new ifrmVentaCocina();
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
	public ifrmVentaCocina() {
		setClosable(true);
		setTitle("Vender");
		setBounds(100, 100, 550, 400);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(17, 21, 80, 16);
		getContentPane().add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarModelo(cboModelo.getSelectedIndex());
			}
		});
		cboModelo.setBounds(117, 17, 200, 27);
		getContentPane().add(cboModelo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(419, 46, 90, 29);
		getContentPane().add(btnCerrar);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generarVenta();
			}
		});
		btnVender.setBounds(419, 16, 90, 29);
		getContentPane().add(btnVender);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(117, 52, 130, 26);
		getContentPane().add(txtPrecio);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(17, 56, 80, 16);
		getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(17, 91, 80, 16);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(117, 87, 130, 26);
		getContentPane().add(txtCantidad);
		
		listVenta = new JList();
		listVenta.setFont(new Font("Courier New", Font.PLAIN, 12));
		listVenta.setBounds(20, 130, 481, 200);
		getContentPane().add(listVenta);
		
		txtCantidad.requestFocus();

	}
	
	void cambiarModelo(int indx) {
		frmPrincipal frmPrin = new frmPrincipal();
		
		switch (indx) {
		case 0:
		 	txtPrecio.setText("" + frmPrin.precio0);
		 	break;
		case 1:
		 	txtPrecio.setText("" + frmPrin.precio1);
		 	break;
		case 2:
		 	txtPrecio.setText("" + frmPrin.precio2);
		 	break;
		case 3:
		 	txtPrecio.setText("" + frmPrin.precio3);
		 	break;
		case 4:
		 	txtPrecio.setText("" + frmPrin.precio4);
		 	break;
		}
		
		txtCantidad.requestFocus();
	}
	
	void generarVenta () {
		frmPrincipal frmPrin = new frmPrincipal();
		
		DefaultListModel printModel = new DefaultListModel();
		
		int selectedModel = cboModelo.getSelectedIndex(), cantidad = txtCantidad.getText().equals("") ? 0 : Integer.parseInt(txtCantidad.getText()); ;
		double precio = 0.0, descuento = 0.0, importeCompra = 0.0, importePagar = 0.0;
		String obsequio = "";
		
		printModel.addElement("BOLETA DE VENTA");
		printModel.addElement("\n");
		
		switch (selectedModel) {
		case 0:
			printModel.addElement("Modelo             :" + frmPrin.modelo0);
			precio = frmPrin.precio0;
			break;
		case 1:
			printModel.addElement("Modelo             :" + frmPrin.modelo1);
			precio = frmPrin.precio1;
			break;
		case 2:
			printModel.addElement("Modelo             :" + frmPrin.modelo2);
			precio = frmPrin.precio2;
			break;
		case 3:
			printModel.addElement("Modelo             :" + frmPrin.modelo3);
			precio = frmPrin.precio3;
			break;
		case 4:
			printModel.addElement("Modelo             :" + frmPrin.modelo4);
			precio = frmPrin.precio4;
			break;
		}
			
		importeCompra = precio * cantidad;
		switch (cantidad) {
		case 0:
			descuento = 0;
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			descuento = (importeCompra * frmPrin.porcentaje1) / 100;			
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			descuento = (importeCompra * frmPrin.porcentaje2) / 100;			
			break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			descuento = (importeCompra * frmPrin.porcentaje3) / 100;			
			break;
		default:
			descuento = (importeCompra * frmPrin.porcentaje4) / 100;
		}
		
		switch (cantidad) {
		case 0:
			obsequio = "";
			break;
		case 1:
			obsequio = frmPrin.obsequio1;
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			obsequio = frmPrin.obsequio2;
			break;
		default:
			obsequio = frmPrin.obsequio3;
			break;
		}
		
		importePagar = importeCompra - descuento;
		
		printModel.addElement("Precio             :" + precio);
		printModel.addElement("Cantidad           :" + cantidad);
		printModel.addElement("Importe compra     :" + String.format("%.2f", importeCompra));
		printModel.addElement("Importe descuento  :" + String.format("%.2f", descuento));
		printModel.addElement("Importe pagar      :" + String.format("%.2f", importePagar));
		printModel.addElement("Obsequio   		      :" + obsequio);
				
		listVenta.setModel(printModel);
		
		grabarVenta(selectedModel,cantidad,importePagar);
		
		if (frmPrin.totalVentas % 5 == 0) {
		
			String textoDialogo = dialogText();
			
			JOptionPane.showMessageDialog(null, textoDialogo, "Avance de ventas", JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	String dialogText() {
		String rslt = "";
		frmPrincipal frmPrin = new frmPrincipal();
		double cuotaDiaria = frmPrin.cuotaDiaria;
		
		double porcCuotaDiaria = (frmPrin.totalImporteVentas / cuotaDiaria) * 100;

		rslt += "Venta Nro: " + frmPrin.totalVentas + "\n";
		rslt += "Importe total general acumulado: S/ " + String.format("%.2f", frmPrin.totalImporteVentas) + "\n";
		rslt += "Porcentaje de cuota diaria: " + String.format("%.2f", porcCuotaDiaria) + "\n";
		
		return rslt;
	}
	
	void grabarVenta(int model, int unidades, double importe) {
		frmPrincipal frmPrin = new frmPrincipal();
		double cuotaDiaria = frmPrin.cuotaDiaria;
		
		switch (model) {
		case 0:
			frmPrin.cantidadVenta0 += 1;
			frmPrin.cantidadUnidadesVenta0 += unidades;
			frmPrin.importeVentaTotal0 += importe;
			frmPrin.aporteCuotaDiaria0 =  (frmPrin.importeVentaTotal0 / cuotaDiaria) * 100;
			break;
		case 1:
			frmPrin.cantidadVenta1 += 1;
			frmPrin.cantidadUnidadesVenta1 += unidades;
			frmPrin.importeVentaTotal1 += importe;
			frmPrin.aporteCuotaDiaria1 =  (frmPrin.importeVentaTotal1 / cuotaDiaria) * 100;
			break;
		case 2:
			frmPrin.cantidadVenta2 += 1;
			frmPrin.cantidadUnidadesVenta2 += unidades;
			frmPrin.importeVentaTotal2 += importe;
			frmPrin.aporteCuotaDiaria2 =  (frmPrin.importeVentaTotal2 / cuotaDiaria) * 100;
			break;
		case 3:
			frmPrin.cantidadVenta3 += 1;
			frmPrin.cantidadUnidadesVenta3 += unidades;
			frmPrin.importeVentaTotal3 += importe;
			frmPrin.aporteCuotaDiaria3 =  (frmPrin.importeVentaTotal3 / cuotaDiaria) * 100;
			break;
		case 4:
			frmPrin.cantidadVenta4 += 1;
			frmPrin.cantidadUnidadesVenta4 += unidades;
			frmPrin.importeVentaTotal4 += importe;
			frmPrin.aporteCuotaDiaria4 =  (frmPrin.importeVentaTotal4 / cuotaDiaria) * 100;
			break;		
		}
		
		frmPrin.totalVentas += 1;
		frmPrin.totalImporteVentas += importe;
		
		JOptionPane.showMessageDialog(null, "Comprobante de pago generado", "Confirmación de venta", JOptionPane.INFORMATION_MESSAGE);
	}

}
