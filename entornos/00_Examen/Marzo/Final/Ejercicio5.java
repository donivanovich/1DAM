package Examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Ejercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIngresar;
	private JTextField txtRetirar;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setTitle("CAJERO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresar.setBounds(86, 110, 89, 31);
		contentPane.add(lblIngresar);
		
		txtIngresar = new JTextField();
		txtIngresar.setBounds(55, 152, 120, 20);
		contentPane.add(txtIngresar);
		txtIngresar.setColumns(10);
		
		JButton btnIngresar = new JButton("Aceptar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidad = Integer.parseInt(txtIngresar.getText());
				int total = Integer.parseInt(txtTotal.getText());
				
				int retirada = cantidad + total;
				
				cambiarColor(retirada);
				
				txtTotal.setText(String.valueOf(retirada));
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnIngresar.setBounds(55, 183, 120, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblRetirar = new JLabel("Retirar");
		lblRetirar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRetirar.setBounds(442, 117, 80, 21);
		contentPane.add(lblRetirar);
		
		txtRetirar = new JTextField();
		txtRetirar.setBounds(402, 152, 120, 20);
		contentPane.add(txtRetirar);
		txtRetirar.setColumns(10);
		
		JButton btnRetirar = new JButton("Aceptar");
		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidad = Integer.parseInt(txtRetirar.getText());
				int total = Integer.parseInt(txtTotal.getText());
				
				int retirada = total- cantidad;
				
				cambiarColor(retirada);
				
				txtTotal.setText(String.valueOf(retirada));
			}
		});
		btnRetirar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRetirar.setBounds(402, 184, 120, 23);
		contentPane.add(btnRetirar);
		
		JLabel lblImporte = new JLabel("Importe");
		lblImporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblImporte.setBounds(28, 29, 80, 20);
		contentPane.add(lblImporte);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(new Color(255, 255, 255));
		txtTotal.setForeground(Color.blue);
		txtTotal.setText("4000");
		txtTotal.setBounds(118, 31, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
	}
	
	public void cambiarColor(int retirada) {
		Color color = Color.WHITE;
		if(retirada < 1000) {
			color = Color.red;
		} else {
			color = Color.blue;
		}
		
		txtTotal.setForeground(color);
	}
}