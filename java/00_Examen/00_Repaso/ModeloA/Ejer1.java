package ModeloA;

import java.util.Scanner;

public class Ejer1 {

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
		
		
		System.out.println("Que epoca del año deseas comprobar: ");
		String epoca = sc.nextLine();
		
		if(epoca.equals("verano")) {
			System.out.println("LA EPOCA EMPIEZA EN VERANO");
		} else if(epoca.equals("invierno")) {
			System.out.println("LA EPOCA EMPIEZA EN INVIERNO");
		} else if(epoca.equals("otoño")) {
			System.out.println("LA EPOCA EMPIEZA EN OTOÑO");
		} else if(epoca.equals("primavera")) {
			System.out.println("LA EPOCA EMPIEZA EN PRIMAVERA");
		} else {
			System.err.println("MAL PUESTO MAYI");
		}
	

	}

}
