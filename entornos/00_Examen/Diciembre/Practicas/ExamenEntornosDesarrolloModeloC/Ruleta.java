package ExamenEntornosDesarrolloModeloC;

import java.util.Random;
import java.util.Scanner;

public class Ruleta {

	public void juego() {
		Scanner sc = new Scanner(System.in);

		int numMax = 36;
		int cpu = maquina();
		int jugador;

		do {
			System.out.println("Tira de la Ruleta (0-36): ");
			jugador = sc.nextInt();
		} while (jugador < 0 || jugador > 36);

		if (cpu <= numMax) {
			if (jugador == cpu) {
				System.out.println("Enhorabuena has Ganado!!!!");
			} else {
				System.out.println("Lo siento mucho, has Perdido!!!!");
			}

			System.out.println("Ruleta: " + cpu);
			System.out.println("Jugador: " + jugador);
		}
	}

	public static int maquina() {
		Random random = new Random();
		return random.nextInt(37);
	}

	public static void main(String[] args) {
		/*
		 * Se desea implementar un juego de Ruleta en Java. Para ello necesitaremos
		 * una Clase Ruleta.
		 * 
		 * atributos: int maxNum = 36;
		 * 
		 * métodos:  maquina() → Tira la ruleta de manera random juego(char opcMaquina)
		 * Solicita al usuario su opción: teclado.nextInt()
		 * 
		 * El juego trata de comprobar si la opción seleccionada por el usuario y la de
		 * la máquina coinciden.
		 * 
		 * imprime por pantalla el resultado de la máquina y del usuario para poder
		 * visualizar el resultado: Enhorabuena has Ganado!!!! Lo siento inténtalo de
		 * nuevo!!!
		 * 
		 * Ej: La máquina seleccionó : 0 La máquina seleccionó : 0      El usuario
		 * seleccionó: 0 El usuario seleccionó: 36 Enhorabuena has Ganado!!!! Lo siento
		 * mucho, has Perdido!!!! (2 puntos)
		 */

		Ruleta juego = new Ruleta();
		juego.juego();

	}

}
