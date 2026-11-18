package ModeloA;

import java.util.Scanner;

public class Ejer4 {

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
		
		for(i=0; i<=5; i++) {
			for(l=0; l<=i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(i=0; i<=5; i++) {
			for(j=5; j>=i; j--) {
				System.out.print("  ");
			}
			for(l=0; l<=i; l++) {
				if(i==3 && l<=2 && l>=1 || i==2 && l==1 || i==4 && l>=1 && l<=3) {
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
		
		for(i=0; i<=6; i++) {
			for(l=0; l<=i; l++) {
				System.out.print("  ");
			}
			for(k=6; k>=i; k--) {
				System.out.print("* ");
			}
			for(j=6; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=0; i<=6; i++) {
			for(j=6; j>=i; j--) {
				System.out.print("  ");
			}
			for(k=0; k<=i; k++) {
				System.out.print("* ");
			}
			for(l=0; l<=i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
