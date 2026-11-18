package Modelo;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/*
		 * El siguiente programa nos saluda según la hora del día, siguiendo las
		 * siguientes premisas: La hora siempre es entera (int), y es introducida por
		 * teclado. Buenos días: desde las 7 hasta las 11 ambas inclusive Buenas tardes:
		 * desde las 12 hasta las 19 ambas inclusive Buenas Noches: desde las 20 hasta
		 * las 6 ambas inclusive En caso de que el número introducido no se corresponda
		 * con una hora manda un mensaje a la pantalla indicando que el número no es
		 * correcto. (1 puntos)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la hora: ");
		int hora = sc.nextInt();
		
		if(hora >=7 && hora<=11) {
			System.out.println("Buenos dias");
		} else if(hora >=12 && hora <= 19) {
			System.out.println("Buenas tardes");
		} else if((hora >= 20 && hora <=24) || (hora >= 0 && hora<=6)) {
			System.out.println("Buenas noches");
		}

	}

}
