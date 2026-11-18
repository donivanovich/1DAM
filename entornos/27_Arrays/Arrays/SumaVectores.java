package Arrays;

import java.util.Scanner;

public class SumaVectores {

	public static void main(String[] args) {
		//Realizar un programa que pida la carga de dos vectores numéricos
		//enteros de 4 elementos. Obtener la suma de los dos vectores,
		//dicho resultado guardarlo en un tercer vector del mismo tamaño.
		//Sumar componente a componente.
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int v1[] = new int[4];
		int v2[] = new int[4];
		int v3[] = new int[4];
		
		for(i=0; i<v1.length; i++) {
			System.out.println("Dame los numeros del primer vector ["+(i+1)+"]: ");
			v1[i] = sc.nextInt();
		}


		for(i=0; i<v1.length; i++) {
			System.out.println("Dame los numeros del segundo vector ["+(i+1)+"]: ");
			v2[i] = sc.nextInt();
		}
		
		for(i=0; i<v1.length; i++) {
			v3[i] = v1[i] + v2[i];
		}
		
		System.out.print("Tu vector es: ");
		for(i=0; i<v1.length; i++) {
			System.out.print(v3[i]);
		}
		
	}

}