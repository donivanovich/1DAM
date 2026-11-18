package ModeloA;

import java.util.Scanner;

public class Ejer3 {
	
	public static boolean esMagico(int num) {
		
		int n1, n2, n3, suma;
		String cad = String.valueOf(num);
		
		n1 = cad.charAt(0);
		n2 = cad.charAt(1);
		n3 = cad.charAt(2);
		
		suma = n1 + n2 + n3;
		
		if(suma % 3 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado de tres cifras, el número
		 * debe ser pasado como parámetro a un método en la misma Clase, que compruebe
		 * si es un número mágico. Esto quiere decir que sumadas sus cifras el número
		 * resultante sea múltiplo de 3. El método debe ser tal cual se os facilita a
		 * continuación.
		 * 
		 * public boolean esMagico(int num){.......}
		 * 
		 * Ejemplo entrada: Introduce un número: 531 Ejemplo salida: Sus cifras suman 9
		 * y es múltiplo de 3 por lo que es un número MÁGICO. (2 puntos)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el numero de 3 cifras: ");
		int num = sc.nextInt();
		
		if(esMagico(num) == true) {
			System.out.println("Es magico");
		} else {
			System.out.println("No es magico");
		}
	}

}
