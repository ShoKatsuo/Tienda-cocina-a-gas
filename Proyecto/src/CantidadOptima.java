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

public class CantidadOptima extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadOptima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CantidadOptima frame = new CantidadOptima();
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
	public CantidadOptima() {
		setTitle("Configurar Cantidad Optima");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCuotaDiaria = new JLabel("Cantidad optima esperada ");
		lblCuotaDiaria.setBounds(34, 23, 153, 14);
		contentPane.add(lblCuotaDiaria);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(211, 20, 86, 20);
		contentPane.add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tienda.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
			}
		});
		btnAceptar.setBounds(319, 19, 89, 23);
		contentPane.add(btnAceptar);
		
		txtCantidadOptima.setText(String.valueOf(Tienda.cantidadOptima));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(319, 53, 89, 23);
		contentPane.add(btnCancelar);
	}

}
