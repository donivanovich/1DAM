package Modelo;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado una cadena cualquiera, el programa
		 * debe imprimir la cadena en orden inverso, es decir al revés los espacios
		 * deben sustituirse por @. (2 puntos) Ejemplo: -----entrada--🡪hola soy paco
		 * ----salida----🡪 ocap@yos@aloh
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		String c2 = "";
		
		System.out.println("Dame cadena: ");
		String c = sc.nextLine();
		
		for(i=c.length()-1; i>=0; i--) {
			if(c.charAt(i) == ' ') {
				c2 += '@';
			} else {
				c2+= c.charAt(i);
			}
		}
		System.out.println(c2);

	}

}
