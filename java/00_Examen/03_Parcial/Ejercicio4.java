package examen;

import java.util.Scanner;

public class Ejercicio4 {
	
	private char matriz[][] = new char[4][4];
	private int simbolo = 0;

	public static void main(String[] args) {
		// Programa que crea una matriz de 4x4. Se pide la siguiente funcionalidad
		// Dadas dos fichas X y O se pide que se implemente el metodo que coloca la ficha de manera correcta en la posicion correcta
		// Pista: Puedes usar Break para salir del bucle
		// Al usuario se le pide una columna por teclado y la ficha se coloca en la primera posicion libre de esa columna
		Ejercicio4 obj = new Ejercicio4();
		Scanner sc = new Scanner(System.in);
		int salir = 2;
		
		obj.inicializarMapa();
		do {
			obj.pedirFicha();
			obj.pintarMatriz();
			
			System.out.println("Deseas salir? (1. Si | 2. No): ");
			do {
				salir = sc.nextInt();
			} while(salir < 1 || salir > 2);
			
		} while(salir == 2);
			
		
	}
	
	public void inicializarMapa() {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				matriz[i][j] = ' ';
			}
		}
	}
	
	public void pedirFicha() {
		Scanner sc = new Scanner(System.in);
		int columna = 1;
		
		System.out.print("Ingresa columna (1-4): ");
		
		do {
			columna = sc.nextInt();
		} while(columna < 1 || columna > 4);
		columna--;
		
		for(int j= matriz.length - 1; j >= 0; j--) {
			if(matriz[j][columna] == ' ' && simbolo == 0) {
				matriz[j][columna] = 'X';
				simbolo = 1;
				break;
			}
			
			if(matriz[j][columna] == ' ' && simbolo == 1) {
				matriz[j][columna] = 'O';
				simbolo = 0;
				break;
			}
		}
	}
	
	public void pintarMatriz() {
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
	}
	

}
