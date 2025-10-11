package ExamenEntornosDesarrolloModeloC;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa en Java que solicite al usuario ingresar la estación
		 * del año (primavera, verano, otoño, invierno) y determine las fechas
		 * aproximadas de inicio y fin de esa estación.
		 * 
		 * Por ejemplo:
		 * 
		 * Primavera: del 20 de marzo al 20 de junio. Verano: del 21 de junio al 22 de
		 * septiembre. Otoño: del 23 de septiembre al 21 de diciembre. Invierno: del 22
		 * de diciembre al 19 de marzo. (1 punto)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame la estacion del año: ");
		String estacion = sc.next().toLowerCase();

		if (estacion.equals("primavera")) {
			System.out.println("Primavera: del 20 de marzo al 20 de junio.");
		} else if (estacion.equals("verano")) {
			System.out.println("Verano: del 21 de junio al 22 de septiembre.");
		} else if (estacion.equals("otoño")) {
			System.out.println("Otoño: del 23 de septiembre al 21 de diciembre.");
		} else if (estacion.equals("invierno")) {
			System.out.println("Invierno: del 22 de diciembre al 19 de marzo.");
		} else {
			System.err.println("Estacion del año incorrecta.");
		}
	}

}
