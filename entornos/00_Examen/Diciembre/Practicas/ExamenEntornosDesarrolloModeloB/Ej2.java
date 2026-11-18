package ExamenEntornosDesarrolloModeloB;

import java.util.Scanner;

public class Ej2 {

	public static boolean esBestial(int num1, int num2, int num3, int cifras) {
		cifras = num1 + num2 + num3;
		if (cifras % 6 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado de tres cifras, el número
		 * debe ser pasado como parámetro a un método en la misma Clase, que compruebe
		 * si es un número bestial. Esto quiere decir que sumadas sus cifras el número
		 * resultante sea múltiplo de 6. El método debe ser tal cual se os facilita a
		 * continuación.
		 * 
		 * public boolean esBestial(int num){.......}
		 * 
		 * Ejemplo entrada: Introduce un número: 549 Ejemplo salida: Sus cifras suman 18
		 * y es múltiplo de 6 por lo que es un número BESTIAL. (2 puntos)
		 */

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, cifras = 0;

		System.out.println("Dame el numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Dame el numero 2: ");
		num2 = sc.nextInt();
		System.out.println("Dame el numero 3: ");
		num3 = sc.nextInt();

		cifras = num1 + num2 + num3;

		if (esBestial(num1, num2, num3, cifras) == true) {
			System.out.println("Sus cifras suman " + cifras + " y es multiplo de 6 por lo que es un numero BESTIAL.");
		} else {
			System.out.println("Sus cifras suman " + cifras + " y NO es multiplo de 6 por lo que NO ES BESTIAL.");
		}

	}

}
