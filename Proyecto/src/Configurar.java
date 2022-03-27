import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurar extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtCantidadOptima;

	public Configurar() {
		setTitle("Configurar cantidad optima");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		int canopt;

		canopt = Tienda.cantidadOptima;

		JLabel lblCanOptima = new JLabel("Cantidad optima de unidades vendidas");
		lblCanOptima.setBounds(19, 28, 225, 21);
		contentPane.add(lblCanOptima);

		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(254, 28, 71, 20);
		contentPane.add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAceptar.setBounds(335, 27, 89, 23);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 61, 89, 23);
		contentPane.add(btnCancelar);
	}
}
