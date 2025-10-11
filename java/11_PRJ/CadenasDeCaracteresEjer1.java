import java.util.Scanner;

public class CadenasDeCaracteresEjer1 {

	public static void main(String[] args) {
		// Solicitar al usuario que ingrese una cadena de texto.
		// El programa debe seguir solicitando cadenas al usuario en un bucle indefinido.
		// El bucle debe finalizar cuando el usuario ingrese la palabra "Fin", sin importar si las letras están en mayúsculas o minúsculas.

		Scanner sc = new Scanner(System.in);
		String cadena = "";
		
		do {
			System.out.println("Ingresa una frase (cuando quieras finalizar escribe fin): ");
			cadena = sc.next();
		} while (!cadena.equalsIgnoreCase("Fin"));	
		System.out.println("Fin");	
	}
}