import java.util.Scanner;

public class CadenasDeCaracteresEjer8 {

	public static void main(String[] args) {
		// Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.
		// Por ejemplo si cargo: La mañana está fría.
		// Debe aparecer:
		// La
		// mañana
		// está
		// fría.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una oración:");
        String txt = sc.nextLine(); 
        
        String[] palabras = txt.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        sc.close();
   
	}
}		