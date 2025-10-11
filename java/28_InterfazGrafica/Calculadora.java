package InterfazGrafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JTextField txtSuma;
	private JTextField txtMayor;
	private JTextField txtMulti;
	private JTextField txtDividir;
	private JTextField txtMenor;
	private JTextField txtResta;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN1 = new JLabel("N1");
		lblN1.setBounds(10, 11, 46, 14);
		contentPane.add(lblN1);
		
		JLabel lblN2 = new JLabel("N2");
		lblN2.setBounds(10, 51, 46, 14);
		contentPane.add(lblN2);
		
		JLabel lblN3 = new JLabel("N3");
		lblN3.setBounds(10, 95, 46, 14);
		contentPane.add(lblN3);
		
		txtN1 = new JTextField();
		txtN1.setBounds(84, 8, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(84, 48, 86, 20);
		contentPane.add(txtN2);
		
		txtN3 = new JTextField();
		txtN3.setColumns(10);
		txtN3.setBounds(84, 92, 86, 20);
		contentPane.add(txtN3);
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setBounds(240, 11, 46, 14);
		contentPane.add(lblSuma);
		
		JLabel lblMayor = new JLabel("Mayor");
		lblMayor.setBounds(240, 231, 46, 14);
		contentPane.add(lblMayor);
		
		txtSuma = new JTextField();
		txtSuma.setBounds(338, 8, 86, 20);
		contentPane.add(txtSuma);
		txtSuma.setColumns(10);
		
		txtMayor = new JTextField();
		txtMayor.setColumns(10);
		txtMayor.setBounds(338, 228, 86, 20);
		contentPane.add(txtMayor);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int n3 = Integer.parseInt(txtN3.getText());
				
				int suma = n1 + n2 + n3;
				int resta = n1 - n2 - n3;
				int mult = n1 * n2 * n3;
				float div = 0;
				int mayor = n1;
				int menor = n1;
				
				if(n1 > n2 && n1 > n3) {
					mayor = n1;
				} else if(n2 > n1 && n2 > n3) {
					mayor = n2;
				} else if(n3 > n1 && n3 > n2) {
					mayor = n3;
				}
				
				if(n1 < n2 && n1 < n3) {
					menor = n1;
				} else if(n2 < n1 && n2 < n3) {
					menor = n2;
				} else if(n3 < n1 && n3 < n2) {
					menor = n3;
				}
				
				if(n1 != 0 && n2 != 0 && n3 != 0) {
					div = n1;
					div /= n2 / n3;
				} 
				
				txtSuma.setText(String.valueOf(suma));
				txtResta.setText(String.valueOf(resta));
				txtMulti.setText(String.valueOf(mult));
				txtDividir.setText(String.valueOf(div));
				txtMenor.setText(String.valueOf(menor));
				txtMayor.setText(String.valueOf(mayor));
				txtTotal.setText(n1 + ", " + n2 + ", " + n3);
			}
		});
		btn.setBounds(10, 227, 86, 23);
		contentPane.add(btn);
		
		JLabel lblMulti = new JLabel("Multip");
		lblMulti.setBounds(240, 95, 46, 14);
		contentPane.add(lblMulti);
		
		txtMulti = new JTextField();
		txtMulti.setColumns(10);
		txtMulti.setBounds(338, 92, 86, 20);
		contentPane.add(txtMulti);
		
		JLabel lblDividir = new JLabel("Dividir");
		lblDividir.setBounds(240, 144, 46, 14);
		contentPane.add(lblDividir);
		
		txtDividir = new JTextField();
		txtDividir.setColumns(10);
		txtDividir.setBounds(338, 141, 86, 20);
		contentPane.add(txtDividir);
		
		JLabel lblMenor = new JLabel("Menor");
		lblMenor.setBounds(240, 189, 46, 14);
		contentPane.add(lblMenor);
		
		txtMenor = new JTextField();
		txtMenor.setColumns(10);
		txtMenor.setBounds(338, 186, 86, 20);
		contentPane.add(txtMenor);
		
		JLabel lblResta = new JLabel("Resta");
		lblResta.setBounds(240, 51, 46, 14);
		contentPane.add(lblResta);
		
		txtResta = new JTextField();
		txtResta.setColumns(10);
		txtResta.setBounds(338, 48, 86, 20);
		contentPane.add(txtResta);
		
		JLabel lblN = new JLabel("N1, N2, N3");
		lblN.setBounds(10, 144, 64, 14);
		contentPane.add(lblN);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(84, 141, 86, 20);
		contentPane.add(txtTotal);
	}

}
