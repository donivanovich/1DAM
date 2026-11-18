import java.util.Scanner;

public class FuncionesEjer4 {

    public static void main(String[] args) {
    	// Programa que recibe por teclado un nif Ej:55555555K
    	// y envia un mensaje en caso de que el Nif no sea Correcto
    	// resto de la división ->  0    1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22
    	// código de control ->     T    R    W    A    G    M    Y    F    P    D    X     B     N     J     Z     S     Q     V     H     L     C     K     E
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un NIF para comprobar su validez (Ejemplo: 12345678A): ");
        String nif = sc.nextLine();

        if (esFormatoValido(nif)) {
            if (esNifValido(nif)) {
                System.out.println("El NIF es valido.");
            } else {
                System.err.println("El NIF no es valido.");
            }
        } else {
            System.out.println("Formato invalido, intenta de nuevo.");
        }

        sc.close();
    }

    public static boolean esFormatoValido(String nif) {
        if (nif.length() != 9) {
            return false;
        }

        for (int i = 0; i < 8; i++) {
            if (nif.charAt(i) < '0' || nif.charAt(i) > '9') {
                return false;
            }
        }

        char letra = nif.charAt(8);
        return (letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z');
    }

    public static boolean esNifValido(String nif) {
        int numeros = Integer.parseInt(nif.substring(0, 8));
        int division = numeros % 23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return Character.toUpperCase(nif.charAt(8)) == letras[division];
    }
}