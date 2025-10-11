package Rep02Cadenas;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce texto: ");
		String texto = sc.nextLine();
		String texto2 = texto;

		
		
		String vocales = "aeiou";
		String vocalesMayus = vocales.toUpperCase();
		
		String textoNuevo = "";
		
		for(int i = 0; i < texto.length(); i++) {
			//opcion 1
			//String letra = texto.substring(i);
			//opcion 2
			//char caracter = texto.charAt(i);
			//String letra = String.valueOf(caracter);
			
			String letra = "";
			letra += texto.charAt(i);
			
			if(vocales.contains(letra)) {
				
				textoNuevo += letra.toUpperCase();
			} else {
				textoNuevo += letra;
			}
		}
		
		texto = texto.toUpperCase();
		System.out.println(texto);
		
		texto2 = texto2.replace('a', '@');
		System.out.println(texto2);
	}
}
