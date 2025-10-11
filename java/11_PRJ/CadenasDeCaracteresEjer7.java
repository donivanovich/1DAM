import java.util.Scanner;

public class CadenasDeCaracteresEjer7 {

	public static void main(String[] args) {
		// Cargar un String por teclado e implementar las siguientes funciones:     
		// a) Imprimir la primera mitad de los caracteres de la cadena.  
	    // b) Imprimir el último carácter.    
	    // c) Imprimirlo en forma inversa.    
	    // d) Imprimir cada carácter del String separado con un guión.    
	    // e) Imprimir la cantidad de vocales almacenadas.

		Scanner sc = new Scanner (System.in);	
		
		System.out.println("Ingresa una frase:");
		String txt = sc.nextLine();
		
		System.out.println("**************Bienvenido al menu de cadenas******************");
		System.out.println("_____________________________________________________________");
		System.out.println("|1. Imprimir la primera mitad de los caracteres de la cadena|");
		System.out.println("|2. Imprimir el ultimo caracter                             |");
		System.out.println("|3. Impromirlo en forma inversa                             |");
		System.out.println("|4. Imprimir cada caracter del String separado con un guion |");
		System.out.println("|5. Imprimir la cantidad de vocales almacenadas             |");
		System.out.println("|___________________________________________________________|");
		int opcion = sc.nextInt();
		
		switch (opcion) {			
			case 1:
				int mitad = txt.length() / 2;
		        System.out.println("Primera mitad de la cadena: " + txt.substring(0, mitad));
		        break;
			case 2:
				if (!txt.isEmpty()) {
		            System.out.println("Último carácter de la cadena: " + txt.charAt(txt.length() - 1));
		        }
				break;
			case 3:
				StringBuilder inverso = new StringBuilder(txt);
		        System.out.println("Cadena invertida: " + inverso.reverse().toString());
		        break;
			case 4:
				String guion = String.join("-", txt.split(""));
		        System.out.println("Cadena con guiones: " + guion);
		        break;
			case 5:
				int contador = 0;
		        for (int i = 0; i < txt.length(); i++) {
		            char c = Character.toLowerCase(txt.charAt(i));
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                contador++;
		            }
		        }
		        System.out.println("Cantidad de vocales: " + contador);
		        break;					
		}
	}
}