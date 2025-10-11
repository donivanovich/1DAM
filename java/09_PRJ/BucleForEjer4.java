import java.util.Scanner;

public class BucleForEjer4 {

	public static void main(String[] args) {
		// Dibuja un cuadrado en pantalla solo haciendo uso de: System.out.println("*");
		// System.out.print("*"); Ejemplo : * * * * * * * * *

		Scanner teclado = new Scanner(System.in);
		
	    System.out.print("Introduce el tamaño del cuadrado: ");
	    int tamaño = teclado.nextInt();
	    
	    for (int i = 0; i < tamaño; i++) {  
	    	for (int j = 0; j < tamaño; j++) {  
	    		System.out.print("* ");  
	    	}	    	
	    System.out.println();  
	    }
	    teclado.close();
	}
}