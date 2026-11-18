package Examen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Dame la frase: ");
		String frase = sc.nextLine().toLowerCase();
		System.out.println("Dame el caracter: ");
		char letra = sc.next().charAt(0);
		
		for(i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == letra){
				break;
			} else {
				System.out.print(frase.charAt(i));
			}
			
		}
	}

}
