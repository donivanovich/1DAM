package ExamenEntornosDesarrolloModeloA;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida la época del año y diga de qué fecha a qué fecha
		 * es.
		 * 
		 * Primavera 21 de Marzo Verano 21 de Junio Otoño 23 de Septiembre Invierno 22
		 * de Diciembre
		 * 
		 * Ejemplo entrada: ¿Cuál es la época? --&gt; Primavera. Ejemplo salida: La
		 * primavera inicia el 21 de Marzo hasta el 20 de Junio. (1 punto)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuál es la época? --> ");
		String epoca = sc.nextLine();

		String epocaM = epoca.toLowerCase();

		if (epocaM.equals("primavera")) {
			System.out.println("La primavera inicia el 20 de marzo hasta el 21 de junio.");
		} else if (epocaM.equals("verano")) {
			System.out.println("El verano inicia el 21 de junio hasta el 22 de septiembre.");
		} else if (epocaM.equals("invierno")) {
			System.out.println("El invierno inicia el 21 de diciembre hasta el 20 de marzo.");
		} else if (epocaM.equals("otoño")) {
			System.out.println("El otoño inicia el 22 de septiembre hasta el 21 de diciembre.");
		} else {
			System.err.println("Consulta incorrecta, vuelve a intentarlo");
		}

	}

}
