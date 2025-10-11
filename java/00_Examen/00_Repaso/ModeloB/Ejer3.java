package ModeloB;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Amazon pone de oferta unos botes de colores para pintar al óleo, la oferta
		 * consiste en que nos hace descuento según la cantidad necesitaremos un
		 * programa para gestionarlo: Como aliciente si eres de Amazon Prime te
		 * descuenta un 5% adicional. El precio por bote es de 4€. (1 punto) Descuentos 
		 * k. De 0 a 4 botes no hay descuento. l. De 5 a 9 botes un 5%. m. De 10 botes o
		 * más 10% Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí Ejemplo
		 * salida:
		 * 
		 * El descuento se acumula, en este caso un 15% Importe de los descuentos: 7,2€
		 * Importe: 48€ Total a Pagar: 40,8€
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float cantDescuento = 0.0f, precio, total = 0.0f;
		int descuento = 0;
		
		System.out.print("Botes: ");
		int botes = sc.nextInt();
		System.out.print("Prime: ");
		String prime = sc.next().toLowerCase();
		
		if(botes >= 1 && botes <=4) {
			total = botes * 4;
			
		} else if(botes >= 5 && botes <=9) {
			total = botes * 4;
			descuento += 5;
			cantDescuento = total * 0.05f;
			
		} else if(botes >= 10) {
			total = botes * 4;
			descuento += 10;
			cantDescuento = total * 0.1f;
		}
		if(prime.equals("si")) {
			descuento += 5;
			cantDescuento += total * 0.05f;
		}
		precio = total - cantDescuento;
		
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Importe de los descuento: " + cantDescuento);
		System.out.println("Importe: " + total);
		System.out.println("Precio: " + precio);
		
		
		
		
	}

}
