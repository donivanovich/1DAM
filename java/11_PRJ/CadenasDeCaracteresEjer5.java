import java.util.Scanner;

public class CadenasDeCaracteresEjer5 {

	public static void main(String[] args) {
		// Ejercicio que a partir de una cadena dada, pone en Mayuscula la primera
		// letra detras de un Punto "." 
		// Ejemplo: En un lugar de la mancha. De...

		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String cadena = sc.nextLine();

        StringBuilder cadena2 = new StringBuilder(cadena);
        boolean mayuscula = false;
        for (int i = 0; i < cadena2.length(); i++) {
            char j = cadena2.charAt(i);
            if (j == '.') {
                mayuscula = true;
            } else if (mayuscula && Character.isLetter(j)) {
                cadena2.setCharAt(i, Character.toUpperCase(j));
                mayuscula = false;
            }
        }
        System.out.println("Esta es la respuesta de tu consulta: " + cadena2);
        sc.close();
    }
}