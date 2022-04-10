import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Vender extends JInternalFrame {

	double precio, imp_compra, imp_pagar, imp_descuento, descuento;
	String obsequio, modelo;
	int cmodel, cantidad;
	DecimalFormat df = new DecimalFormat("##.00");

	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static int vtaModelo0 = 0;
	public static int canModelo0 = 0;
	public static double impModelo0 = 0;

	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static int vtaModelo1 = 0;
	public static int canModelo1 = 0;
	public static double impModelo1 = 0;

	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static int vtaModelo2 = 0;
	public static int canModelo2 = 0;
	public static double impModelo2 = 0;
	
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static int vtaModelo3 = 0;
	public static int canModelo3 = 0;
	public static double impModelo3 = 0;

	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static int vtaModelo4 = 0;
	public static int canModelo4 = 0;
	public static double impModelo4 = 0;

	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;


	// Variable globales de bbsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";

	// Variable global de Cuota Diaria
	public static double CuotaDiaria = 75000;
	
	//Variable global Cantidad Optima
	public static int cantidadOptima = 30;
	
	//Promedio
	public static double precioPromedio = 873.20;
	public static double precioMenor = 629.00;
	public static double precioMayor = 1089.00;
		
	public static double anchoPromedio = 67.4;
	public static double anchoMenor = 60.00;
	public static double anchoMayor = 80.00;

	private JPanel contentPane;
	private JTextField txtPrecio;
	private JTextField txtCantidad;

	// Contadores & Acumuladores (Globales)
	public static int numVta = 0;
	public static double totAcum = 0.0;

	public Vender() {
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 15, 86, 44);
		contentPane.add(lblNewLabel);

		JComboBox cboModelo = new JComboBox();
		cboModelo.setBackground(Color.WHITE);
		cboModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int index = cboModelo.getSelectedIndex();
				double precio = 0.0;
				switch (index) {
				case 0:
					JOptionPane.showMessageDialog(null, "Seleccione Modelo");
					break;
				case 1:
					precio = precio0;
					break;
				case 2:
					precio = precio1;
					break;
				case 3:
					precio = precio2;
					break;
				case 4:
					precio = precio3;
					break;
				default:
					precio = precio4;
					break;
				}
				txtPrecio.setText(precio + "");
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel(new String[] { "[Seleccione]", "Mabe EMP6120PG0", "Indurama Parma",
				"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
		cboModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cboModelo.setBounds(126, 16, 234, 44);
		contentPane.add(cboModelo);

		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 70, 94, 44);
		contentPane.add(lblNewLabel_1);

		txtPrecio = new JTextField();
		txtPrecio.setBackground(Color.WHITE);
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPrecio.setBounds(126, 71, 234, 44);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 125, 96, 44);
		contentPane.add(lblNewLabel_2);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(126, 127, 234, 44);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 192, 500, 261);
		contentPane.add(scrollPane);

		JTextArea txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);

		JButton btnSell = new JButton("VENDER");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ingresar datos
				cantidad = Integer.parseInt(txtCantidad.getText());
				cmodel = cboModelo.getSelectedIndex(); // 0,1,2,3
				
				// Obsequio y Descuento
				if (cantidad > 0 && cantidad == 1) {
					obsequio = obsequio1;
					descuento = porcentaje1;
				} else if (cantidad >= 2 && cantidad <= 5) {
					obsequio = obsequio2;
					descuento = porcentaje1;
				} else if (cantidad >= 6 && cantidad <= 10) {
					obsequio = obsequio3;
					descuento = porcentaje2;
				} else if (cantidad >= 11 && cantidad <= 15) {
					descuento = porcentaje3;
					obsequio = obsequio3;
				} else if (cantidad > 15) {
					descuento = porcentaje4;
					obsequio = obsequio3;
				} else {
					txtArea.append(" ");
				}

				// Condicional
				switch (cmodel) {
				case 0:
					JOptionPane.showMessageDialog(null, "Seleccione un modelo");
					break; // Es lo que aparecerá por default, una parte en blanca para dar oportunidad al
							// usuario de elegir un valor
				case 1:
					precio = precio0;
					modelo = modelo0;
					vtaModelo0++;
					canModelo0 += cantidad;
					impModelo0 += (precio * cantidad - descuento);
					break;
				case 2:
					precio = precio1;
					modelo = modelo1;
					vtaModelo1++;
					canModelo1 += cantidad;
					impModelo1 += (precio * cantidad - descuento);
					break;
				case 3:
					precio = precio2;
					modelo = modelo2;
					vtaModelo2++;
					canModelo2 += cantidad;
					impModelo2 += (precio * cantidad - descuento);
					break;
				case 4:
					precio = precio3;
					modelo = modelo3;
					vtaModelo3++;
					canModelo3 += cantidad;
					impModelo3 += (precio * cantidad - descuento);
				default:
					precio = precio4;
					modelo = modelo4;
					vtaModelo4++;
					canModelo4 += cantidad;
					impModelo4 += (precio * cantidad - descuento);
				}
			
				// Ecuacion
				imp_compra = precio * cantidad;
				imp_descuento = imp_compra * (descuento / 100);
				imp_pagar = imp_compra - imp_descuento;

				// Salida
				if (cantidad > 0 && cmodel > 0) {

					numVta++;
					totAcum += imp_pagar;

					txtArea.setText("BOLETA DE VENTA " + "\n");
					txtArea.append(" " + "\n");
					txtArea.append("Modelo: " + modelo + "\n");
					txtPrecio.setText(precio + "");
					txtArea.append("Precio: S/ " + df.format(precio) + "\n");
					txtArea.append("Cantidad: " + cantidad + "\n");
					txtArea.append("Importe de compra: S/ " + df.format(imp_compra) + "\n");
					txtArea.append("Importe de descuento: S/ " + df.format(imp_descuento) + "\n");
					txtArea.append("Importe a pagar: S/ " + df.format(imp_pagar) + "\n");
					txtArea.append("Obsequio: " + obsequio + "\n");

					if (numVta % 5 == 0) {
						JOptionPane.showMessageDialog(null,
								"<html><h3>Venta Nro." + numVta + "</h3><br/><h3>Importe Total Acumulado: S/<h3 style='color: green;'>" + totAcum
										+ "</h3></h3><br/><h3> Porcentaje Cuota Diaria: <h3 style='color: green;'>"
										+ df.format(totAcum * 100 / CuotaDiaria) + "%</h3></h3><br/></html>");
					}

				} else if (cantidad <= 0) {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
				}

			}
		});
		btnSell.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSell.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSell.setBounds(384, 16, 136, 44);
		contentPane.add(btnSell);

		JButton btnDelete = new JButton("BORRAR");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(""); // limpio txtArea
				txtCantidad.setText(""); // limpio txtCantidad
				txtPrecio.setText(""); // limpio txtPrecio
				cboModelo.setSelectedIndex(0); // Limpio mis combobox
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(384, 71, 136, 44);
		contentPane.add(btnDelete);

		JButton btnClose = new JButton("CERRAR");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setBounds(384, 126, 136, 44);
		contentPane.add(btnClose);
		setVisible(true);
	}
}
