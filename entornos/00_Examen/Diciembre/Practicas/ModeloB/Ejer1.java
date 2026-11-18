package ModeloB;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/*
		 * Solicita el nombre de tu horóscopo e imprime por pantalla el rango de fechas
		 * al que pertenece. (1 punto)
		 * 
		 * Aries: 21 de marzo al 19 de abril. Tauro: 20 de abril al 20 de mayo. Géminis:
		 * 21 de mayo al 20 de junio. Ejemplo entrada: ¿Cuál es su horóscopo? --&gt;
		 * Aries. Ejemplo salida: Tu cumpleaños es del 21 de marzo al 19 de Abril.
		 */
		
		Scanner sc = new Scanner(System.in);
		String horoscopo;
		
		System.out.print("Dame el horoscopo: ");
		horoscopo = sc.next().toLowerCase();
		
		if(horoscopo.equals("aries")) {
			System.out.println("Aries: del 21 de marzo al 19 de abril.");
		} else if(horoscopo.equals("tauro")) {
			System.out.println("Tauro: del 20 de abril al 20 de mayo.");
		} else if(horoscopo.equals("geminis")) {
			System.out.println("Géminis: del 21 de mayo al 20 de junio.");
		} else if(horoscopo.equals("cancer")) {
			System.out.println("Cáncer: del 21 de junio al 22 de julio.");
		} else if(horoscopo.equals("leo")) {
			System.out.println("Leo: del 23 de julio al 22 de agosto.");
		} else if(horoscopo.equals("virgo")) {
			System.out.println("Virgo: del 23 de agosto al 22 de septiembre.");
		} else if(horoscopo.equals("libra")) {
			System.out.println("Libra: del 23 de septiembre al 22 de octubre.");
		} else if(horoscopo.equals("escorpio")) {
			System.out.println("Escorpio: del 23 de octubre al 21 de noviembre.");
		} else if(horoscopo.equals("sagitario")) {
			System.out.println("Sagitario: del 22 de noviembre al 21 de diciembre.");
		} else if(horoscopo.equals("capricornio")) {
			System.out.println("Capricornio: del 22 de diciembre al 19 de enero.");
		} else if(horoscopo.equals("acuario")) {
			System.out.println("Acuario: del 20 de enero al 18 de febrero.");
		} else if(horoscopo.equals("piscis")) {
			System.out.println("Piscis: del 19 de febrero al 20 de marzo.");
		} else {
			System.err.println("Te has equivocado chato");
		}

	}

}
