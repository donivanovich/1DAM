import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingresar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIngreso;
	private JComboBox<String> comboBox;
	private JLabel lblTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingresar frame = new Ingresar();
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
	public Ingresar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Corriente", "Credito"}));
		comboBox.setBounds(27, 49, 120, 22);
		contentPane.add(comboBox);
		
		txtIngreso = new JTextField();
		txtIngreso.setBounds(27, 116, 86, 20);
		contentPane.add(txtIngreso);
		txtIngreso.setColumns(10);
		
		JLabel lblTotal = new JLabel("3000");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setForeground(new Color(0, 128, 128));
		lblTotal.setBounds(243, 110, 71, 28);
		contentPane.add(lblTotal);
		
		JButton btn = new JButton("Aceptar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = (String) comboBox.getSelectedItem();
				int cantidad = Integer.parseInt(txtIngreso.getText());
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
				txtIngreso.setText("");
			}
		});
		btn.setBounds(243, 166, 71, 23);
		contentPane.add(btn);
		
	}
}
