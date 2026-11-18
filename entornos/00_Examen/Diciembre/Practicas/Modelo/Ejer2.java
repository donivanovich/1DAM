package Modelo;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*
		 * Una persona realiza una compra de un “disco duro” de precio 100€, si compra
		 * más de 5 unidades se le aplica un 5% de descuento, si las unidades son 10 o
		 * más un 10% de descuento. (1 puntos) Pedimos los datos por pantalla.
		 * (Cantidad) Ejemplo Salida: Número de discos: 12 Precio unidad: 100€
		 * Descuento: 10% Importe descuento: 120€ Importe: 1.200€ Total a Pagar: 1080€
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int descuento =0;
		float precio = 0, total =0, impDesc=0;
		
		System.out.println("Dmae la cantidad: ");
		int discos = sc.nextInt();
		
		if(discos >=1 && discos<=4) {
			precio += discos * 100;
		} else if(discos >=5 && discos<=9) {
			precio += discos * 100;
			descuento+=5;
			impDesc+=precio*0.05f;
		} else if(discos >=10) {
			precio += discos * 100;
			descuento+=10;
			impDesc+=precio*0.1f;
		}
		
		total = precio - impDesc;
		
		System.out.println("Numero de discos: "+discos);
		System.out.println("Descuento: "+descuento+"%");
		System.out.println("Importe: "+precio+"€");
		System.out.println("Precio unidad: 100€");
		System.out.println("Importe descuento: "+impDesc+"€");
		System.out.println("Total a Pagar: "+ total+"€");
		
	}

}
