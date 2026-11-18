import java.util.Scanner;

public class CadenasDeCaracteresEjer3 {

	public static void main(String[] args) {
		// Ingresar una palabra o texto por teclado y determinar si es o no una
		// palabra palíndromo. 
		// (Palabra que se lee de igual manera de adelante
		// hacia atrás, que de atrás hacia delante)

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una palabra palindromo (se lee igual de adelante hacia atras):");
		String palabra = sc.nextLine();
		
		int longitud = palabra.length() - 1;				
		for (int i = 0; i < longitud; i++) {
			System.out.println(palabra.charAt(i));
		}	
		System.out.println("===============");
		for (int j = longitud; j >= 0; j--) {
			System.out.println(palabra.charAt(j));
		}	
		for (int i = 0, j = longitud; i <= longitud / 2; i++, j--) {			 
			if (palabra.charAt(i) == palabra.charAt(j)) {
				System.out.println("Iguales: " + palabra.charAt(i) + " y " + palabra.charAt(j));
			} else {
				System.out.println("No iguales" + palabra.charAt(i) + " y " + palabra.charAt(j));
			}
		}
	}
}