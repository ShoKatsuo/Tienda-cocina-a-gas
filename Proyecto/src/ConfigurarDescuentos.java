import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ConfigurarDescuentos extends JDialog {
	private JTextField txtUnoacinco;
	private JTextField txtSeisadiez;
	private JTextField txtOnceaquince;
	private JTextField txtMasdequince;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuentos dialog = new ConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuentos() {
		setBounds(100, 100, 450, 258);
		getContentPane().setLayout(null);
		
		txtUnoacinco = new JTextField();
		txtUnoacinco.setBounds(152, 26, 95, 20);
		getContentPane().add(txtUnoacinco);
		txtUnoacinco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(24, 32, 118, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(270, 29, 19, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setBounds(24, 72, 118, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("11 a 15 unidades");
		lblNewLabel_3.setBounds(24, 117, 118, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("M\u00E1s de 15 unidades");
		lblNewLabel_4.setBounds(24, 155, 118, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtSeisadiez = new JTextField();
		txtSeisadiez.setBounds(152, 66, 95, 20);
		getContentPane().add(txtSeisadiez);
		txtSeisadiez.setColumns(10);
		
		txtOnceaquince = new JTextField();
		txtOnceaquince.setBounds(152, 111, 95, 20);
		getContentPane().add(txtOnceaquince);
		txtOnceaquince.setColumns(10);
		
		txtMasdequince = new JTextField();
		txtMasdequince.setBounds(152, 152, 95, 20);
		getContentPane().add(txtMasdequince);
		txtMasdequince.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(270, 69, 19, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(270, 117, 22, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(270, 155, 19, 14);
		getContentPane().add(lblNewLabel_7);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(319, 28, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(319, 68, 89, 23);
		getContentPane().add(btnCancelar);
	}
}