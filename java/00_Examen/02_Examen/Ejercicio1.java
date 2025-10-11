package Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuál es su horoscopo? -->");
		String horoscopo = sc.next().toLowerCase();
		
		if(horoscopo.equals("aries")) {
			System.out.println("21 de marzo al 19 de abril.");
		} else if(horoscopo.equals("tauro")) {
			System.out.println("20 de abril al 20 de mayo.");
		} else if(horoscopo.equals("leo")) {
			System.out.println("23 de julio al 22 de agosto.");
		} else {
			System.err.println("Horoscopo incorrecto.");
		}
		
	}

}
