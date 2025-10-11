package ExamenEntornosDesarrolloModeloB;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Solicita una frase y un carácter, escribir en pantalla la frase inicial pero
		 * sólo hasta la primera aparición del carácter dado (sin incluirlo). No se
		 * puede utilizar indexOf. (2 puntos)
		 */

		Scanner sc = new Scanner(System.in);
		
		boolean encontrado = false;
		
		System.out.println("Dame la cadena: ");
		String cadena = sc.next();
		
		System.out.println("Dame el caracter: ");
		char caracter = sc.next().charAt(0);
		
		String resultado = "";
		
		for(int i=0; i< cadena.length(); i++) {
			if(cadena.charAt(i) == caracter && encontrado == false) {
				encontrado = true;
				break;
			} else {
				resultado += cadena.charAt(i);
			}
		}
		
		if(encontrado = true) {
			System.out.println("Resultado: " + resultado);
		} else {
			System.out.println("Caracter no pertenece a la cadena");
		}
	}
}
