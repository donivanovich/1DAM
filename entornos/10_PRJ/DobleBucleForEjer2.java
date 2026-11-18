import java.util.Scanner;

public class DobleBucleForEjer2 {

	public static void main(String[] args) {
		// Dibuja un cuadrado vacío
		// Ejemplo :
		//             * * * * *
		//             *       *
		//             *       *
		//             *       *
		//             * * * * *

		Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del cuadrado: ");
        int tamaño = sc.nextInt();
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {      
                if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        sc.close();
    }
}