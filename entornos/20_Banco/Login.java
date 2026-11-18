import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passwordField;
	//Constante
	private static final String USER = "Ivan";
	private static final String PASSWORD = "1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUser.setBounds(47, 27, 69, 34);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(47, 83, 105, 14);
		contentPane.add(lblPassword);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUser.setBounds(188, 34, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(188, 80, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUser.getText();
				String contrasena = passwordField.getText();
				
				if(usuario.equalsIgnoreCase(USER) && contrasena.equals(PASSWORD)) {
					//JOptionPane.showMessageDialog(null, "Has iniciado sesión", "Login", 1);
					setVisible(false);
					Principal window = new Principal();
					window.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Login", 0);
				}
			}
		});
		btnSubmit.setBounds(212, 131, 65, 23);
		contentPane.add(btnSubmit);
	}
}
