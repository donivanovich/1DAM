package Examen;

import java.util.Scanner;

public class Ejercicio5 {
	public boolean esMult7y5(int num) {
		if(num % 5 == 0 && num % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Ejercicio5 mult = new Ejercicio5();
		
		System.out.println("Dame un numero: ");
		int num = sc.nextInt();
		
		if(mult.esMult7y5(num) == true) {
			System.out.println("Tu numero: " + num + " es divisible entre 5 y 7");
		} else {
			System.err.println("Tu numero: " + num + " NO es divisible entre 5 y 7");
		}
	}

}
