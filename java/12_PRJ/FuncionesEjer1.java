import java.util.Scanner;

public class FuncionesEjer1 {

	public static void main(String[] args) {
		// CALCULADORA: pedimos dos numeros por teclado y una operacion. Realizamos la operacion llamando a la funcion
		// suma, resta, multi, division, respectivamente.
		// Con clases: class Calculadora, con los 4 metodos

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Introduce la operacion (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = suma(num1, num2);
                break;
            case '-':
                resultado = resta(num1, num2);
                break;
            case '*':
                resultado = multi(num1, num2);
                break;
            case '/':
                resultado = division(num1, num2);
                break;
            default:
                System.out.println("Operacion no valida.");
                sc.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        sc.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
}