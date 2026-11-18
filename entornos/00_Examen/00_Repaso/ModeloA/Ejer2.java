package ModeloA;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*
		 * Amazon pone de oferta unos botes de colores para pintar al óleo, la oferta
		 * consiste en que nos hace un 3x2, 5x3 y 7x10: Como aliciente si eres de Amazon
		 * Prime te descuenta un 5% adicional. El precio por bote es de 4€. Descuentos 
		 * 
		 * a. De 0 a 2 botes no hay oferta. b. De 3 a 4 botes te regalan 1. c. De 5 a 6
		 * botes te regalan 2. d. De 7 en adelante te regalan 3.
		 * 
		 * Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí Ejemplo salida:
		 * 
		 * Te regalan 3 botes y un 5% de descuento Importe: 36€ Descuento: 1.8€ Total a
		 * Pagar: 34.2€ (1 punto)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float precio = 0;
		
		System.out.println("Cuanto quieres comprar: ");
		int botes = sc.nextInt();
		
		
		System.out.println("Eres prime? ");
		String prime = sc.next();
	
		
		if(botes >= 0 && botes <= 2) {
			precio = botes * 4;
		} else if (botes >= 3 && botes <= 4) {
			botes++;
			precio = botes * 4;
		} else if (botes >= 5 && botes <= 6) {
			botes+=2;
			precio = botes * 4;
		} else if (botes >= 7) {
			botes+=3;
			precio = botes * 4;
		}
		
		if(prime.equals("si")) {
			precio *= 0.95f;
		}
		
		System.out.println("Prime: " + prime +" Botes: " + botes + " Precio: " + precio);
	}

}
