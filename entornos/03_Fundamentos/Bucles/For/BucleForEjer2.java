import java.util.Scanner;

public class BucleForEjer2 {

	public static void main(String[] args) {
		// Programa que solicita por teclado un número
		// y indica si este es primo o no lo es.

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
	    System.out.print("Introduce un numero: ");
	    numero = sc.nextInt();

	    if (numero <= 1) {
	        System.out.println(numero + " no es un numero primo.");
	    } else {
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.println(numero + " no es un numero primo.");
	                return;
	            }
	        }
	        System.out.println(numero + " es un numero primo.");
	    }
	    sc.close();
	}
}