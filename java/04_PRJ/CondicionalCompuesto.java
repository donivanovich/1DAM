import java.util.Scanner;

public class CondicionalCompuesto {

	public static void main(String[] args) {
		// Se ingresan tres notas de un alumno, si el promedio es mayor o igual
		// a cinco y igual a 10 mostrar un mensaje "Aprobado con matricula"
		// Si no, si es solo mayor de 5 mostrar "Aprobado" y si no "Suspenso"
		
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int nota = 0;
		
		System.out.print("Introduce tu nota: ");
		num = teclado.nextInt();
		
		System.out.print("Introduce otra nota: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce la ultima nota: ");
		num2 = teclado.nextInt();
		
		nota = (num + num1 + num2)/3;
		
		if (nota <= 4) {
			System.err.println("Lo siento has suspendido");
		} if (nota >= 5 && nota <= 9) {
			System.out.println("Enhorabuena, has aprobado");
		} if (nota == 10) {
			System.out.println("Menudo crack, por poco rompes el limite");	
		}
	}	
}