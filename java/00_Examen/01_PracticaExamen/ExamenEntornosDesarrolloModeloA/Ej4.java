package ExamenEntornosDesarrolloModeloA;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Realiza mediante el uso de bucles una de las siguientes figuras que se
		 * muestran a continuación. NO PEDIMOS NADA POR TECLADO
		 * 
		 * ● System.out.println(“ * “); ● System.out.print(“ * “);
		 * 
		 * Es decir, es el bucle el que tendrá que pintar el gráfico a base de
		 * asteriscos.
		 * 
		 * Triangulo (1 punto) Triangulo vacio (1.5 puntos) Omnitrix (2 puntos)
		 */
		Scanner sc = new Scanner(System.in);

		int i, j, k, l, m, n;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (i = 1; i <= 6; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (k = 1; k <= i; k++) {
				if (i >= 3 && i <= 5 && k >= 2 && k <= 4 && i == 5 || i >= 3 && i <= 5 && k >= 2 && k <= 3 && i == 4
						|| i >= 3 && i <= 5 && k == 2 && i == 3) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (k = 4; k >= i; k--) {
				System.out.print("* ");
			}
			for (k = i; k <= 4; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		for (l = 1; l <= 4; l++) {
			for (m = 4; m >= l; m--) {
				System.out.print("  ");
			}
			for (n = 1; n <= l; n++) {
				System.out.print("* ");
			}
			for (n = 1; n <= l; n++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
