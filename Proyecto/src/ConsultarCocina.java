import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class ConsultarCocina extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarCocina dialog = new ConsultarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarCocina() {
		
		setModal(true);
		setResizable(false);
		setTitle("Consultar cocina");
		setBounds(100, 100, 439, 244);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(27, 31, 79, 13);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(27, 54, 79, 13);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(27, 77, 79, 13);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(27, 100, 79, 13);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(27, 123, 79, 13);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Quemadores");
		lblNewLabel_5.setBounds(27, 146, 79, 13);
		contentPanel.add(lblNewLabel_5);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrecio.setText(null);
				txtAncho.setText(null);
				txtAlto.setText(null);
				txtFondo.setText(null);
				txtQuemadores.setText(null);
				setTextAreaInfo();
			}
			
			void setTextAreaInfo() {
				//Definir variables
				int indexModelo;
				indexModelo=cboModelo.getSelectedIndex();
				//Proceso
				switch(indexModelo) {
					case 0:
						txtPrecio.setText(String.valueOf(Tienda.precio0));
						txtAncho.setText(String.valueOf(Tienda.ancho0));
						txtAlto.setText(String.valueOf(Tienda.alto0));
						txtFondo.setText(String.valueOf(Tienda.fondo0));
						txtQuemadores.setText(String.valueOf(Tienda.quemadores0));
						break;
					case 1:
						txtPrecio.setText(String.valueOf(Tienda.precio1));
						txtAncho.setText(String.valueOf(Tienda.ancho1));
						txtAlto.setText(String.valueOf(Tienda.alto1));
						txtFondo.setText(String.valueOf(Tienda.fondo1));
						txtQuemadores.setText(String.valueOf(Tienda.quemadores1));
						break;
					case 2:
						txtPrecio.setText(String.valueOf(Tienda.precio2));
						txtAncho.setText(String.valueOf(Tienda.ancho2));
						txtAlto.setText(String.valueOf(Tienda.alto2));
						txtFondo.setText(String.valueOf(Tienda.fondo2));
						txtQuemadores.setText(String.valueOf(Tienda.quemadores2));
						break;
					case 3:
						txtPrecio.setText(String.valueOf(Tienda.precio3));
						txtAncho.setText(String.valueOf(Tienda.ancho3));
						txtAlto.setText(String.valueOf(Tienda.alto3));
						txtFondo.setText(String.valueOf(Tienda.fondo3));
						txtQuemadores.setText(String.valueOf(Tienda.quemadores3));
						break;
					case 4:
						txtPrecio.setText(String.valueOf(Tienda.precio4));
						txtAncho.setText(String.valueOf(Tienda.ancho4));
						txtAlto.setText(String.valueOf(Tienda.alto4));
						txtFondo.setText(String.valueOf(Tienda.fondo4));
						txtQuemadores.setText(String.valueOf(Tienda.quemadores4));
						break;
				}
			}
		});
		cboModelo.setBounds(116, 27, 160, 21);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		contentPanel.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setBounds(116, 51, 160, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setForeground(Color.BLACK);
		txtAncho.setBounds(116, 74, 160, 19);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setForeground(new Color(0, 0, 0));
		txtAlto.setBounds(116, 97, 160, 19);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setForeground(Color.BLACK);
		txtFondo.setBounds(116, 120, 160, 19);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setForeground(Color.BLACK);
		txtQuemadores.setBounds(116, 143, 160, 19);
		contentPanel.add(txtQuemadores);
		txtQuemadores.setColumns(10);
		
		txtPrecio.setText(String.valueOf(Tienda.precio0));
		txtAncho.setText(String.valueOf(Tienda.ancho0));
		txtAlto.setText(String.valueOf(Tienda.ancho0));
		txtFondo.setText(String.valueOf(Tienda.fondo0));
		txtQuemadores.setText(String.valueOf(Tienda.quemadores0));
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(330, 27, 85, 21);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPanel.add(btnCerrar);
	}
}