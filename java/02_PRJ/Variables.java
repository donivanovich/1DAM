import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "";
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.next();
		
		System.out.println("Hola ¿Que tal estas " + nombre + "? ");
	}

}
