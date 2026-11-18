package ExamenEntornosDesarrollo;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Realiza mediante el uso de bucles una de las siguientes figuras que se
		 * muestran a continuación. NO PEDIMOS NADA POR TECLADO System.out.println(“ *
		 * “); - System.out.print(“ * “); Es decir, es el bucle el que tendrá que pintar
		 * el gráfico a base de asteriscos. (2 puntos)
		 */

		int i, j, k, l;

		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (l = 1; l <= i - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i + 1; j++) {
				System.out.print(" ");
			}
			for (k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (l = 4; l >= i + 1; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (l = 1; l <= i - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= 2; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 3; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
