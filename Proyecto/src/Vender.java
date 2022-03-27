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

public class Vender extends JInternalFrame {
	
	double precio, imp_compra, imp_pagar, imp_descuento, descuento;
	String obsequio, modelo;
	int cmodel, cantidad;
	
	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Variable globales de bbsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	
	private JPanel contentPane;
	private JTextField txtPrecio;
	private JTextField txtCantidad;

	public Vender() {
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setBounds(21, 19, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {" ", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setFont(new Font("Roboto", Font.PLAIN, 11));
		cboModelo.setBounds(66, 15, 86, 22);
		contentPane.add(cboModelo);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(21, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtPrecio.setBounds(66, 41, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(21, 69, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(66, 66, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(82, 115, 257, 148);
		contentPane.add(txtArea);
		
		JButton btnSell = new JButton("Vender");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ingresar datos
				cantidad = Integer.parseInt(txtCantidad.getText());
				cmodel = cboModelo.getSelectedIndex(); //0,1,2,3
				
				//Condicional
				switch (cmodel) {
				case 0: JOptionPane.showMessageDialog(null, "Seleccione un modelo");break; //Es lo que aparecerá por default, una parte en blanca para dar oportunidad al usuario de elegir un valor
				case 1: 
					precio = precio0;
					modelo = modelo0;
					break;
				case 2: 
					precio = precio1;
					modelo = modelo1;
					break;
				case 3: 
					precio = precio2;
					modelo = modelo2;
					break;
				case 4:
					precio = precio3;
					modelo = modelo3;
				default:
					precio = precio4;
					modelo = modelo4;
				}
				
				//Obsequio y Descuento
				if (cantidad >0 && cantidad == 1) {
					obsequio = obsequio1;
					descuento = porcentaje1;
				}else if (cantidad >=2 && cantidad <=5) {
					obsequio = obsequio2;
					descuento = porcentaje1;
				}else if (cantidad >= 6 && cantidad <= 10) {
					obsequio = obsequio3;
					descuento = porcentaje2;
				}else if (cantidad >= 11 && cantidad <= 15) {
					descuento = porcentaje3;
					obsequio = obsequio3;
				}else if (cantidad > 15) {
					descuento = porcentaje4;
					obsequio = obsequio3;
				}else {
					txtArea.append(" ");
				}
				
				//Ecuacion
				imp_compra = precio * cantidad;
				imp_descuento = imp_compra * (descuento / 100);
				imp_pagar = imp_compra - imp_descuento;
				
				
				//Salida
				if (cantidad > 0 && cmodel > 0) {
					txtArea.setText("BOLETA DE VENTA "+"\n");
					txtArea.append(" "+"\n");
					txtArea.append("Modelo: "+modelo+"\n");
					txtPrecio.setText(precio+"");
					txtArea.append("Precio: "+precio+"\n");
					txtArea.append("Cantidad: "+cantidad+"\n");
					txtArea.append("Importe de compra: "+imp_compra+"\n");
					txtArea.append("Importe de descuento: "+imp_descuento+"\n");
					txtArea.append("Importe a pagar: "+imp_pagar+"\n");
					txtArea.append("Obsequio: "+obsequio+"\n");
				}else if (cantidad <= 0){
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
				}
				
			}
		});
		btnSell.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSell.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnSell.setBounds(308, 15, 89, 23);
		contentPane.add(btnSell);
		
		JButton btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(""); //limpio txtArea
				txtCantidad.setText(""); //limpio txtCantidad
				txtPrecio.setText(""); //limpio txtPrecio
				cboModelo.setSelectedIndex(0); //Limpio mis combobox
			}
		});
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDelete.setBounds(308, 40, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setBounds(308, 69, 89, 23);
		contentPane.add(btnClose);
		setVisible(true);
	}
}
