import java.util.Scanner;

public class CadenasDeCaracteresEjer4 {

	public static void main(String[] args) {
		// Programa que pide una cadena y sustituye las "a" por "@";

		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String cadena = sc.nextLine();

        String cadena2 = cadena.replace('a', '@').replace('A', '@');
        System.out.println("El resultado de tu consulta es: " + cadena2);
        sc.close();
    }
}