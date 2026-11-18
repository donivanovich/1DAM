import java.util.Scanner;

public class CadenasDeCaracteresEjer2 {

	public static void main(String[] args) {
		// Realizar la búsqueda de un string clave en un string fuente. 
		// Se deberá ingresar una frase o texto (fuente) y luego la clave a buscar.
		// En caso de encontrarla, imprimir la posición, de lo contrario una leyenda. 

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el texto fuente: ");
		String fuente = sc.nextLine();
		
		System.out.print("Ingrese el clave a busca: ");
		String clave = sc.nextLine();
		
		int index = fuente.indexOf(clave);
		
		if (index != -1) {
			System.out.println("La posicion es: " + index);
		} else {
			System.out.println("No se ha encontrado");
		}
	}
}