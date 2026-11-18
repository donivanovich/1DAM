package ExamenEntornosDesarrolloModeloA;

import java.util.Random;
import java.util.Scanner;

public class Juego {

	public static int maquina() {
		Random random = new Random();
		return random.nextInt(3);
	}

	public void juego() {
		Scanner sc = new Scanner(System.in);

		char opcion, cpu = ' ';
		int quiniela = maquina();

		do {
			System.out.println("Juega con (1, X, 2): ");
			opcion = sc.next().charAt(0);
		} while (opcion != '1' && opcion != 'X' && opcion != '2');

		if (quiniela == 0) {
			cpu = '1';
		} else if (quiniela == 1) {
			cpu = 'X';
		} else if (quiniela == 2) {
			cpu = '2';
		}

		if (cpu == opcion) {
			System.out.println("Enhorabuena has Ganado!!!!");
		} else {
			System.out.println("Lo siento mucho, has Perdido!!!!");
		}

		System.out.println("Quiniela: " + cpu);
		System.out.println("Jugador: " + opcion);
	}

	public static void main(String[] args) {
		/*
		 * Se desea implementar un juego de Quiniela en Java. Para ello necesitaremos
		 * una Clase Juego.
		 * 
		 * atributos: char opcion (1,X,2)
		 * 
		 * métodos:  maquina() → Tira la máquina de manera random juego(char opcMaquina)
		 * Solicita al usuario su opción: teclado.next().charAt(0) 
		 * 
		 * El juego trata de comprobar si la opción seleccionada por el usuario y la de
		 * la máquina coinciden. imprime por pantalla el resultado de la máquina y del
		 * usuario para poder visualizar el resultado: mensajes: Enhorabuena has
		 * Ganado!!!!   Lo siento inténtalo de nuevo!!!
		 * 
		 * Ej: La máquina seleccionó : X La máquina seleccionó : 1      El usuario
		 * seleccionó: X El usuario seleccionó: X Enhorabuena has Ganado!!!! Lo siento
		 * mucho, has Perdido!!!! (2 puntos)
		 */

		Juego juego = new Juego();
		juego.juego();

	}

}
