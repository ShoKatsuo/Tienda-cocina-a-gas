import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JInternalFrame {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUnaunidad;
	private JTextField txtDosacinco;
	private JTextField txtSeisamas;

	public ConfigurarObsequios() {
		setBounds(100, 100, 381, 169);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Tienda.obsequio1 = txtUnaunidad.getText();
					
					
					Tienda.obsequio2 = txtDosacinco.getText();
					
					
					Tienda.obsequio3 = txtSeisamas.getText();
					
					
					dispose();
				}
			});
			btnAceptar.setBounds(269, 20, 86, 23);
			contentPanel.add(btnAceptar);
			btnAceptar.setActionCommand("OK");
			getRootPane().setDefaultButton(btnAceptar);
		}
		txtUnaunidad.setText(Tienda.obsequio1);
		txtDosacinco.setText(Tienda.obsequio2);
		txtSeisamas.setText(Tienda.obsequio3);
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(269, 45, 86, 23);
			contentPanel.add(btnCancelar);
			btnCancelar.setActionCommand("Cancel");
		}
		{
			JLabel lblUnidad = new JLabel("1 unidad");
			lblUnidad.setBounds(10, 24, 52, 14);
			contentPanel.add(lblUnidad);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("2 a 5 unidades");
			lblNewLabel_1.setBounds(10, 49, 88, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("6 a m\u00E1s unidades");
			lblNewLabel_2.setBounds(10, 76, 114, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtUnaunidad = new JTextField();
			txtUnaunidad.setBounds(149, 21, 86, 20);
			contentPanel.add(txtUnaunidad);
			txtUnaunidad.setColumns(10);
		}
		{
			txtDosacinco = new JTextField();
			txtDosacinco.setBounds(149, 46, 86, 20);
			contentPanel.add(txtDosacinco);
			txtDosacinco.setColumns(10);
		}
		{
			txtSeisamas = new JTextField();
			txtSeisamas.setBounds(149, 73, 86, 20);
			contentPanel.add(txtSeisamas);
			txtSeisamas.setColumns(10);
			setVisible(true);
		}
	}

}
