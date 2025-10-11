import java.util.Scanner;

public class FuncionesEjer5 {

    public static void main(String[] args) {
        // Función que recibe una String y pinta una cabecera del tipo
        // **************
        // ***Cabecera***
        // **************

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        imprimirCabecera(cadena);
    }

    public static void imprimirCabecera(String cadena) {
        int longitud = cadena.length() + 6;

        for (int i = 0; i < longitud; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("***" + cadena + "***");

        for (int i = 0; i < longitud; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}