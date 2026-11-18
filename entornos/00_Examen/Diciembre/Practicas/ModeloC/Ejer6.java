package ModeloC;

import java.util.Random;
import java.util.Scanner;

public class Ejer6 {
	public static void juego(int opcMaquina) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un numero del 0 al 36: ");
		int opcion = sc.nextInt();
		
		opcMaquina = maquina();
		System.out.print("Tu: "+opcion);
		System.out.println();
		System.out.println("Maquina: " + opcMaquina);
		if(opcion == opcMaquina) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
	}
	
	public static int maquina() {
		Random random = new Random();
		return random.nextInt(37);
	}

	public static void main(String[] args) {
		/*
		 * Se desea implementar un juego de Ruleta en Java. Para ello necesitaremos
		 * una Clase Ruleta. (2 puntos) atributos: int maxNum = 36; métodos:  maquina()
		 * → Tira la ruleta de manera random juego(char opcMaquina) Solicita al usuario
		 * su opción: teclado.nextInt() El juego trata de comprobar si la opción
		 * seleccionada por el usuario y la de la máquina coinciden. imprime por
		 * pantalla el resultado de la máquina y del usuario para poder visualizar el
		 * resultado: mensajes: Enhorabuena has Ganado!!!!   Lo siento inténtalo de
		 * nuevo!!!
		 * 
		 * Ej: La máquina seleccionó : 0 La máquina seleccionó : 0      El usuario
		 * seleccionó: 0 El usuario seleccionó: 36 Enhorabuena has Ganado!!!! Lo siento
		 * mucho, has Perdido!!!!
		 */
		int opcMaquina = 0;
		juego(opcMaquina);
		
	}

}
