package ExamenEntornosDesarrolloModeloB;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * Solicita el nombre de tu horóscopo e imprime por pantalla el rango de fechas
		 * al que pertenece.
		 * 
		 * Aries: 21 de marzo al 19 de abril. Tauro: 20 de abril al 20 de mayo. Géminis:
		 * 21 de mayo al 20 de junio.
		 * 
		 * Ejemplo entrada: ¿Cuál es su horóscopo? --&gt; Aries. Ejemplo salida: Tu
		 * cumpleaños es del 21 de marzo al 19 de Abril. (1 punto)
		 */
		Scanner sc = new Scanner(System.in);

		String cadena = "";

		System.out.println("¿Cuál es su horóscopo? --> ");
		cadena = sc.next().toLowerCase();

		if (cadena.contains("aries")) {
			System.out.println("Tu cumpleaños es del 21 de marzo al 19 de abril.");
		} else if (cadena.contains("tauro")) {
			System.out.println("Tu cumpleaños es del 20 de abril al 20 de mayo.");
		} else if (cadena.contains("geminis")) {
			System.out.println("Tu cumpleaños es del 21 de mayo al 20 de junio.");
		} else if (cadena.contains("cancer")) {
			System.out.println("Tu cumpleaños es del 21 de junio al 22 de julio.");
		} else if (cadena.contains("leo")) {
			System.out.println("Tu cumpleaños es del 23 de julio al 22 de agosto.");
		} else if (cadena.contains("virgo")) {
			System.out.println("Tu cumpleaños es del 23 de agosto al 22 de septiembre.");
		} else if (cadena.contains("libra")) {
			System.out.println("Tu cumpleaños es del 23 de septiembre al 22 de octubre.");
		} else if (cadena.contains("escorpio")) {
			System.out.println("Tu cumpleaños es del 23 de octubre al 21 de noviembre.");
		} else if (cadena.contains("sagitario")) {
			System.out.println("Tu cumpleaños es del 22 de noviembre al 21 de diciembre.");
		} else if (cadena.contains("capricornio")) {
			System.out.println("Tu cumpleaños es del 22 de diciembre al 19 de enero.");
		} else if (cadena.contains("acuario")) {
			System.out.println("Tu cumpleaños es del 20 de enero al 18 de febrero.");
		} else if (cadena.contains("piscis")) {
			System.out.println("Tu cumpleaños es del 19 de febrero al 20 de marzo.");
		} else {
			System.err.println("Lo siento, has introducido un horoscopo erroneo");
		}

	}

}
