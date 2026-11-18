import java.util.Scanner;

public class BucleDoWhileEjer2 {

	public static void main(String[] args) {
		// Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando ingresamos el valor 0. Se debe informar:
		// a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
		// b) La cantidad total de piezas procesadas.
				
		Scanner teclado = new Scanner(System.in);
		float peso = 0;
		
		do {
			System.out.println("Introduce el peso: ");
			peso = teclado.nextFloat();
		}while (peso == 0);

	}

}