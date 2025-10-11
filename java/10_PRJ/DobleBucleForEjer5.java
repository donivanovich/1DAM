import java.util.Scanner;

public class DobleBucleForEjer5 {

	public static void main(String[] args) {
		// Dibuja un rombo que mida la altura que pedimos por teclado
		// Ejemplo :
		//		         * 
		//	          *  *  * 
		//	       *  *  *  *  * 
		//	    *  *  *  *  *  *  * 
		//   *  *  *  *  *  *  *  *  * 
		//	    *  *  *  *  *  *  * 
		//	       *  *  *  *  * 
		//	          *  *  * 
		//	             *
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del rombo: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
        	for (int j = 1; j <= altura - i; j++) {
        		System.out.print("   "); 
            }
            for(int k = 1; k <= (2 * i) - 1; k++) {
            	System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
        	for (int j = altura; j - i >= 1; j--) {
        		System.out.print("   ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();        	  
          }
          sc.close();
	}
}