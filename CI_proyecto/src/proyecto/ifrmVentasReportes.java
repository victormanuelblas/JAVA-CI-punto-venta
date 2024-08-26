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
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;

public class ifrmVentasReportes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JLabel lblTipoReporte;
	private JComboBox cboTipoReporte;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextArea txtS;
	private frmPrincipal frmPrin = new frmPrincipal();
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
	
	String modelo0 = frmPrincipal.modelo0, modelo1 = frmPrincipal.modelo1, modelo2 = frmPrincipal.modelo2, modelo3 = frmPrincipal.modelo3, modelo4 = frmPrincipal.modelo4;
	int cantiVentas0 = frmPrincipal.contadorVenta0, cantiVentas1 = frmPrincipal.contadorVenta1, cantiVentas2 = frmPrincipal.contadorVenta2, cantiVentas3 = frmPrincipal.contadorVenta3, cantiVentas4 = frmPrincipal.contadorVenta4;
	int uniVendidas0 = frmPrincipal.cantUniVendidas0, uniVendidas1 =frmPrincipal.cantUniVendidas1, uniVendidas2 = frmPrincipal.cantUniVendidas2, uniVendidas3 = frmPrincipal.cantUniVendidas3, uniVendidas4 = frmPrincipal.cantUniVendidas4;
	double importeAcum0 = frmPrincipal.importeAcumulado0, importeAcum1 =frmPrincipal.importeAcumulado1, importeAcum2 = frmPrincipal.importeAcumulado2, importeAcum3 =frmPrincipal.importeAcumulado3,importeAcum4 = frmPrincipal.importeAcumulado4;
	double aporteCuota0 = frmPrincipal.porcentajeCuota0, aporteCuota1 =frmPrincipal.porcentajeCuota1, aporteCuota2 = frmPrincipal.porcentajeCuota2, aporteCuota3 =frmPrincipal.porcentajeCuota3, aporteCuota4 = frmPrincipal.porcentajeCuota4;
	int cantiOptima = frmPrincipal.cantidadOptima;
	double precio0 = frmPrincipal.precio0, precio1 = frmPrincipal.precio1, precio2 =frmPrincipal.precio2, precio3 = frmPrincipal.precio3, precio4 = frmPrincipal.precio4;
	double ancho0 = frmPrincipal.ancho0, ancho1 = frmPrincipal.ancho1, ancho2 = frmPrincipal.ancho2, ancho3 = frmPrincipal.ancho3, ancho4 = frmPrincipal.ancho4;
	int item;
	double precioProm = ((precio0 + precio1 + precio2 + precio3 + precio4)/5);
	double anchoProm = ((ancho0 + ancho1 + ancho2 + ancho3 + ancho4)/5);
	DecimalFormat formato1 = new DecimalFormat("0.00");
	
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
		cboTipoReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedCboTipoReporte(e);
				generarTipoReporte();				
			}
		});
		cboTipoReporte.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				itemStateChangedCboTipoReporte(e);
			}
		});
		cboTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relación al precio promedio", "Pecios en relación al precio promedio", "Promedios, menores y mayores"}));
		cboTipoReporte.setBounds(118, 11, 181, 22);
		getContentPane().add(cboTipoReporte);
		scrollPane.setBounds(10, 50, 414, 209);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
				
		}
	
	void generarTipoReporte() {
		item =cboTipoReporte.getSelectedIndex();
		switch(item) {
		case 0:
			reporteModelo();
			break;
		case 1:
			reporteVentaOptima();
			break;
		case 2:
			reportePrecioPromedio();
			break;
		default:
			reportePromediosMenoresMayores();
		}
		txtS.setCaretPosition(0);
	}

	void reporteModelo() {
		txtS.setText("VENTAS POR MODELO" + "\n\n");
		
		txtS.append("Modelo: " + modelo0 + "\n");
		txtS.append("Cantidad de ventas: " + cantiVentas0 + "\n");
		txtS.append("Cantidad de unidades vendidas: " + uniVendidas0 + "\n");
		txtS.append("Importe total vendido: S/ " + formato1.format(importeAcum0) + "\n");
		txtS.append("Aporte a la cuota diaria: " + formato1.format(aporteCuota0) + "%" + "\n\n");
		
		txtS.append("Modelo: " + modelo1 + "\n");
		txtS.append("Cantidad de ventas: " + cantiVentas1 + "\n");
		txtS.append("Cantidad de unidades vendidas: " + uniVendidas1 + "\n");
		txtS.append("Importe total vendido: S/ " + formato1.format(importeAcum1) + "\n");
		txtS.append("Aporte a la cuota diaria: " + formato1.format(aporteCuota1) + "%" + "\n\n");
		
		txtS.append("Modelo: " + modelo2 + "\n");
		txtS.append("Cantidad de ventas: " + cantiVentas2 + "\n");
		txtS.append("Cantidad de unidades vendidas: " + uniVendidas2 + "\n");
		txtS.append("Importe total vendido: S/ " + formato1.format(importeAcum2) + "\n");
		txtS.append("Aporte a la cuota diaria: " + formato1.format(aporteCuota2) + "%" + "\n\n");
		
		txtS.append("Modelo: " + modelo3 + "\n");
		txtS.append("Cantidad de ventas: " + cantiVentas3 + "\n");
		txtS.append("Cantidad de unidades vendidas: " + uniVendidas3 + "\n");
		txtS.append("Importe total vendido: S/ " + formato1.format(importeAcum3) + "\n");
		txtS.append("Aporte a la cuota diaria: " + formato1.format(aporteCuota3) + "%" + "\n\n");
		
		txtS.append("Modelo: " + modelo4 + "\n");
		txtS.append("Cantidad de ventas: " + cantiVentas4 + "\n");
		txtS.append("Cantidad de unidades vendidas: " + uniVendidas4 + "\n");
		txtS.append("Importe total vendido: S/ " + formato1.format(importeAcum4) + "\n");
		txtS.append("Aporte a la cuota diaria: " + formato1.format(aporteCuota4) + "%" + "\n\n");
	
		txtS.setCaretPosition(0);
	}
	
	void reporteVentaOptima() {
		txtS.setText("VENTAS EN RELACION A LA VENTA OPTIMA" + "\n\n");
		
		txtS.append("Modelo: " + modelo0 + "\n");
		
		if (uniVendidas0 < cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas0 + "(" + (cantiOptima - uniVendidas0) + "Menos que la Cantidad Optima)" + "\n\n");
		else if (uniVendidas0 > cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas0 + "(" + (uniVendidas0 - cantiOptima) + "Más que la Cantidad Optima)" + "\n\n");
		else
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas0 + "(Igual que la Cantidad Optima)" + "\n\n");
			
		
		txtS.append("Modelo: " + modelo1 + "\n");
		if (uniVendidas1 < cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas1 + "(" + (cantiOptima - uniVendidas1) + "Menos que la Cantidad Optima)" + "\n\n");
		else if (uniVendidas1 > cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas1 + "(" + (uniVendidas1 - cantiOptima) + "Más que la Cantidad Optima)" + "\n\n");
		else
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas1 + "(Igual que la Cantidad Optima)" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo2 + "\n");
		if (uniVendidas2 < cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas2 + "(" + (cantiOptima - uniVendidas2) + "Menos que la Cantidad Optima)" + "\n\n");
		else if (uniVendidas2 > cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas2 + "(" + (uniVendidas2 - cantiOptima) + "Más que la Cantidad Optima)" + "\n\n");
		else
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas2 + "(Igual que la Cantidad Optima)" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo3 + "\n");
		if (uniVendidas3 < cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas3 + "(" + (cantiOptima - uniVendidas3) + "Menos que la Cantidad Optima)" + "\n\n");
		else if (uniVendidas3 > cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas3 + "(" + (uniVendidas3 - cantiOptima) + "Más que la Cantidad Optima)" + "\n\n");
		else
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas3 + "(Igual que la Cantidad Optima)" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo4 + "\n");
		if (uniVendidas4 < cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas4 + "(" + (cantiOptima - uniVendidas4) + "Menos que la Cantidad Optima)" + "\n\n");
		else if (uniVendidas4 > cantiOptima)
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas4 + "(" + (uniVendidas4 - cantiOptima) + "Más que la Cantidad Optima)" + "\n\n");
		else
			txtS.append("Cantidad de unidades vendidas: " + uniVendidas4 + "(Igual que la Cantidad Optima)" + "\n\n");
	}
	
	void reportePrecioPromedio() {
		txtS.setText("PRECIOS EN RELACION AL PRECIO PROMEDIO" + "\n\n");
		
		txtS.append("Modelo: " + modelo0 + "\n");
		if (precio0 < precioProm)
			txtS.append("Precio: S/ " + precio0 + "Precio Menor al Promedio" + "\n\n");
		else if (precio0 > precioProm)
			txtS.append("Precio: S/ " + precio0 + "Precio Mayor al Promedio" + "\n\n");
		else
			txtS.append("Precio: S/ " + precio0 + "Precio Igual al Promedio" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo1 + "\n");
		if (precio1 < precioProm)
			txtS.append("Precio: S/ " + precio1 + "Precio Menor al Promedio" + "\n\n");
		else if (precio1 > precioProm)
			txtS.append("Precio: S/ " + precio1 + "Precio Mayor al Promedio" + "\n\n");
		else
			txtS.append("Precio: S/ " + precio1 + "Precio Igual al Promedio" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo2 + "\n");
		if (precio2 < precioProm)
			txtS.append("Precio: S/ " + precio2 + "Precio Menor al Promedio" + "\n\n");
		else if (precio2 > precioProm)
			txtS.append("Precio: S/ " + precio2 + "Precio Mayor al Promedio" + "\n\n");
		else
			txtS.append("Precio: S/ " + precio2 + "Precio Igual al Promedio" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo3 + "\n");
		if (precio3 < precioProm)
			txtS.append("Precio: S/ " + precio3 + "Precio Menor al Promedio" + "\n\n");
		else if (precio3 > precioProm)
			txtS.append("Precio: S/ " + precio3 + "Precio Mayor al Promedio" + "\n\n");
		else
			txtS.append("Precio: S/ " + precio3 + "Precio Igual al Promedio" + "\n\n");
		
		
		txtS.append("Modelo: " + modelo4 + "\n");
		if (precio4 < precioProm)
			txtS.append("Precio: S/ " + precio4 + "Precio Menor al Promedio" + "\n\n");
		else if (precio4 > precioProm)
			txtS.append("Precio: S/ " + precio4 + "Precio Mayor al Promedio" + "\n\n");
		else
			txtS.append("Precio: S/ " + precio4 + "Precio Igual al Promedio" + "\n\n");
	}
	
	void reportePromediosMenoresMayores() {
		txtS.setText("PROMEDIOS, MENORES Y MAYORES" + "\n\n");
		
		txtS.append("Precio promedio: S/ " + formato1.format(precioProm) + "\n");
		
		
		if (precio0 <= precio1 && precio0 <= precio2 && precio0 <= precio3 && precio0 <= precio4)
			txtS.append("Precio menor: S/ " + precio0 + "\n");
		else if (precio1 <= precio0 && precio1 <= precio2 && precio1 <= precio3 && precio1 <= precio4)
			txtS.append("Precio menor: S/ " + precio1 + "\n");
		else if (precio2 <= precio0 && precio2 <= precio1 && precio2 <= precio3 && precio2 <= precio4)
			txtS.append("Precio menor: S/ " + precio2 + "\n");
		else if (precio3 <= precio0 && precio3 <= precio1 && precio3 <= precio2 && precio3 <= precio4)
			txtS.append("Precio menor: S/ " + precio3 + "\n");
		else
			txtS.append("Precio menor: S/ " + precio4 + "\n");
		
		
		if (precio0 >= precio1 && precio0 >= precio2 && precio0 >= precio3 && precio0 >= precio4)
			txtS.append("Precio mayor: S/ " + precio0 + "\n");
		else if (precio1 >= precio0 && precio1 >= precio2 && precio1 >= precio3 && precio1 >= precio4)
			txtS.append("Precio mayor: S/ " + precio1 + "\n");
		else if (precio2 >= precio0 && precio2 >= precio1 && precio2 >= precio3 && precio2 >= precio4)
			txtS.append("Precio mayor: S/ " + precio2 + "\n");
		else if (precio3 >= precio0 && precio3 >= precio1 && precio3 >= precio2 && precio3 >= precio4)
			txtS.append("Precio mayor: S/ " + precio3 + "\n");
		else
			txtS.append("Precio mayor: S/ " + precio4 + "\n");
		
		
		txtS.append("Ancho promedio: " + anchoProm + "cm.\n");
		
		
		if (ancho0 <= ancho1 && ancho0 <= ancho2 && ancho0 <= ancho3 && ancho0 <= ancho4)
			txtS.append("Ancho menor: S/ " + ancho0 + "cm.\n");
		else if (ancho1 <= ancho0 && ancho1 <= ancho2 && ancho1 <= ancho3 && ancho1 <= ancho4)
			txtS.append("Ancho menor: S/ " + ancho1 + "cm.\n");
		else if (ancho2 <= ancho0 && ancho2 <= ancho1 && ancho2 <= ancho3 && ancho2 <= ancho4)
			txtS.append("Ancho menor: S/ " + ancho2 + "cm.\n");
		else if (ancho3 <= ancho0 && ancho3 <= ancho1 && ancho3 <= ancho2 && ancho3 <= ancho4)
			txtS.append("Ancho menor: S/ " + ancho3 + "cm.\n");
		else
			txtS.append("Ancho menor: S/ " + ancho4 + "cm.\n");
		
		
		if (ancho0 >= ancho1 && ancho0 >= ancho2 && ancho0 >= ancho3 && ancho0 >= ancho4)
			txtS.append("Ancho mayor: S/ " + ancho0 + "cm.\n");
		else if (ancho1 >= ancho0 && ancho1 >= ancho2 && ancho1 >= ancho3 && ancho1 >= ancho4)
			txtS.append("Ancho mayor: S/ " + ancho1 + "cm.\n");
		else if (ancho2 >= ancho0 && ancho2 >= ancho1 && ancho2 >= ancho3 && ancho2 >= ancho4)
			txtS.append("Ancho mayor: S/ " + ancho2 + "cm.\n");
		else if (ancho3 >= ancho0 && ancho3 >= ancho1 && ancho3 >= ancho2 && ancho3 >= ancho4)
			txtS.append("Ancho mayor: S/ " + ancho3 + "cm.\n");
		else
			txtS.append("Ancho mayor: S/ " + ancho4 + "cm.\n");
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	}
	
	protected void itemStateChangedCboTipoReporte(ItemEvent e) {
	}
	
	protected void actionPerformedCboTipoReporte(ActionEvent e) {
	}
}
