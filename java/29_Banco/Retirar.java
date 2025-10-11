import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Retirar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRetirada;
	private JComboBox<String> comboBox;
	private JLabel lblTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retirar frame = new Retirar();
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
	public Retirar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Corriente", "Credito"}));
		comboBox.setBounds(29, 11, 87, 22);
		contentPane.add(comboBox);
		
		txtRetirada = new JTextField();
		txtRetirada.setBounds(30, 96, 86, 20);
		contentPane.add(txtRetirada);
		txtRetirada.setColumns(10);
		
		JLabel lblTotal = new JLabel("3000");
		lblTotal.setForeground(new Color(255, 128, 128));
		lblTotal.setBounds(260, 99, 46, 14);
		contentPane.add(lblTotal);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = (String) comboBox.getSelectedItem();
				int cantidad = Integer.parseInt(txtRetirada.getText());
				int total = Integer.parseInt(lblTotal.getText());
				if(cuenta.equals("Corriente")){
					if(cantidad > 150) {
						JOptionPane.showMessageDialog(null, "Cantidad Maxima Alcanzada", "Error", 0);
					} else {
						total += cantidad;
						lblTotal.setText(String.valueOf(total));
					}
				} else if(cuenta.equals("Credito")){
					if(cantidad > 300) {
						JOptionPane.showMessageDialog(null, "Cantidad Maxima Alcanzada", "Error", 0);
					} else {
						total += cantidad;
						lblTotal.setText(String.valueOf(total));
					}
				}
				txtRetirada.setText("");
			}
		});
		btnNewButton.setBounds(236, 155, 89, 23);
		contentPane.add(btnNewButton);
	}
}
