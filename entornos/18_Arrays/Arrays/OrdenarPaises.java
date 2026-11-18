package Arrays;

import java.util.Scanner;

public class OrdenarPaises {

	public static void main(String[] args) {
		// array de 5 donde se introduzca los nombre de paises y se ordene alfabeticamente
		
		Scanner sc = new Scanner(System.in);
		String paises[] = new String[5];
		
		
		for(int i=0; i<5; i++) {
			System.out.print("Dame pais N" + (i+1) + ": ");
			paises[i] = sc.nextLine().toLowerCase();
			System.out.println();
		}
		
		for(int i=0; i<paises.length-1; i++) {
			for(int j = 0; j< paises.length-1-i; j++) {
				if(paises[j].compareTo(paises[j+1]) > 0) {
					String aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = aux;
				}
			}
		}
		
		for(int i=0; i<paises.length; i++) {
			System.out.println(paises[i] + " | ");
		}
		
	}

}
