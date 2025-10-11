package Modelo;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado el número debe ser pasado
		 * como parámetro a una segunda clase a través de una función y verificar si el
		 * número es par o no lo es. El programa imprime una leyenda diciendo si el
		 * número es par o no lo es. (2 puntos) Public boolean esPar(Int num){}
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dame numero: ");
		int num = sc.nextInt();
		
		if(Par.esPar(num) == true) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}

	}

}
