package ExamenEntornosDesarrolloModeloB;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Realiza mediante el uso de bucles una de las siguientes figuras que se
		 * muestran a continuación. NO PEDIMOS NADA POR TECLADO
		 * 
		 * ● System.out.println(“ * “); ● System.out.print(“ * “);
		 * 
		 * Es decir, es el bucle el que tendrá que pintar el gráfico a base de
		 * asteriscos. Cuadrado vacio (1punto) Piramide invertida (1.5 puntos) Piramide
		 * vacia (2 puntos)
		 */
		int i, j, k, l;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j >= 2 && j <= 4 && i == 3 || j >= 2 && j <= 4 && i == 2 || j >= 2 && j <= 4 && i == 4) {
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

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("* ");
			}
			for (l = 4; l >= i; l--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (k = 1; k <= i; k++) {
				if (k >= 2 && k < 3 && i == 2 || k >= 2 && k < 4 && i == 3 || k >= 2 && k < 5 && i == 4) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			for (l = 1; l <= i - 1; l++) {
				if (l == 1 && i == 3 || l >= 1 && l <= 2 && i == 4) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}

			System.out.println();
		}
	}

}
