package ExamenEntornosDesarrolloModeloA;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Solicita una frase y un carácter, escribir en pantalla la frase inicial pero
		 * sólo desde la primera aparición del carácter dado (sin incluirlo).
		 * 
		 * No se puede utilizar indexOf. (2 puntos)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un caracter:");
		char caracter = sc.next().charAt(0);

		System.out.println("Dame una frase:");
		String frase = sc.next();

		String fraseIndex = "";
		boolean encontrado = false;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == caracter && !encontrado) {
				encontrado = true;
			}

			if (encontrado) {
				fraseIndex += frase.charAt(i);
			}
		}

		if (encontrado) {
			System.out.println("Resultado: " + fraseIndex);
		} else {
			System.out.println("El caracter no se encontro en la frase.");
		}
	}
}