package Formularios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N1");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(66, 8, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblN = new JLabel("N2");
		lblN.setBounds(10, 58, 46, 14);
		contentPane.add(lblN);
		
		JLabel lblNewLabel_1_1 = new JLabel("N3");
		lblNewLabel_1_1.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(66, 55, 86, 20);
		contentPane.add(txtN2);
		
		txtN3 = new JTextField();
		txtN3.setColumns(10);
		txtN3.setBounds(66, 106, 86, 20);
		contentPane.add(txtN3);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int n3 = Integer.parseInt(txtN3.getText());
				warning(n1, n2, n3);
			}
		});
		btn.setBounds(335, 227, 89, 23);
		contentPane.add(btn);
	}
	
	private void warning(int n1, int n2, int n3) {
		int total = n1 + n2 + n3;
		String mensaje = "Numeros:\nN1:  " + n1 + "\nN2:  " + n2 + "\nN3:  " + n3 + "\nSuma:  " + total;
		JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
	}
}