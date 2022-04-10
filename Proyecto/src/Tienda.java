import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultDesktopManager;
import javax.swing.DesktopManager;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tienda extends JFrame {

	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	public static String imagen0 = "img/mabe_emp6120.jpg";
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	public static String imagen1 = "img/indurama_parma.jpg";
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	public static String imagen2 = "img/sole_cosol.jpg";
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	public static String imagen3 = "img/coldex_cx602.jpg";
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	public static String imagen4 = "img/recco_dakota.jpg";
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;

	private JPanel contentPane;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
					Tienda frame = new Tienda();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 762, 475);
		JDesktopPane dskPane = new JDesktopPane();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar Cocina");
		mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCocina consulta = new ConsultarCocina();
				dskPane.add(consulta);
			}

		});
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar Cocina");
		mntmNewMenuItem_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarCocina modificar = new ModificarCocina();
				dskPane.add(modificar);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listar Cocinas");
		mntmNewMenuItem_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCocinas lista = new ListarCocinas();
				dskPane.add(lista);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		//OBAUTE
		JMenu mnVenta = new JMenu("Ventas");
		mnVenta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menuBar.add(mnVenta);
		
		JMenuItem mniVender = new JMenuItem("Venta Directa");
		mniVender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mniVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vender v = new Vender();
				dskPane.add(v);
			}
		});
		mnVenta.add(mniVender);
	
		JMenuItem mniGenerarReporte = new JMenuItem("Generar Reporte");
		mniGenerarReporte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mniGenerarReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerarReporte gr = new GenerarReporte();
				dskPane.add(gr);
			}
		});
		mnVenta.add(mniGenerarReporte);
				
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		contentPane.add(dskPane, BorderLayout.CENTER);

		setContentPane(contentPane);
		setVisible(true);
	}

}
