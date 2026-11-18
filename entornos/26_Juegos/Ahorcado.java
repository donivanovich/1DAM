package Ahorcado;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char palabra[] = new char[25];
		char resultado[] = new char[25];
		char letra;
		int i;
		boolean palabraAdivinada;
		boolean letraAdivinada;
		
		System.out.print("Introduce la palabra a adivinar: ");
		String a = sc.nextLine().toLowerCase();
		palabra = a.toCharArray();
		
		do { 
			palabraAdivinada = false;
			
			System.out.println();
			System.out.print("Introduce la letra: ");
			letra = sc.next().toLowerCase().charAt(0);
			letraAdivinada = false;
			
			for(i=0; i<palabra.length; i++) {
				if(letra == palabra[i]) {
					resultado[i] = letra;
					letraAdivinada = true;
				}
			}
			
			System.out.print("---> ");
			
			for (i = 0; i < palabra.length; i++) {
			    if (resultado[i] != palabra[i]) {
			        System.out.print("-");
			    } else {
			        System.out.print(resultado[i]);
			    }
			}
			System.out.println();
			
			
			for(i=0; i<palabra.length; i++) {
				palabraAdivinada = true;
				if(palabra[i] != resultado[i]) {
					palabraAdivinada = false;
					break;
				} 
			}
			
		} while(palabraAdivinada == false);
		
		System.out.println();
		System.err.println("[Enhorabuena has ganado]");
	}

}