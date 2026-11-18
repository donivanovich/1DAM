package ExamenEntornosDesarrolloModeloA;

import java.util.Scanner;

public class Ej3 {

	public boolean esMagico(int num) {
		int sumaDigitos = 0;

		sumaDigitos += num % 10;
		num /= 10;

		return sumaDigitos % 3 == 0;
	}

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado de tres cifras, el número
		 * debe ser pasado como parámetro a un método en la misma Clase, que compruebe
		 * si es un número mágico. Esto quiere decir que sumadas sus cifras el número
		 * resultante sea múltiplo de 3. El método debe ser tal cual se os facilita a
		 * continuación.
		 * 
		 * public boolean esMagico(int num){.......}
		 * 
		 * Ejemplo entrada: Introduce un número: 531 Ejemplo salida: Sus cifras suman 9
		 * y es múltiplo de 3 por lo que es un número MÁGICO. (2 puntos)
		 */
		Scanner sc = new Scanner(System.in);
		Ej3 digito = new Ej3();

		int num;

		do {
			System.out.println("Dame un numero:");
			num = sc.nextInt();
		} while (num < 100 || num > 999);

		if (digito.esMagico(num)) {
			System.out.println("El numero " + num + " es magico");
		} else {
			System.out.println("El numero " + num + " no es magico");
		}
	}
}
