import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ModificarCocina extends JInternalFrame {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	JComboBox cboModelo;

	public ModificarCocina() {
		setTitle("Modificar Cocina");
		setBounds(100, 100, 600, 520);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(26, 25, 130, 44);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblPrecios = new JLabel("Precio (S./)");
			lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecios.setBounds(26, 145, 130, 44);
			contentPanel.add(lblPrecios);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblAncho.setBounds(26, 85, 130, 44);
			contentPanel.add(lblAncho);
		}
		{
			JLabel lblAltocm = new JLabel("Alto (cm)");
			lblAltocm.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblAltocm.setBounds(26, 209, 130, 44);
			contentPanel.add(lblAltocm);
		}
		{
			JLabel lblFondocm = new JLabel("Fondo (cm)");
			lblFondocm.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblFondocm.setBounds(26, 274, 130, 44);
			contentPanel.add(lblFondocm);
		}
		{
			JLabel lblQue = new JLabel("Quemadores");
			lblQue.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblQue.setBounds(26, 342, 130, 44);
			contentPanel.add(lblQue);
		}
		{
			cboModelo = new JComboBox<>();
			cboModelo.setBackground(Color.WHITE);
			cboModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cboModelo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setTextAreaInfo();
				}

				void setTextAreaInfo() {
					// Definir variables
					int indexModelo;
					indexModelo = cboModelo.getSelectedIndex();
					// Proceso
					switch (indexModelo) {
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
			cboModelo.setModel(new DefaultComboBoxModel(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			cboModelo.setBounds(178, 25, 368, 44);
			contentPanel.add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBackground(Color.WHITE);
			txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPrecio.setBounds(178, 85, 368, 44);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setBackground(Color.WHITE);
			txtAncho.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtAncho.setColumns(10);
			txtAncho.setBounds(178, 148, 368, 44);
			contentPanel.add(txtAncho);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setBackground(Color.WHITE);
			txtAlto.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtAlto.setColumns(10);
			txtAlto.setBounds(178, 209, 368, 44);
			contentPanel.add(txtAlto);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setBackground(Color.WHITE);
			txtFondo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtFondo.setColumns(10);
			txtFondo.setBounds(178, 274, 368, 44);
			contentPanel.add(txtFondo);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setBackground(Color.WHITE);
			txtQuemadores.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtQuemadores.setColumns(10);
			txtQuemadores.setBounds(178, 342, 368, 44);
			contentPanel.add(txtQuemadores);
		}
		{
			JButton btnCerrar = new JButton("CERRAR");
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCerrar.setBounds(410, 408, 136, 44);
			contentPanel.add(btnCerrar);
		}

		txtPrecio.setText(String.valueOf(Tienda.precio0));
		txtAncho.setText(String.valueOf(Tienda.ancho0));
		txtAlto.setText(String.valueOf(Tienda.ancho0));
		txtFondo.setText(String.valueOf(Tienda.fondo0));
		txtQuemadores.setText(String.valueOf(Tienda.quemadores0));

		{
			JButton btnGrabar = new JButton("GRABAR");
			btnGrabar.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnGrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					int opcion = JOptionPane.showConfirmDialog (null, "¿Seguro de grabar los datos?","Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
					if (opcion == JOptionPane.YES_OPTION) {
						int Modelo;
						Modelo = cboModelo.getSelectedIndex();
						// Seleccionador
						switch (Modelo) {
						case 0:
							Tienda.precio0 = Double.parseDouble(txtPrecio.getText());
							Tienda.ancho0 = Double.parseDouble(txtAncho.getText());
							Tienda.alto0 = Double.parseDouble(txtAlto.getText());
							Tienda.fondo0 = Double.parseDouble(txtFondo.getText());
							Tienda.quemadores0 = Integer.parseInt(txtQuemadores.getText());
							break;
						case 1:
							Tienda.precio1 = Double.parseDouble(txtPrecio.getText());
							Tienda.ancho1 = Double.parseDouble(txtAncho.getText());
							Tienda.alto1 = Double.parseDouble(txtAlto.getText());
							Tienda.fondo1 = Double.parseDouble(txtFondo.getText());
							Tienda.quemadores1 = Integer.parseInt(txtQuemadores.getText());
							break;
						case 2:
							Tienda.precio2 = Double.parseDouble(txtPrecio.getText());
							Tienda.ancho2 = Double.parseDouble(txtAncho.getText());
							Tienda.alto2 = Double.parseDouble(txtAlto.getText());
							Tienda.fondo2 = Double.parseDouble(txtFondo.getText());
							Tienda.quemadores2 = Integer.parseInt(txtQuemadores.getText());
							break;
						case 3:
							Tienda.precio3 = Double.parseDouble(txtPrecio.getText());
							Tienda.ancho3 = Double.parseDouble(txtAncho.getText());
							Tienda.alto3 = Double.parseDouble(txtAlto.getText());
							Tienda.fondo3 = Double.parseDouble(txtFondo.getText());
							Tienda.quemadores3 = Integer.parseInt(txtQuemadores.getText());
							break;
						case 4:
							Tienda.precio4 = Double.parseDouble(txtPrecio.getText());
							Tienda.ancho4 = Double.parseDouble(txtAncho.getText());
							Tienda.alto4 = Double.parseDouble(txtAlto.getText());
							Tienda.fondo4 = Double.parseDouble(txtFondo.getText());
							Tienda.quemadores4 = Integer.parseInt(txtQuemadores.getText());
							break;
						}
						
						JOptionPane.showMessageDialog(null, "Sus datos han sido grabados");
						dispose();
					}

				}
			});
			btnGrabar.setBounds(264, 408, 136, 44);
			contentPanel.add(btnGrabar);
			setVisible(true);
		}
	}

}
