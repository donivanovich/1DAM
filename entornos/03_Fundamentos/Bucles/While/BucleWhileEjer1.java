import java.util.Scanner;

public class BucleWhileEjer1 {

	public static void main(String[] args) {
		// Programa que pide por pantalla un número
		// y a continuación escribe la tabla de multiplicar de dicho número.
		// formato: 3 * 1 = 3
		
		Scanner teclado = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("Introduce un numero");
		int num = teclado.nextInt();
		
		while(i <= 10) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}
	}
}