package HundirLaFlota;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char mapa[] = new char[10];
		int i, intento, vidas = 2;
		int aleatorio = (int) (Math.random() * 10);
		boolean barcoHundido = false;
		
		mapa[aleatorio] = 'V';
		
		do {
			System.out.print("Introduce un numero del 0 al 9 para lanzar misil: ");
			intento = sc.nextInt();
			
			if(mapa[intento] == 'V') {
				System.out.println("¡Has golpeado al barco, enhorabuena has ganado!");
				vidas = -1;
				barcoHundido = true;
			} else {
				System.err.println("[Objetivo no alcanzado, intenta de nuevo]");
				mapa[intento] = 'X';
				vidas--;
			}
			System.out.println();
			for(i=0;i<10; i++) {
				if(i==9) {
					if(mapa[i] != 'X' && mapa[i] != 'V') {
						System.out.print("[ ]");
					} else {
						System.out.print("[" + mapa[i] + "]");
					}
				} else {
					if(mapa[i] != 'X' && mapa[i] != 'V') {
						System.out.print("[ ]-");
					} else {
						System.out.print("[" +mapa[i] + "]-");
					}
				}
			}
			System.out.println();
		} while(vidas > 0);
		
		if(vidas == 0) {
			System.err.println("**************************");
			System.err.println("*Te has quedado sin vidas*");
			System.err.println("**************************");
			System.err.println();
		}
	}
}
