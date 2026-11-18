import java.util.Scanner;

public class FuncionesEjer3 {

	public static void main(String[] args) {
		// Crea una función que se llame mayor_num que recibe como parámetros
		// dos números de tipo entero y retorna el mayor de los dos.
		// En caso de que sean iguales retorna 0.
		
		Scanner sc = new Scanner(System.in);
		
        int num1;
        int num2;
        
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();       
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        int resultado = mayor_num(num1, num2);
        
        if (resultado == 0) {
            System.out.println("0");
        } else {
            System.out.println("El mayor de los dos numeros es: " + resultado);
        }
    }

    public static int mayor_num(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}