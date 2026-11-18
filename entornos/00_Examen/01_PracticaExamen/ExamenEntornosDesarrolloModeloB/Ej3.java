package ExamenEntornosDesarrolloModeloB;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Amazon pone de oferta unos botes de colores para pintar al óleo, la oferta
		 * consiste en que nos hace descuento según la cantidad necesitaremos un
		 * programa para gestionarlo: Como aliciente si eres de Amazon Prime te
		 * descuenta un 5% adicional. El precio por bote es de 4€.
		 * 
		 * Descuentos  k. De 0 a 4 botes no hay descuento. l. De 5 a 9 botes un 5%. m.
		 * De 10 botes o más 10%
		 * 
		 * Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí Ejemplo salida:
		 * 
		 * El descuento se acumula, en este caso un 15% Importe de los descuentos: 7,2€
		 * Importe: 48€ Total a Pagar: 40,8€ (1 punto)
		 */
		Scanner sc = new Scanner(System.in);

		String prime;
		int botes, descuento = 0;
		float precio = 0, importeDescuento = 0, total = 0, save = 0;

		do {
			System.out.println("Número de botes: ");
			botes = sc.nextInt();
		} while (botes < 1);

		do {
			System.out.println("Cliente Prime: ");
			prime = sc.next().toLowerCase();
		} while (!prime.contentEquals("si") && !prime.contentEquals("no"));

		if (botes >= 0 && botes <= 4) {
			precio = botes * 4;
		} else if (botes >= 5 && botes <= 9) {
			precio = botes * 4;
			save = 0.05f;
			descuento = 5;
		} else if (botes >= 10) {
			precio = botes * 4;
			save = 0.1f;
			descuento = 10;
		}

		if (prime.equals("si")) {
			descuento += 5;
			save += 0.05f;
		}

		importeDescuento = precio * save;
		total = precio - importeDescuento;

		System.out.println("El descuento se acumula, en este caso un " + descuento + "%");
		System.out.println("Importe de los descuentos: " + importeDescuento + "€");
		System.out.println("Importe: " + precio + "€");
		System.out.println("Total a Pagar: " + total + "€");

	}
}
