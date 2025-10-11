import java.util.Scanner;

public class DobleBucleForEjer1 {

	public static void main(String[] args) {
			//  Dibuja un cuadrado
			// Ejemplo :
			//	             * * * * *
			//	             * * * * *
			//               * * * * *
			//	             * * * * *
			//	             * * * * *
			
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