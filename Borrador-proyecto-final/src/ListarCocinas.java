import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class ListarCocinas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarCocinas dialog = new ListarCocinas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarCocinas() {
		setTitle("Listar Cocinas");
		setBounds(100, 100, 576, 367);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 489, 247);
		contentPanel.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(282, 282, 85, 21);
		contentPanel.add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText(null);
				Listar();
			}
			void Listar() {
				//Mostrar la lista
				txtS.setText("LISTADO DE COCINAS"+"\n\n");
				txtS.append("Modelo\t: "+Tienda.modelo0+"\n");
				txtS.append("Precio\t: S/"+Tienda.precio0+"\n");
				txtS.append("Profundidad\t: "+Tienda.fondo0+"cm\n");
				txtS.append("Ancho\t: "+Tienda.ancho0+"cm\n");
				txtS.append("Alto\t: "+Tienda.alto0+"cm\n");
				txtS.append("Quemadores\t: "+Tienda.quemadores0+"\n\n");

				txtS.append("Modelo\t: "+Tienda.modelo1+"\n");
				txtS.append("Precio\t: S/"+Tienda.precio1+"\n");
				txtS.append("Profundidad\t: "+Tienda.fondo1+"cm\n");
				txtS.append("Ancho\t: "+Tienda.ancho1+"cm\n");
				txtS.append("Alto\t: "+Tienda.alto1+"cm\n");
				txtS.append("Quemadores\t: "+Tienda.quemadores1+"\n\n");
				
				txtS.append("Modelo\t: "+Tienda.modelo2+"\n");
				txtS.append("Precio\t: S/"+Tienda.precio2+"\n");
				txtS.append("Profundidad\t: "+Tienda.fondo2+"cm\n");
				txtS.append("Ancho\t: "+Tienda.ancho2+"cm\n");
				txtS.append("Alto\t: "+Tienda.alto2+"cm\n");
				txtS.append("Quemadores\t: "+Tienda.quemadores2+"\n\n");
				
				txtS.append("Modelo\t: "+Tienda.modelo3+"\n");
				txtS.append("Precio\t: S/"+Tienda.precio3+"\n");
				txtS.append("Profundidad\t: "+Tienda.fondo3+"cm\n");
				txtS.append("Ancho\t: "+Tienda.ancho3+"cm\n");
				txtS.append("Alto\t: "+Tienda.alto3+"cm\n");
				txtS.append("Quemadores\t: "+Tienda.quemadores3+"\n\n");
				
				txtS.append("Modelo\t: "+Tienda.modelo4+"\n");
				txtS.append("Precio\t: S/"+Tienda.precio4+"\n");
				txtS.append("Profundidad\t: "+Tienda.fondo4+"cm\n");
				txtS.append("Ancho\t: "+Tienda.ancho4+"cm\n");
				txtS.append("Alto\t: "+Tienda.alto4+"cm\n");
				txtS.append("Quemadores\t: "+Tienda.quemadores4+"\n\n");
			}
		});
		btnListar.setBounds(187, 282, 85, 21);
		contentPanel.add(btnListar);
	}
}
