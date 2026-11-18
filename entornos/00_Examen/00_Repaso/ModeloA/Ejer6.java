package ModeloA;

import java.util.Random;
import java.util.Scanner;

public class Ejer6 {
	public static void juego(char opcMaquina) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce: 1-X-2");
		char opcion = sc.next().charAt(0);
				
		int random = maquina();
		if(random == 0) {
			opcMaquina = '1';
		} else if(random == 1) {
			opcMaquina = 'X';
		} else if(random == 2) {
			opcMaquina = '2';
		}
		
		System.out.println("Maquina: " + opcMaquina + " Tu: " + opcion );
		
		if(opcion == opcMaquina) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
	}
	
	public static int maquina() {
		Random random = new Random();
		return random.nextInt(2);		
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
		char opcMaquina = 0;
		juego(opcMaquina);
	}

}
