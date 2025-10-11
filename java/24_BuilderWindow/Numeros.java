package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Numeros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JLabel n2;
	private JTextField txtN2;
	private JLabel n3;
	private JTextField txtN3;
	private JLabel n;
	private JTextField txtN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numeros frame = new Numeros();
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
	public Numeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel n1 = new JLabel("N1");
		n1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n1.setBounds(25, 15, 53, 24);
		contentPane.add(n1);
		
		txtN1 = new JTextField();
		txtN1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtN1.setBounds(88, 13, 94, 28);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		n2 = new JLabel("N2");
		n2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n2.setBounds(25, 65, 53, 24);
		contentPane.add(n2);
		
		txtN2 = new JTextField();
		txtN2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtN2.setColumns(10);
		txtN2.setBounds(88, 63, 94, 28);
		contentPane.add(txtN2);
		
		n3 = new JLabel("N3");
		n3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n3.setBounds(25, 118, 53, 24);
		contentPane.add(n3);
		
		txtN3 = new JTextField();
		txtN3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtN3.setColumns(10);
		txtN3.setBounds(88, 116, 94, 28);
		contentPane.add(txtN3);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int n3 = Integer.parseInt(txtN3.getText());
				
				txtN.setText(n1 + ", " + n2 + ", " + n3);
			}
		});
		btn.setBounds(335, 227, 89, 23);
		contentPane.add(btn);
		
		n = new JLabel("N");
		n.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n.setBounds(25, 226, 53, 24);
		contentPane.add(n);
		
		txtN = new JTextField();
		txtN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtN.setColumns(10);
		txtN.setBounds(88, 226, 216, 28);
		contentPane.add(txtN);
	}
}
