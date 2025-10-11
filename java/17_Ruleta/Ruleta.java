import java.util.Random;
import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {
		// 18 casillas rojas =  x2 en fichas impares
		// 18 casillas negras =  x2 en fichas pares
		// 1 casilla verde = x35 en fichas
		// inicializar en x fichas
		// pasa las fichas a euros, 10 fichas = 1 euro

		Scanner sc = new Scanner(System.in);
		Random random = new Random();		
		
		int fichas;
		int euros;
		int apuesta;
		int casilla = random.nextInt(37);
		int casillaApuesta;
		boolean repetir = true;
		String continuar = "";
		
		System.out.println("¿Cuantos euros quieres apostar?");
		euros = sc.nextInt();
		System.out.println();
		
		do {	
			if(euros == 0) {
				System.err.println("No puedes apostar sin dinero");
				break;
			} else {
				fichas = euros * 10;
				
				System.out.println("Dispones de " + fichas + " fichas, ¿que cantidad y a que casilla quieres apostar?");
				System.out.println("Apuesta: ");
				apuesta = sc.nextInt();
				System.out.println("Casilla: ");
				casillaApuesta = sc.nextInt();
				System.out.println();
				
				if(casillaApuesta == 0) {
					System.out.println("Has elegido la casilla 0 - Verde");
				} else if(casillaApuesta % 2 == 0) {
					System.out.println("Has elegido la casilla " + casillaApuesta + " - Negro");
				} else if(casillaApuesta % 2 != 0) {
					System.out.println("Has elegido la casilla " + casillaApuesta + " - Rojo");
				}
				
				if(casillaApuesta >= 0 && casillaApuesta <= 36) {
					if(casillaApuesta == casilla) {
						if(casillaApuesta == 0) {
							fichas += (apuesta * 35);
						} else if (casillaApuesta % 2 != 0 && casillaApuesta != 0) {
							fichas += (apuesta * 2);
						} else if (casillaApuesta % 2 == 0 && casillaApuesta != 0) {
							fichas += (apuesta * 2);
						}
					} else {
						fichas -= apuesta;
						System.out.println("Vaya, has perdido la apuesta");
					}
				} else {
					System.out.println("No has introducido una casilla correcta");		
				}
				euros = fichas / 10;
	                
	            System.out.println("Ahora tienes " + fichas + " fichas");
				System.out.println();
				
				do {
					System.out.println("¿Deseas realizar otra apuesta?");
					System.out.println("SI o NO");
					continuar = sc.next().toUpperCase();
					if (continuar.equalsIgnoreCase("SI")) {
						repetir = true;
					} else if(continuar.equalsIgnoreCase("NO")) {
						repetir = false;
					} else {
						System.err.println("Respuesta incorrecta, di si o no");
					}
				} while (!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO"));				
			}			
		} while (repetir && euros >= 0); 
		
		System.out.println();
		System.out.println("Gracias por jugar");
	}
}