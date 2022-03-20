import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarCocina extends JDialog {

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
			ModificarCocina dialog = new ModificarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarCocina() {
		setTitle("Modificar Cocina");
		setBounds(100, 100, 379, 261);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 34, 76, 13);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblPrecios = new JLabel("Precio (S./)");
			lblPrecios.setBounds(10, 61, 76, 13);
			contentPanel.add(lblPrecios);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 84, 76, 13);
			contentPanel.add(lblAncho);
		}
		{
			JLabel lblAltocm = new JLabel("Alto (cm)");
			lblAltocm.setBounds(10, 107, 76, 13);
			contentPanel.add(lblAltocm);
		}
		{
			JLabel lblFondocm = new JLabel("Fondo (cm)");
			lblFondocm.setBounds(10, 130, 76, 13);
			contentPanel.add(lblFondocm);
		}
		{
			JLabel lblQue = new JLabel("Quemadores");
			lblQue.setBounds(10, 153, 76, 13);
			contentPanel.add(lblQue);
		}
		{
			JComboBox cboModelo = new JComboBox();
			cboModelo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setTextAreaInfo();
				}
				void setTextAreaInfo(){
					//Definir variables
					int indexModelo, consulQuemadores;
					double consulPrecio, consulAncho, consulAlto, consulFondo;
					indexModelo=cboModelo.getSelectedIndex();
					consulPrecio=0;
					consulAncho=0;
					consulAlto=0;
					consulFondo=0;
					consulQuemadores=0;
					//Proceso
					switch(indexModelo) {
						case 0:
							consulPrecio=0;
							consulAncho=0;
							consulAlto=0;
							consulFondo=0;
							consulQuemadores=0;
							consulPrecio=Tienda.precio0;
							consulAncho=Tienda.ancho0;
							consulAlto=Tienda.alto0;
							consulFondo=Tienda.fondo0;
							consulQuemadores=Tienda.quemadores0;
							break;
						case 1:
							consulPrecio=Tienda.precio1;
							consulAncho=Tienda.ancho1;
							consulAlto=Tienda.alto1;
							consulFondo=Tienda.fondo1;
							consulQuemadores=Tienda.quemadores1;
							break;
						case 2:
							consulPrecio=Tienda.precio2;
							consulAncho=Tienda.ancho2;
							consulAlto=Tienda.alto2;
							consulFondo=Tienda.fondo2;
							consulQuemadores=Tienda.quemadores2;
							break;
						case 3:
							consulPrecio=Tienda.precio3;
							consulAncho=Tienda.ancho3;
							consulAlto=Tienda.alto3;
							consulFondo=Tienda.fondo3;
							consulQuemadores=Tienda.quemadores3;
							break;
						case 4:
							consulPrecio=Tienda.precio4;
							consulAncho=Tienda.ancho4;
							consulAlto=Tienda.alto4;
							consulFondo=Tienda.fondo4;
							consulQuemadores=Tienda.quemadores4;
							break;
					}
					//Salida
					txtPrecio.setText(String.valueOf(consulPrecio));
					txtAncho.setText(String.valueOf(consulAncho));
					txtAlto.setText(String.valueOf(consulAlto));
					txtFondo.setText(String.valueOf(consulFondo));
					txtQuemadores.setText(String.valueOf(consulQuemadores));
				}
			});
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
			cboModelo.setBounds(96, 30, 134, 21);
			contentPanel.add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(96, 58, 134, 19);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setColumns(10);
			txtAncho.setBounds(96, 81, 134, 19);
			contentPanel.add(txtAncho);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setColumns(10);
			txtAlto.setBounds(96, 104, 134, 19);
			contentPanel.add(txtAlto);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setColumns(10);
			txtFondo.setBounds(96, 127, 134, 19);
			contentPanel.add(txtFondo);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setColumns(10);
			txtQuemadores.setBounds(96, 150, 134, 19);
			contentPanel.add(txtQuemadores);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCerrar.setBounds(270, 30, 85, 21);
			contentPanel.add(btnCerrar);
		}
		
		txtPrecio.setText(String.valueOf(Tienda.precio0));
		txtAncho.setText(String.valueOf(Tienda.ancho0));
		txtAlto.setText(String.valueOf(Tienda.ancho0));
		txtFondo.setText(String.valueOf(Tienda.fondo0));
		txtQuemadores.setText(String.valueOf(Tienda.quemadores0));
		
		{
			JButton btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int Modelo;
					Modelo=0;
					//Seleccionador
					switch(Modelo) {
						case 0:
							Tienda.precio0=Double.parseDouble(txtPrecio.getText());
							Tienda.ancho0=Double.parseDouble(txtAncho.getText());
							Tienda.alto0=Double.parseDouble(txtAlto.getText());
							Tienda.fondo0=Double.parseDouble(txtFondo.getText());
							Tienda.quemadores0=Integer.parseInt(txtQuemadores.getText());
						case 1:
							Tienda.precio1=Double.parseDouble(txtPrecio.getText());
							Tienda.ancho1=Double.parseDouble(txtAncho.getText());
							Tienda.alto1=Double.parseDouble(txtAlto.getText());
							Tienda.fondo1=Double.parseDouble(txtFondo.getText());
							Tienda.quemadores1=Integer.parseInt(txtQuemadores.getText());
						case 2:
							Tienda.precio2=Double.parseDouble(txtPrecio.getText());
							Tienda.ancho2=Double.parseDouble(txtAncho.getText());
							Tienda.alto2=Double.parseDouble(txtAlto.getText());
							Tienda.fondo2=Double.parseDouble(txtFondo.getText());
							Tienda.quemadores2=Integer.parseInt(txtQuemadores.getText());
						case 3:
							Tienda.precio3=Double.parseDouble(txtPrecio.getText());
							Tienda.ancho3=Double.parseDouble(txtAncho.getText());
							Tienda.alto3=Double.parseDouble(txtAlto.getText());
							Tienda.fondo3=Double.parseDouble(txtFondo.getText());
							Tienda.quemadores3=Integer.parseInt(txtQuemadores.getText());
						case 4:
							Tienda.precio4=Double.parseDouble(txtPrecio.getText());
							Tienda.ancho4=Double.parseDouble(txtAncho.getText());
							Tienda.alto4=Double.parseDouble(txtAlto.getText());
							Tienda.fondo4=Double.parseDouble(txtFondo.getText());
							Tienda.quemadores4=Integer.parseInt(txtQuemadores.getText());
					}
					dispose();
					
				}
			});
			btnGrabar.setBounds(270, 57, 85, 21);
			contentPanel.add(btnGrabar);
		}
	}

}
