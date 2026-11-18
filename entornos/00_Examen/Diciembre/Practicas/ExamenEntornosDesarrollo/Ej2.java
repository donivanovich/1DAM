package ExamenEntornosDesarrollo;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/*
		 * Una persona realiza una compra de un “disco duro” de precio 100€, si compra
		 * más de 5 unidades se le aplica un 5% de descuento, si las unidades son 10 o
		 * más un 10% de descuento. Pedimos los datos por pantalla. (Cantidad)
		 * 
		 * Ejemplo Salida: Número de discos: 12 Precio unidad: 100€ Descuento: 10%
		 * Importe descuento: 120€ Importe: 1.200€ Total a Pagar: 1080€ (1 puntos)
		 */

		Scanner sc = new Scanner(System.in);

		int descuento = 0, precio = 0;
		float importeDescuento = 0, total = 0;
		System.out.println("Cuantos discos duros deseas comprar? ");
		int discos = sc.nextInt();

		precio = discos * 100;

		if (discos >= 5 && discos <= 9) {
			descuento = 5;
			importeDescuento = precio * 0.05f;
		} else if (discos >= 10) {
			descuento = 10;
			importeDescuento = precio * 0.1f;
		}

		total = precio - importeDescuento;

		System.out.println("Número de discos: " + discos);
		System.out.println("Precio unidad: 100€");
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Importe descuento: " + importeDescuento + "€");
		System.out.println("Importe: " + precio + "€");
		System.out.println("Total a Pagar: " + total + "€");
	}

}
