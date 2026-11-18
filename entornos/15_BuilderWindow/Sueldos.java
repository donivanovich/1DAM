package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Sueldos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtSueldo;
	private JTextField txtComision;
	private JLabel lblNyA;
	private JTextField txtNyA;
	private JLabel lblSalario;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sueldos frame = new Sueldos();
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
	public Sueldos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 118, 25);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 47, 118, 25);
		contentPane.add(lblApellidos);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setBounds(10, 86, 118, 25);
		contentPane.add(lblSueldo);
		
		JLabel lblComision = new JLabel("Comision");
		lblComision.setBounds(10, 125, 118, 25);
		contentPane.add(lblComision);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(158, 13, 206, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(158, 49, 206, 20);
		contentPane.add(txtApellidos);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(158, 88, 206, 20);
		contentPane.add(txtSueldo);
		
		txtComision = new JTextField();
		txtComision.setColumns(10);
		txtComision.setBounds(158, 127, 206, 20);
		contentPane.add(txtComision);
		
		lblNyA = new JLabel("Nombre y Apellidos");
		lblNyA.setBounds(10, 281, 118, 25);
		contentPane.add(lblNyA);
		
		txtNyA = new JTextField();
		txtNyA.setColumns(10);
		txtNyA.setBounds(158, 283, 206, 20);
		contentPane.add(txtNyA);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sueldo = Float.parseFloat(txtSueldo.getText());
				float comision = Float.parseFloat(txtComision.getText());
				float salario = sueldo + comision;
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				
				txtSalario.setText(String.format("%.2f", salario));
				if(salario < 1200) {
					txtSalario.setForeground(Color.WHITE); 
	                txtSalario.setBackground(Color.RED);
				} else {
					txtSalario.setForeground(Color.WHITE);
	                txtSalario.setBackground(Color.GREEN);
				}
				
				txtNyA.setText(nombre + " " + apellidos);
			}
		});
		btn.setBounds(275, 202, 89, 23);
		contentPane.add(btn);
		
		lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 334, 118, 25);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(158, 336, 206, 20);
		contentPane.add(txtSalario);
	}
}
