package ExamenEntornosDesarrolloModeloC;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Solicita una frase y un carácter, escribir en pantalla la frase inicial pero
		 * sólo hasta la primera aparición del carácter dado (sin incluirlo). No se
		 * puede utilizar indexOf. (2 puntos)
		 */
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Dame la cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Dame el caracter: ");
        char c = sc.next().charAt(0);

        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c) {
                break;
            }
            resultado += cadena.charAt(i);
        }

        if (resultado.length() == cadena.length()) {
            System.out.println("El caracter no pertenece a la cadena");
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
}
