package ExamenEntornosDesarrollo;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado una cadena cualquiera, el programa
		 * debe imprimir la cadena en orden inverso, es decir al revés los espacios
		 * deben sustituirse por @.
		 * 
		 * Ejemplo: -----entrada--🡪hola soy paco ----salida----🡪 ocap@yos@aloh (2
		 * puntos)
		 */

		Scanner sc = new Scanner(System.in);

		String index = "";

		System.out.println("Dame la cadena: ");
		String cadena = sc.nextLine();

		cadena = cadena.replace(" ", "@");

		for (int i = cadena.length() - 1; i >= 0; i--) {
			index += cadena.charAt(i);
		}

		System.out.println(index);
	}

}
