import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;

/* Principal: saldoCredito, saldoCorriente variables globales
 * Ingreso y Retirada: desplegable con cuenta corriente y cuenta credito
 * Comprobar si se ha seleccionado, cual se ha seleccionado
 * Si es corriente maximo ingreso y retirada 150, si es credito maximo ingreso y retirada 300. Color rojo saldo reirada,
 * color verde saldo ingreso
 * */

public class Principal {

	private JFrame frame;
	private JTextField txtMoney;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmRetirar = new JMenuItem("Retirar");
		mntmRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retirar frame = new Retirar();
				frame.setVisible(true);
			}
		});
		mnInicio.add(mntmRetirar);
		
		JMenuItem mntmIngresar = new JMenuItem("Ingresar");
		mntmIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingresar frame = new Ingresar();
				frame.setVisible(true);
			}
		});
		mnInicio.add(mntmIngresar);
		
	}

}
