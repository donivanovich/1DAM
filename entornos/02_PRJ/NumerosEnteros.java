import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos una variables
		float numero1 = 0;
		float numero2 = 0;
		float resultado = 0;
		float resultadoD = 0.0f;
		
		System.out.println("Introduce un numero");
		numero1 = teclado.nextFloat();
		System.out.println("Introduce otro numero");
		numero2 = teclado.nextFloat();
		
		//SUMA
		resultado = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + resultado);
        
		
		//RESTA
		resultado = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + resultado);
		
		//MULTIPLICACION
		resultado = numero1 * numero2;
		System.out.println("El resultado de la multiplicacion es: " + resultado);
		
		//DIVISION
		resultadoD = numero1 / numero2;
		System.out.println("El resultado de la division es: " + resultadoD);
	}

}