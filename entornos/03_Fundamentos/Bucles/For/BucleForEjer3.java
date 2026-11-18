import java.util.Scanner;

public class BucleForEjer3 {

	public static void main(String[] args) {
		// Solicite dos numeros (inicio y fin) e imprima por
		// pantalla la cantidad de numeros impares entre ellos
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, num1;
		int fin, num2;
		int i;
		
		System.out.println("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("Estos son los numeros impares entre " + num1 + " y " + num2 + ":");
			for(i = num1; i <= num2; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else if (num1 > num2) {
			System.out.println("Estos son los numeros impares entre " + num2 + " y " + num1 + ":");
			for(i = num2; i <= num1; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else if (num1 == num2) {
			if(num1 % 2 != 0) {
				System.out.println("Has puesto el mismo numero y es impar: " + num1);
			} else {
				System.out.println("Este rango no posee numeros impares");
			}
		}
	}
}
