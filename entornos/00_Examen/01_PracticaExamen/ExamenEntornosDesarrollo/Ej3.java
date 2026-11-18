package ExamenEntornosDesarrollo;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado el número debe ser pasado
		 * como parámetro a una segunda clase a través de una función y verificar si el
		 * número es par o no lo es. El programa imprime una leyenda diciendo si el
		 * número es par o no lo es. Public boolean esPar(Int num){} (2 puntos)
		 */

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Dame el numero: ");
		num = sc.nextInt();

		if (Par.esPar(num) == true) {
			System.out.println("El numero " + num + " es Par");
		} else {
			System.out.println("El numero " + num + " es Impar");
		}

	}

}
