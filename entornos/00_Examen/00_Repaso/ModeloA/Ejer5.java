package ModeloA;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*
		 * Solicita una frase y un carácter, escribir en pantalla la frase inicial pero
		 * sólo desde la primera aparición del carácter dado (sin incluirlo).
		 * 
		 * No se puede utilizar indexOf. (2 puntos)
		 */
		
		Scanner sc = new Scanner(System.in);
		int i, longitud = 0;
		char caracter;
		String frase;
		System.out.println("Dame la frase: ");
		frase = sc.nextLine();
		System.out.println("Dame el caracter: ");
		caracter = sc.next().charAt(0);
		
		for(i=0;i<frase.length();i++) {
			if(frase.charAt(i)==caracter) {
				longitud = i;
			}
		}
		
		for(i=longitud+1;i<frase.length();i++) {
			System.out.print(frase.charAt(i));
		}
	}

}
