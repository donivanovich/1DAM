package ModeloC;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Amazon pone de oferta unos botes de colores para pintar al óleo, la oferta
		 * consiste en que nos hace descuento según la cantidad necesitaremos un
		 * programa para gestionarlo: Como aliciente si eres de Amazon Prime te
		 * descuenta un 5% adicional. El precio por bote es de 4€. (1 punto) Descuentos 
		 * q. De 0 a 4 botes no hay descuento. r. De 5 a 9 botes un 5%. s. De 10 botes o
		 * más 10% Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí Ejemplo
		 * salida:
		 * 
		 * El descuento se acumula, en este caso un 15% Importe de los descuentos: 7,2€
		 * Importe: 48€ Total a Pagar: 40,8€
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float precio = 0, impDesc = 0,total = 0;
		int descuento = 0;
		
		System.out.print("Dame botes: ");
		int botes = sc.nextInt();
		System.out.print("Eres prime: ");
		String prime = sc.next().toLowerCase();

		if(botes >= 1 && botes<=4) {
			precio = botes*4;
		} else if(botes >=5 && botes <=9) {
			precio = botes*4;
			descuento += 5;
			impDesc += precio * 0.05f;
		} else if(botes>=10) {
			precio = botes* 4;
			descuento +=10;
			impDesc += precio * 0.10f;
		}
		if(prime.equals("si")) {
			descuento += 5;
			impDesc += precio * 0.05f;
		}
		
		total = precio - impDesc;
		
		System.out.print("Descuento: "+descuento+"%");
		System.out.println();
		System.out.print("Importe Descuento: " + impDesc);
		System.out.println();
		System.out.print("Importe: " + precio);
		System.out.println();
		System.out.print("Total: " + total);
	}

}
