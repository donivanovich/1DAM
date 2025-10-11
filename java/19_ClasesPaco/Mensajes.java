package Clases;

import javax.swing.JOptionPane;

public class Mensajes {
	public void mensaje(String msg) {
		System.out.println(msg);
	}
	public void mensaje_rojo(String msg) {
		System.err.println(msg);
	}
	public void mensaje_info(String msg) {
		int tipo = 1;
		JOptionPane.showMessageDialog(null, msg, "Info", 1);
	}
}
