import java.util.Scanner;

public class CondicionalAnidadoEjer1 {

	public static void main(String[] args) {
		// Confeccionar un programa que permita cargar un número entero positivo 
		// de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. 
		// Mostrar un mensaje de error si el número de cifras es mayor.
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		if (num < 1000) {
			if(num < 10) {
				System.out.println("El numero tiene una cifra");
			} else if(num < 100) {
				System.out.println("El numero tiene dos cifras");
			} else {
				System.out.println("El numero tiene tres cifras");
			}
		} else {
			System.err.println("ERROR: El numero tiene mas de tres cifras");
		}
	}
}

	


