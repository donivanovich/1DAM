import java.util.Scanner;

public class BucleWhileEjer2 {

	public static void main(String[] args) {
		//  Desarrollar un programa que permita la carga de 10 valores
		// por teclado y nos muestre posteriormente la suma de los
		// valores ingresados y su promedio.
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0, suma = 0, i = 0;
		
		while (i < 10) {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			suma = suma + num;
			i++;
		}
		System.out.println("La suma total es: " + suma);
		System.out.println("El promedio es: " + (suma/i));
	}
}