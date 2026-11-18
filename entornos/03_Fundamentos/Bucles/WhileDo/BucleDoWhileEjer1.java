import java.util.Scanner;

public class BucleDoWhileEjer1 {

	public static void main(String[] args) {
		// Realizar un programa que acumule (sume) valores ingresados
		// por teclado hasta ingresar el 9999 (no sumar dicho valor,
		// indica que ha finalizado la carga).
		// Imprimir el valor acumulado
		// Informar si dicho valor es cero, mayor a cero o menor a cero

		Scanner teclado = new Scanner (System.in);
		int num = 0, suma = 0;
		
		do {
			suma += num; //suma = suma + suma
			System.out.println("Introduce un numero: [9999 para finalizar]");
			num = teclado.nextInt();
		}while(num != 9999);
		System.out.println("La suma total es: " + suma);
		
		if(suma > 0) {
			System.out.println("La suma total es mayor que cero");
		} else if(suma < 0) {
			System.out.println("La suma es menor que cero");
		} else {
			System.out.println("La suma es igual a 0");
		}
	}
}		