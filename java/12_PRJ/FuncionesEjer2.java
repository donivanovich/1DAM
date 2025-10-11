import java.util.Scanner;

public class FuncionesEjer2 {

	public static void main(String[] args) {
		// Se pide por teclado una frase y una opción [(1) muestra mensaje normal, (2) muestra el mensaje como mensaje de error].
		// Necesitamos dos funciones que según la opción que elija el usuario muestre el mensaje de la forma pedida

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Selecciona una opcion: (1) Muestra mensaje normal, (2) Muestra mensaje como error: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            Mensaje(frase);
        } else if (opcion == 2) {
            Error(frase);
        } else {
            System.out.println("Opción no valida, por favor selecciona 1 o 2.");
        }

        sc.close();
    }

    public static void Mensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void Error(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}