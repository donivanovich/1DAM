import java.util.Scanner;

public class CadenasDeCaracteresEjer6 {

	public static void main(String[] args) {
		// Algoritmo que coloca las vocales delante y las consonantes
		// despues y elimina los espacios en blanco.
		 
		Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce una frase: ");
	    String cadena = sc.nextLine();
	    
	    StringBuilder vocales = new StringBuilder();
        StringBuilder consonantes = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
        	char j = cadena.charAt(i);
	            if (Character.isLetter(j)) {
	                if ("aeiouAEIOU".indexOf(j) != -1) {
	                    vocales.append(j);
	                } else {
	                    consonantes.append(j);
	                }
	            }
        }
        String resultado = vocales.toString() + consonantes.toString();
        System.out.println("Aqui esta tu consulta: " + resultado);
	    sc.close();
	}
}