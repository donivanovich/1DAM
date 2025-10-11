import java.util.Scanner;

public class BucleForEjer1 {

	public static void main(String[] args) {
		// Programa que pide por pantalla un número
		// y a continuación escribe la tabla de multiplicar de
		// dicho número.
		// formato: 3 * 1 = 3

		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		System.out.println("Tabla de multiplicar del " + numero + ":");
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
		}
	}
}