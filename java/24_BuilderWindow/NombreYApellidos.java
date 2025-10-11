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

public class NombreYApellidos extends JFrame {

	private static final long serialVersionUID = 1L; //constante
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblNombreYApellidos;
	private JTextField txtNombreYApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NombreYApellidos frame = new NombreYApellidos();
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
	public NombreYApellidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(23, 28, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 25, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(23, 64, 46, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(120, 61, 86, 20);
		contentPane.add(txtApellido);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellidos = txtApellido.getText();
				
				txtNombreYApellidos.setText(nombre + " " + apellidos);
			}
		});
		btnEnviar.setBounds(120, 113, 86, 23);
		contentPane.add(btnEnviar);
		
		lblNombreYApellidos = new JLabel("Nombre y Apellidos");
		lblNombreYApellidos.setBounds(23, 209, 106, 14);
		contentPane.add(lblNombreYApellidos);
		
		txtNombreYApellidos = new JTextField();
		txtNombreYApellidos.setColumns(10);
		txtNombreYApellidos.setBounds(139, 206, 201, 20);
		contentPane.add(txtNombreYApellidos);
	}
}