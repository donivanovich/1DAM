package ArraysParalelos;

import java.util.Scanner;

public class PaisesHabitantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String paises[] = new String[5];
		int habitantes[] = new int[5];
		
		
		for(int i=0; i<5; i++) {
			System.out.print("Dame pais N" + (i+1) + ": ");
			paises[i] = sc.next().toLowerCase();
			sc.nextLine();
			System.out.print("Introduce habitantes N" + (i+1) + ": ");
			habitantes[i] = sc.nextInt();
		}
		
		for(int i=0; i<paises.length-1; i++) {
			for(int j = 0; j< paises.length-1-i; j++) {
				if(paises[j].compareTo(paises[j+1]) > 0) {
					String aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = aux;
					
					int aux2 = habitantes[j];
					habitantes[j] = habitantes[j+1];
					habitantes[j+1] = aux2;
				}
			}
		}
		
		for(int i=0; i<paises.length; i++) {
			System.out.print(paises[i] + " | ");
		}
		sc.nextLine();
		for(int i=0; i<paises.length; i++) {
			System.out.print(habitantes[i] + " | ");
		}
	}

}
