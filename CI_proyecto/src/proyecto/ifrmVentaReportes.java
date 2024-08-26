package proyecto;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class ifrmVentaReportes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	public JComboBox cboTipoReporte;
	private JList listReporte;
	private frmPrincipal frmPrin = new frmPrincipal();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmVentaReportes frame = new ifrmVentaReportes();
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
	public ifrmVentaReportes() {
		setClosable(true);
		setTitle("Generar reportes");
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(437, 17, 117, 29);
		getContentPane().add(btnCerrar);
		
		JLabel lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(17, 22, 110, 16);
		getContentPane().add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox();
		cboTipoReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tipoReporte = cboTipoReporte.getSelectedIndex();
				
				crearReporte(tipoReporte);
			}
		});
		cboTipoReporte.setBounds(127, 18, 300, 27);
		getContentPane().add(cboTipoReporte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 60, 531, 330);
		getContentPane().add(scrollPane);
		
		listReporte = new JList();
		scrollPane.setViewportView(listReporte);
		listReporte.setFont(new Font("Courier New", Font.PLAIN, 12));

	}
	
	void crearReporte (int tipo) {
		
		DefaultListModel reporte = new DefaultListModel();
		
		switch (tipo) {
			case 0:
				reporte.addElement("VENTAS POR MODELO");
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo0);
				reporte.addElement("Cantidad de ventas            :" + frmPrin.cantidadVenta0);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta0);
				reporte.addElement("Importe total vendido         :" + String.format("%.2f",frmPrin.importeVentaTotal0) );
				reporte.addElement("Aporte a la cuota diaria      :" + String.format("%.2f",frmPrin.aporteCuotaDiaria0) );
	
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo1);
				reporte.addElement("Cantidad de ventas            :" + frmPrin.cantidadVenta1);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta1);
				reporte.addElement("Importe total vendido         :" + String.format("%.2f",frmPrin.importeVentaTotal1) );
				reporte.addElement("Aporte a la cuota diaria      :" + String.format("%.2f",frmPrin.aporteCuotaDiaria1) );
	
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo2);
				reporte.addElement("Cantidad de ventas            :" + frmPrin.cantidadVenta2);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta2);
				reporte.addElement("Importe total vendido         :" + String.format("%.2f",frmPrin.importeVentaTotal2) );
				reporte.addElement("Aporte a la cuota diaria      :" + String.format("%.2f",frmPrin.aporteCuotaDiaria2) );
				
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo3);
				reporte.addElement("Cantidad de ventas            :" + frmPrin.cantidadVenta3);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta3);
				reporte.addElement("Importe total vendido         :" + String.format("%.2f",frmPrin.importeVentaTotal3) );
				reporte.addElement("Aporte a la cuota diaria      :" + String.format("%.2f",frmPrin.aporteCuotaDiaria3) );
				
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo4);
				reporte.addElement("Cantidad de ventas            :" + frmPrin.cantidadVenta4);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta4);
				reporte.addElement("Importe total vendido         :" + String.format("%.2f",frmPrin.importeVentaTotal4) );
				reporte.addElement("Aporte a la cuota diaria      :" + String.format("%.2f",frmPrin.aporteCuotaDiaria4) );
			break;
			
			case 1:
					
				reporte.addElement("VENTAS EN RELACIÓN A LA VENTA ÓPTIMA");
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo0);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta0 + relacionOptima(frmPrin.cantidadUnidadesVenta0));

				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo1);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta1 + relacionOptima(frmPrin.cantidadUnidadesVenta1));
				
				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo2);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta2 + relacionOptima(frmPrin.cantidadUnidadesVenta2));

				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo3);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta3 + relacionOptima(frmPrin.cantidadUnidadesVenta3));

				reporte.addElement("\n");
				reporte.addElement("Modelo                        :" + frmPrin.modelo4);
				reporte.addElement("Cantidad de unidades vendidas :" + frmPrin.cantidadUnidadesVenta4 + relacionOptima(frmPrin.cantidadUnidadesVenta4));
			break;	

			case 2:
				
				reporte.addElement("PRECIOS EN RELACIÓN AL PRECIO PROMEDIO");
				reporte.addElement("\n");
				reporte.addElement("Modelo     :" + frmPrin.modelo0);
				reporte.addElement("Precio     :" + frmPrin.precio0 + relacionPromedio(frmPrin.precio0));

				reporte.addElement("\n");
				reporte.addElement("Modelo     :" + frmPrin.modelo1);
				reporte.addElement("Precio     :" + frmPrin.precio1 + relacionPromedio(frmPrin.precio1));
				
				reporte.addElement("\n");
				reporte.addElement("Modelo     :" + frmPrin.modelo2);
				reporte.addElement("Precio     :" + frmPrin.precio2 + relacionPromedio(frmPrin.precio2));

				reporte.addElement("\n");
				reporte.addElement("Modelo     :" + frmPrin.modelo3);
				reporte.addElement("Precio     :" + frmPrin.precio3 + relacionPromedio(frmPrin.precio3));

				reporte.addElement("\n");
				reporte.addElement("Modelo     :" + frmPrin.modelo4);
				reporte.addElement("Precio     :" + frmPrin.precio4 + relacionPromedio(frmPrin.precio4));
			break;	
			
			case 3:
				
				reporte.addElement("PROMEDIOS, MENORES Y MAYORES");
				reporte.addElement("\n");
				reporte.addElement("Precio promedio     :" + String.format("%.2f", valoresPromedio("precio")));
				reporte.addElement("Precio menor     	  :" + String.format("%.2f", valoresMinimo("precio")));
				reporte.addElement("Precio mayor        :" + String.format("%.2f", valoresMaximo("precio")));
				
				reporte.addElement("\n");
				reporte.addElement("Ancho promedio      :" + String.format("%.2f", valoresPromedio("ancho")));
				reporte.addElement("Ancho menor     	   :" + String.format("%.2f", valoresMinimo("ancho")));
				reporte.addElement("Ancho mayor         :" + String.format("%.2f", valoresMaximo("ancho")));

				reporte.addElement("\n");
				reporte.addElement("Alto promedio       :" + String.format("%.2f", valoresPromedio("alto")));
				reporte.addElement("Alto menor     	    :" + String.format("%.2f", valoresMinimo("alto")));
				reporte.addElement("Alto mayor          :" + String.format("%.2f", valoresMaximo("alto")));

				reporte.addElement("\n");
				reporte.addElement("Fondo promedio      :" + String.format("%.2f", valoresPromedio("fondo")));
				reporte.addElement("Fondo menor     	   :" + String.format("%.2f", valoresMinimo("fondo")));
				reporte.addElement("Fondo mayor         :" + String.format("%.2f", valoresMaximo("fondo")));

				reporte.addElement("\n");
				reporte.addElement("Quemadores promedio :" + String.format("%.2f", valoresPromedio("quemadores")));
				reporte.addElement("Quemadores menor    :" + (int)valoresMinimo("quemadores"));
				reporte.addElement("Quemadores mayor    :" + (int)valoresMaximo("quemadores"));

			break;	
			
		}
		
	
		listReporte.setModel(reporte);
		
	}
	
	String relacionOptima (int unidades) {
		String rslt = "";
		int cantOptima = frmPrin.cantidadOptima;
		
			if (unidades > cantOptima) {
				rslt = "(" + (unidades - cantOptima) +  ") más que la cantidad óptima";
			}
			else if(cantOptima > unidades) {
				rslt = "(" + (cantOptima - unidades) +  ") menos que la cantidad óptima";
			}
			else {
				rslt = " igual que la cantidad óptima";
			}
		
		return rslt;
	}
	
	String relacionPromedio (double precio) {
		String rslt = "";
		double precioPromedio = valoresPromedio("precio");
		
			if (precio > precioPromedio) {
				rslt = " (Mayor al precio promedio)";
			}
			else if(precioPromedio > precio) {
				rslt = " (Menor al precio promedio)";
			}
			else {
				rslt = " (Igual al precio promedio)";
			}
		return rslt;
	}
	
	double valoresPromedio (String elemento) {
		double rslt = 0.0;
		switch (elemento) {
		case "precio":
			rslt = (frmPrincipal.precio0 + frmPrincipal.precio1 + frmPrincipal.precio2 + frmPrincipal.precio3 + frmPrincipal.precio4) / 5;
			break;
		case "fondo":
			rslt = (frmPrincipal.fondo0 + frmPrincipal.fondo1 + frmPrincipal.fondo2 + frmPrincipal.fondo3 + frmPrincipal.fondo4) / 5;
			break;
		case "ancho":
			rslt = (frmPrincipal.ancho0 + frmPrincipal.ancho1 + frmPrincipal.ancho2 + frmPrincipal.ancho3 + frmPrincipal.ancho4) / 5;
			break;
		case "alto":
			rslt = (frmPrincipal.alto0 + frmPrincipal.alto1 + frmPrincipal.alto2 + frmPrincipal.alto3 + frmPrincipal.alto4) / 5;
			break;
		case "quemadores":
			rslt = (double)(frmPrincipal.quemadores0 + frmPrincipal.quemadores1 + frmPrincipal.quemadores2 + frmPrincipal.quemadores3 + frmPrincipal.quemadores4) / 5;
			break;
		}
		
		return rslt;
	}
	
	double valoresMinimo (String elemento) {
		double rslt = 0.0;
		switch (elemento) {
		case "precio":
			if(frmPrincipal.precio0 < frmPrincipal.precio1) {
				rslt = frmPrincipal.precio0;
			}else {
				rslt = frmPrincipal.precio1;
			}
			if(rslt < frmPrincipal.precio2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio2 ;
			}
			if(rslt < frmPrincipal.precio3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio3 ;
			}
			if(rslt < frmPrincipal.precio4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio4 ;
			}
			break;
		case "fondo":
			if(frmPrincipal.fondo0 < frmPrincipal.fondo1) {
				rslt = frmPrincipal.fondo0;
			}else {
				rslt = frmPrincipal.fondo1;
			}
			if(rslt < frmPrincipal.fondo2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo2 ;
			}
			if(rslt < frmPrincipal.fondo3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo3 ;
			}
			if(rslt < frmPrincipal.fondo4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo4 ;
			}
			break;
			case "ancho":
			if(frmPrincipal.ancho0 < frmPrincipal.ancho1) {
				rslt = frmPrincipal.ancho0;
			}else {
				rslt = frmPrincipal.ancho1;
			}
			if(rslt < frmPrincipal.ancho2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho2 ;
			}
			if(rslt < frmPrincipal.ancho3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho3 ;
			}
			if(rslt < frmPrincipal.ancho4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho4 ;
			}
			break;
			case "alto":
			if(frmPrincipal.alto0 < frmPrincipal.alto1) {
				rslt = frmPrincipal.alto0;
			}else {
				rslt = frmPrincipal.alto1;
			}
			if(rslt < frmPrincipal.alto2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto2 ;
			}
			if(rslt < frmPrincipal.alto3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto3 ;
			}
			if(rslt < frmPrincipal.alto4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto4 ;
			}
			break;
			case "quemadores":
			if(frmPrincipal.quemadores0 < frmPrincipal.quemadores1) {
				rslt = frmPrincipal.quemadores0;
			}else {
				rslt = frmPrincipal.quemadores1;
			}
			if(rslt < frmPrincipal.quemadores2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores2 ;
			}
			if(rslt < frmPrincipal.quemadores3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores3 ;
			}
			if(rslt < frmPrincipal.quemadores4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores4 ;
			}
			break;
		}
		
		return rslt;
	}
	
	double valoresMaximo (String elemento) {
		double rslt = 0.0;
		switch (elemento) {
		case "precio":
			if(frmPrincipal.precio0 > frmPrincipal.precio1) {
				rslt = frmPrincipal.precio0;
			}else {
				rslt = frmPrincipal.precio1;
			}
			if(rslt > frmPrincipal.precio2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio2 ;
			}
			if(rslt > frmPrincipal.precio3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio3 ;
			}
			if(rslt > frmPrincipal.precio4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.precio4 ;
			}
			break;
		case "fondo":
			if(frmPrincipal.fondo0 > frmPrincipal.fondo1) {
				rslt = frmPrincipal.fondo0;
			}else {
				rslt = frmPrincipal.fondo1;
			}
			if(rslt > frmPrincipal.fondo2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo2 ;
			}
			if(rslt > frmPrincipal.fondo3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo3 ;
			}
			if(rslt > frmPrincipal.fondo4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.fondo4 ;
			}
			break;
			case "ancho":
			if(frmPrincipal.ancho0 > frmPrincipal.ancho1) {
				rslt = frmPrincipal.ancho0;
			}else {
				rslt = frmPrincipal.ancho1;
			}
			if(rslt > frmPrincipal.ancho2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho2 ;
			}
			if(rslt > frmPrincipal.ancho3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho3 ;
			}
			if(rslt > frmPrincipal.ancho4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.ancho4 ;
			}
			break;
			case "alto":
			if(frmPrincipal.alto0 > frmPrincipal.alto1) {
				rslt = frmPrincipal.alto0;
			}else {
				rslt = frmPrincipal.alto1;
			}
			if(rslt > frmPrincipal.alto2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto2 ;
			}
			if(rslt > frmPrincipal.alto3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto3 ;
			}
			if(rslt > frmPrincipal.alto4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.alto4 ;
			}
			break;
			case "quemadores":
			if(frmPrincipal.quemadores0 > frmPrincipal.quemadores1) {
				rslt = frmPrincipal.quemadores0;
			}else {
				rslt = frmPrincipal.quemadores1;
			}
			if(rslt > frmPrincipal.quemadores2 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores2 ;
			}
			if(rslt > frmPrincipal.quemadores3 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores3 ;
			}
			if(rslt > frmPrincipal.quemadores4 ) {
				rslt = rslt;
			}else {
				rslt = frmPrincipal.quemadores4 ;
			}
			break;
		}
		
		return rslt;
	}

}
