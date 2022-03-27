import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;

public class ListarCocinas extends JInternalFrame {

	private final JPanel contentPanel = new JPanel();

	public ListarCocinas() {
		setVisible(true);
		setTitle("Listar Cocinas");
		setBounds(100, 100, 600, 659);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 568, 545);
		contentPanel.add(scrollPane);

		JTextPane txtS = new JTextPane();
		txtS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(txtS);

		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(442, 565, 136, 44);
		contentPanel.add(btnCerrar);

		JButton btnListar = new JButton("LISTAR");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText(null);
				Listar();
			}

			void Listar() {
				// Mostrar la lista
				String lista = "";

				lista += "<h1 style='text-decoration:underline'><center>LISTADO DE COCINAS</center></h1>" + "<br/>";
				lista += "<br/>";

				lista += "Modelo\t: " + Tienda.modelo0 + "<br/>";
				lista += "Precio\t: S/" + Tienda.precio0 + "<br/>";
				lista += "Profundidad\t: " + Tienda.fondo0 + "<br/>";
				lista += "Ancho\t: " + Tienda.ancho0 + "<br/>";
				lista += "Alto\t: " + Tienda.alto0 + "<br/>";
				lista += "Quemadores\t: " + Tienda.quemadores0 + "<br/>";

				lista += "<hr/>";

				lista += "Modelo\t: " + Tienda.modelo1 + "<br/>";
				lista += "Precio\t: S/" + Tienda.precio1 + "<br/>";
				lista += "Profundidad\t: " + Tienda.fondo1 + "<br/>";
				lista += "Ancho\t: " + Tienda.ancho1 + "<br/>";
				lista += "Alto\t: " + Tienda.alto1 + "<br/>";
				lista += "Quemadores\t: " + Tienda.quemadores1 + "<br/>";

				lista += "<hr/>";

				lista += "Modelo\t: " + Tienda.modelo2 + "<br/>";
				lista += "Precio\t: S/" + Tienda.precio2 + "<br/>";
				lista += "Profundidad\t: " + Tienda.fondo2 + "<br/>";
				lista += "Ancho\t: " + Tienda.ancho2 + "<br/>";
				lista += "Alto\t: " + Tienda.alto2 + "<br/>";
				lista += "Quemadores\t: " + Tienda.quemadores2 + "<br/>";

				lista += "<hr/>";

				lista += "Modelo\t: " + Tienda.modelo3 + "<br/>";
				lista += "Precio\t: S/" + Tienda.precio3 + "<br/>";
				lista += "Profundidad\t: " + Tienda.fondo3 + "<br/>";
				lista += "Ancho\t: " + Tienda.ancho3 + "<br/>";
				lista += "Alto\t: " + Tienda.alto3 + "<br/>";
				lista += "Quemadores\t: " + Tienda.quemadores3 + "<br/>";

				lista += "<hr/>";

				lista += "Modelo\t: " + Tienda.modelo4 + "<br/>";
				lista += "Precio\t: S/" + Tienda.precio4 + "<br/>";
				lista += "Profundidad\t: " + Tienda.fondo4 + "<br/>";
				lista += "Ancho\t: " + Tienda.ancho4 + "<br/>";
				lista += "Alto\t: " + Tienda.alto4 + "<br/>";
				lista += "Quemadores\t: " + Tienda.quemadores4 + "<br/>";

				txtS.setContentType("text/html");
				txtS.setText(lista);
			}
		});
		btnListar.setBounds(291, 565, 136, 44);
		contentPanel.add(btnListar);
		setVisible(true);
	}
}
