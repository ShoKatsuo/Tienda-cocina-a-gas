import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;

public class AcercaDe_Ventas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaDe_Ventas frame = new AcercaDe_Ventas();
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
	public class Vender {
		
	}
	
	public AcercaDe_Ventas() {
		setTitle("Acerca de Ventas");
		setFont(new Font("Roboto", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBackground(new Color(238,238,238));
		txtArea.setFont(new Font("Roboto", Font.PLAIN, 13));
		txtArea.setEditable(false);
		txtArea.setBounds(40, 24, 258, 94);
		contentPane.add(txtArea);
		
		JButton btnClose = new JButton("Aceptar");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnClose.setBounds(125, 129, 89, 23);
		contentPane.add(btnClose);
	}
}
