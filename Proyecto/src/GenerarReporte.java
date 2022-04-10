import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

public class GenerarReporte extends JInternalFrame {

	private JPanel contentPane;
	DecimalFormat df = new DecimalFormat("##.00");

	public GenerarReporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 685, 364);
		contentPane.add(scrollPane);

		JTextPane txtS = new JTextPane();
		txtS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(txtS);

		JLabel lblNewLabel = new JLabel("Tipo de Reporte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 234, 44);
		contentPane.add(lblNewLabel);

		JComboBox cboReporte = new JComboBox();
		cboReporte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cboReporte.setBackground(Color.WHITE);
		cboReporte.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int index = cboReporte.getSelectedIndex();
				String cadena = "";
				String tabla = "";
				switch (index) {
				case 0:
					JOptionPane.showMessageDialog(null, "Seleccione Tipo de Reporte");
					break;
				case 1:
					txtS.setText("");
					tabla += "<h1 style='color: blue;'>Reporte por Modelo</h1><br/><table style='width: 100%;'>";

					cadena += "<b>Modelo</b>: " + Vender.modelo0 + "<br/>";
					cadena += "<b>Cantidad de Ventas: </b>" + Vender.vtaModelo0 + "<br/>";
					cadena += "<b>Unidades Vendidas: </b>" + Vender.canModelo0 + "<br/>";
					cadena += "<b>Importe Total Vendido:</b> " + Vender.impModelo0 + "<br/>";
					cadena += "<b>Aporte a Cuota Diaria:</b> " + df.format(Vender.impModelo0 * 100 / Vender.CuotaDiaria)
							+ "<br/>";

					tabla += "<tr><td>" + cadena
							+ "</td><td><img width='150' height='150' src='file:img\\mabe_emp6120.jpg'></td></tr>";

					cadena = "";
					cadena += "<b>Modelo:</b> " + Vender.modelo1 + "<br/>";
					cadena += "<b>Cantidad de Ventas:</b> " + Vender.vtaModelo1 + "<br/>";
					cadena += "<b>Unidades Vendidas:</b> " + Vender.canModelo1 + "<br/>";
					cadena += "<b>Importe Total Vendido:</b> " + Vender.impModelo1 + "<br/>";
					cadena += "<b>Aporte a Cuota Diaria:</b> " + df.format(Vender.impModelo1 * 100 / Vender.CuotaDiaria)
							+ "<br/>";

					tabla += "<tr><td>" + cadena
							+ "</td><td><img width='150' height='150' src='file:img\\indurama_parma.jpg'></td></tr>";

					cadena = "";
					cadena += "<b>Modelo: </b>" + Vender.modelo2 + "<br/>";
					cadena += "<b>Cantidad de Ventas:</b> " + Vender.vtaModelo2 + "<br/>";
					cadena += "<b>Unidades Vendidas:</b> " + Vender.canModelo2 + "<br/>";
					cadena += "<b>Importe Total Vendido:</b> " + Vender.impModelo2 + "<br/>";
					cadena += "<b>Aporte a Cuota Diaria: </b>" + df.format(Vender.impModelo2 * 100 / Vender.CuotaDiaria)
							+ "<br/>";

					tabla += "<tr><td>" + cadena
							+ "</td><td><img width='150' height='150' src='file:img\\sole_cosol.jpg'></td></tr>";

					cadena = "";
					cadena += "<b>Modelo: </b>" + Vender.modelo3 + "<br/>";
					cadena += "<b>Cantidad de Ventas:</b> " + Vender.vtaModelo3 + "<br/>";
					cadena += "<b>Unidades Vendidas:</b> " + Vender.canModelo3 + "<br/>";
					cadena += "<b>Importe Total Vendido:</b> " + Vender.impModelo3 + "<br/>";
					cadena += "<b>Aporte a Cuota Diaria:</b> " + df.format(Vender.impModelo3 * 100 / Vender.CuotaDiaria)
							+ "<br/>";

					tabla += "<tr><td>" + cadena
							+ "</td><td><img width='150' height='150' src='file:img\\coldex_cx602.jpg'></td></tr>";

					cadena = "";
					cadena += "<b>Modelo: </b>" + Vender.modelo4 + "<br/>";
					cadena += "<b>Cantidad de Ventas: </b>" + Vender.vtaModelo4 + "<br/>";
					cadena += "<b>Unidades Vendidas:</b> " + Vender.canModelo4 + "<br/>";
					cadena += "<b>Importe Total Vendido:</b> " + Vender.impModelo4 + "<br/>";
					cadena += "<b>Aporte a Cuota Diaria:</b> " + df.format(Vender.impModelo4 * 100 / Vender.CuotaDiaria)
							+ "<br/>";

					tabla += "<tr><td>" + cadena
							+ "</td><td><img width='150' height='150' src='file:img\\recco_dakota.jpg'></td></tr>";
					tabla += "</table>";

					txtS.setContentType("text/html");
					txtS.setText(tabla);
					break;
				case 2:
					txtS.setText("");
					cadena += "<h1 style='color: green;'>Reporte por Venta Optima</h1><br/>";
					cadena += "Modelo:" + Vender.modelo0 + "<br/>";
					cadena += "Cantidad Vendidas: " + calcularVentaOptima(Vender.canModelo0)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo1+ "<br/>";
					cadena += "Cantidad Vendidas: " + calcularVentaOptima(Vender.canModelo1)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo2+ "<br/>";
					cadena += "Cantidad Vendidas: " + calcularVentaOptima(Vender.canModelo2)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo3+ "<br/>";
					cadena += "Cantidad Vendidas: " + calcularVentaOptima(Vender.canModelo3)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo4+ "<br/>";
					cadena += "Cantidad Vendidas: " + calcularVentaOptima(Vender.canModelo4)+ "\n";
										
					txtS.setContentType("text/html");
					txtS.setText(cadena);
					break;
				case 3:
					txtS.setText("");
					cadena += "<h1 style='color: red;'>Reporte por Precio Promedio</h1><br/>";
					cadena += "Modelo:" + Vender.modelo0 + "<br/>";
					cadena += "Precio: " + calcularPrecioPromedio(Vender.precio0)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo1 + "<br/>";
					cadena += "Precio: " + calcularPrecioPromedio(Vender.precio1)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo2 + "<br/>";
					cadena += "Precio: " + calcularPrecioPromedio(Vender.precio2)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo3 + "<br/>";
					cadena += "Precio: " + calcularPrecioPromedio(Vender.precio3)+ "\n";
					cadena += "<hr>";
					
					cadena += "Modelo:" + Vender.modelo4 + "<br/>";
					cadena += "Precio: " + calcularPrecioPromedio(Vender.precio4)+ "\n";
					cadena += "<hr>";
					
					txtS.setContentType("text/html");
					txtS.setText(cadena);
					break;
				default:
					txtS.setText("");
					cadena += "<h1 style='color: orange;'>Promedios Mayores y Menores</h1><br/>";
					
					cadena += "Precio Promedio: S/ " + Vender.precioPromedio + "<br/>";
					cadena += "Precio Menor: S/ " + Vender.precioMenor + "<br/>";
					cadena += "Precio Mayor: S/ " + Vender.precioMayor + "<br/>";					
					cadena += "<hr>";
					cadena += "Ancho Promedio: " + Vender.anchoPromedio + "<br/>";
					cadena += "Ancho Menor: " + Vender.anchoMenor + "<br/>";
					cadena += "Ancho Mayor: " + Vender.anchoMayor + "<br/>";	
					
					txtS.setContentType("text/html");
					txtS.setText(cadena);
					break;
				}
			}
		});
		cboReporte.setModel(new DefaultComboBoxModel(
				new String[] { "[Seleccione]", "Ventas por Modelo", "Ventas seg\u00FAn Venta Optima",
						"Precios seg\u00FAn Precios Promedio", "Promedios Menores y Mayores" }));
		cboReporte.setBounds(164, 11, 378, 44);
		contentPane.add(cboReporte);

		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(552, 11, 143, 44);
		contentPane.add(btnCerrar);

		setVisible(true);
	}

	public String calcularVentaOptima(int canVen) {
		String rpta = "";
		if (canVen == Vender.cantidadOptima) {
			rpta = "Es igual a la cantidad óptima";
		} else if (canVen < Vender.cantidadOptima) {
			rpta = "(" + (Vender.cantidadOptima - canVen) + " unidades menos que la cantidad óptima)";
		} else {
			rpta = "(" + Math.abs(Vender.cantidadOptima - canVen) + " unidades más que la cantidad óptima";
		}
		return rpta;
	}
	
	public String calcularPrecioPromedio(double pv) {
		String rpta = "";
		if (pv == Vender.precioPromedio) {
			rpta = "S/ "+ pv + "(Es igual al precio promedio)";
		} else if (pv < Vender.precioPromedio) {
			rpta = "S/ "+ pv + "(Es menor al precio promedio)";
		} else {
			rpta = "S/ "+ pv + "(Es mayor al precio promedio)";
		}
		return rpta;
	}
}
