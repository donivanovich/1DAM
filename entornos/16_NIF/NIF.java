import java.util.Scanner;

public class NIF {

	public static void main(String[] args) {
		// Programa que recibe por teclado un nif Ej:55555555K
		// y envia un mensaje en caso de que el Nif no sea Correcto
		// resto de la división ->    0    1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22
		// código de control ->       T    R    W    A    G    M    Y    F    P    D    X     B     N     J     Z     S     Q     V     H     L     C     K     E
		
		Scanner sc = new Scanner(System.in);
		
		String nif = "";
		String numeros = "";
		String letra = "";
		int division = 0;
		int valorletra;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		System.out.println("Introduce un NIF, para comprobar su validez. (Ejemplo: 1 2 3 4 5 6 7 8 A-Z)");
		nif = sc.nextLine();
		
		if(nif.length() == 9) {
			
			numeros = nif.substring(0, 8);
			letra = nif.substring(8);
		
			System.out.println("");
			System.out.println("Los numeros del NIF son: " + numeros);
			System.out.println("La letra del NIF es: " + letra.toUpperCase());
			
			division = Integer.parseInt(numeros) % 23;
			System.out.println("");
			
			if(letra.toUpperCase().equalsIgnoreCase(String.valueOf(letras[division]))) {
				System.out.println("El NIF es valido");
			} else {
				System.err.println("El NIF no es valido");
			}
			
		} else {
			System.out.println("Debes introducir un formato valido para comprobar");
		}
	}
}