package ModeloC;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*
		 * Solicita una frase y un carácter, escribir en pantalla la frase inicial pero
		 * sólo hasta la primera aparición del carácter dado (sin incluirlo). No se
		 * puede utilizar indexOf. (2 puntos)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Dame frase: ");
		String frase = sc.next().toLowerCase();
		System.out.println("Dame letra: ");
		char letra = sc.next().charAt(0);
		
		for(i=0; i<=frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				break;
			}
			System.out.print(frase.charAt(i));
		}

	}

}
