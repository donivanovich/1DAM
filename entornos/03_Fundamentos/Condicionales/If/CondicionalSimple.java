import java.util.Scanner;

public class CondicionalSimple {

	public static void main(String[] args) {
		// Ejercicio que pide por teclado la edad de un usuario
		// y imprime un mensaje si es mayor de edad o no
     
		int numero1 = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int numero11= (int)teclado.nextFloat();
		
		if(numero11 >=18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
	}
}