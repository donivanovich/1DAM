package ModeloC;

import java.util.Scanner;

public class Ejer2 {
	public boolean esBestial(int num){
		
		int n1, n2, n3, suma;
		
		String n = String.valueOf(num);
		
		n1 = n.charAt(0);
		n2 = n.charAt(1);
		n3 = n.charAt(2);
		suma = n1+n2+n3;
		
		if(suma % 6 == 0) {
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
		 * continuación. (2 puntos) public boolean esBestial(int num){.......}
		 * 
		 * Ejemplo entrada: Introduce un número: 549 Ejemplo salida: Sus cifras suman 18
		 * y es múltiplo de 6 por lo que es un número BESTIAL.
		 */
		
		Scanner sc = new Scanner(System.in);
		Ejer2 bestial = new Ejer2();
		
		System.out.print("Dame el numero de 3 cifras: ");
		int num = sc.nextInt();
		
		if(bestial.esBestial(num) == true) {
			System.out.println("Es Bestial");
		} else {
			System.out.println("No es Bestial");
		}
	}

}
