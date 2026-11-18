import java.util.Scanner;

public class DobleBucleForEjer3 {

	public static void main(String[] args) {
		// Dibuja un medio triangulo que mida la altura que pedimos por teclado
		// Ejemplo : altura = 5
		//             * 
		//             *  *
		//             *  *  *
		//             *  *  *  *
		//             *  *  *  *  *

		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del medio triangulo: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
        sc.close();
    }
}