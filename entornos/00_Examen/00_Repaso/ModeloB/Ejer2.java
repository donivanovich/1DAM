package ModeloB;

import java.util.Scanner;

public class Ejer2 {
	
	public boolean esBestial(int num) {
		
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
		 * continuación. (2 puntos)
		 * 
		 * public boolean esBestial(int num){.......}
		 * 
		 * Ejemplo entrada: Introduce un número: 549 Ejemplo salida: Sus cifras suman 18
		 * y es múltiplo de 6 por lo que es un número BESTIAL.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame numero: ");
		int num = sc.nextInt();
		
		Ejer2 randomizar = new Ejer2();
		
		if(randomizar.esBestial(num) == true) {
			System.out.println("El numero es Bestial");
		} else {
			System.out.println("El numero no es Bestial");
		}
	}

}
