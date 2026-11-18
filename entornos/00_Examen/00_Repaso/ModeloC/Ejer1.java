package ModeloC;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa en Java que solicite al usuario ingresar la estación
		 * del año (primavera, verano, otoño, invierno) y determine las fechas
		 * aproximadas de inicio y fin de esa estación. Por ejemplo: Primavera: del 20
		 * de marzo al 20 de junio. Verano: del 21 de junio al 22 de septiembre. Otoño:
		 * del 23 de septiembre al 21 de diciembre. Invierno: del 22 de diciembre al 19
		 * de marzo. (1 punto)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la estacion del año: ");
		String estacion = sc.next().toLowerCase();
		
		if(estacion.equals("primavera")) {
			System.out.println("Es primavera");
		} else if(estacion.equals("verano")) {
			System.out.println("Es verano");
		} else if(estacion.equals("invierno")) {
			System.out.println("Es invierno");
		} else if(estacion.equals("otoño")) {
			System.out.println("Es otoño");
		} else {
			System.err.println("Error, estacion incorrecta");
		}
	}

}
