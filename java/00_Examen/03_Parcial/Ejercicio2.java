package examen;

import java.util.Scanner;

public class Ejercicio2 {
	
	private int matriz[][] = new int[4][4];

	public static void main(String[] args) {
		// Carga una matriz 4x4 de numeros enteros aleatorios entre 1 y 10. 
		// Luego soliciota un numero por teclado y buscar cuantas veces aparece en la matriz y su posicion
		Ejercicio2 obj = new Ejercicio2();
		
		obj.inicializarMatriz();
		obj.preguntarNumero();
	}
	
	public void inicializarMatriz() {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				int rng = (int) ((Math.random() * 10) + 1);
				matriz[i][j] = rng;
				
				if(matriz[i][j] < 10) {
					System.out.print(matriz[i][j] + "  ");
				} else {
					System.out.print(matriz[i][j] + " ");
				}
				
			}
			System.out.println();
		}
	}
	
	public void preguntarNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número a buscar: ");
		int index = sc.nextInt();
		int contador = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				if(matriz[i][j] == index) {
					contador++;
				}
			}
		}
		System.out.println();
		System.out.print("El número " + index + " aparece " + contador + " veces en las posiciones ");
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				if(matriz[i][j] == index) {
					contador--;
					if(contador == 0) {
						System.out.print("(" + i + ", " + j +")");
					} else {
						System.out.print("(" + i + ", " + j +"), ");
					}
				}
			}
		}
	}

}
