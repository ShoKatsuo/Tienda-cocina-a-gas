import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCuotaDiaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCuotaDiaria frame = new ConfigurarCuotaDiaria();
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
	public ConfigurarCuotaDiaria() {
		setTitle("Configurar Cuota Diaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCuotaDiaria = new JLabel("Cuota diaria esperada S/.");
		lblCuotaDiaria.setBounds(34, 23, 153, 14);
		contentPane.add(lblCuotaDiaria);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setBounds(211, 20, 86, 20);
		contentPane.add(txtCuotaDiaria);
		txtCuotaDiaria.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tienda.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
			}
		});
		btnAceptar.setBounds(319, 19, 89, 23);
		contentPane.add(btnAceptar);
		
		txtCuotaDiaria.setText(String.valueOf(Tienda.cuotaDiaria));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(319, 53, 89, 23);
		contentPane.add(btnCancelar);
	}

}
