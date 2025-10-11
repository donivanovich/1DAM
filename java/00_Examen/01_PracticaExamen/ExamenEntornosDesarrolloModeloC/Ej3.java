package ExamenEntornosDesarrolloModeloC;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Amazon pone de oferta unos botes de colores para pintar al óleo, la oferta
		 * consiste en que nos hace descuento según la cantidad necesitaremos un
		 * programa para gestionarlo: Como aliciente si eres de Amazon Prime te
		 * descuenta un 5% adicional. El precio por bote es de 4€.
		 * 
		 * Descuentos  De 0 a 4 botes no hay descuento. De 5 a 9 botes un 5%. De 10
		 * botes o más 10%
		 * 
		 * Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí Ejemplo salida:
		 * 
		 * El descuento se acumula, en este caso un 15% Importe de los descuentos: 7,2€
		 * Importe: 48€ Total a Pagar: 40,8€ (1 punto)
		 */

		int descuento = 0, importe = 0;
		float save = 0, importeDescuento = 0, totalPagar = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Número de botes: ");
		int botes = sc.nextInt();

		System.out.print("Cliente Prime: ");
		String prime = sc.next().toLowerCase();

		importe = botes * 4;

		if (botes >= 5 && botes <= 9) {
			descuento += 5;
			save += 0.05f;
		} else if (botes >= 10) {
			descuento += 10;
			save += 0.1f;
		}

		if (prime.equals("si")) {
			save += 0.05f;
			descuento += 5;
		}

		importeDescuento = importe * save;
		totalPagar = importe - importeDescuento;

		System.out.println("El descuento se acumula, en este caso un " + descuento + "%");
		System.out.println("Importe de los descuentos: " + importeDescuento + "€");
		System.out.println("Importe: " + importe + "€");
		System.out.println("Total a Pagar: " + totalPagar + "€");

	}

}
