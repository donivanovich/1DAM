package Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int precio = 0, descuento = 0;
		float impDesc = 0, total = 0;
		
		System.out.println("Cuantos botes: ");
		int botes = sc.nextInt();
		System.out.println("Eres prime: ");
		String prime = sc.next().toLowerCase();
		
		if(botes>= 1 && botes <=4) {
			precio = botes *3;
		} else if(botes>= 5 && botes <=9) {
			precio = botes *3;
			descuento += 5;
			impDesc += precio * 0.05f;
		} else if(botes>= 10) {
			precio = botes *3;
			descuento += 10;
			impDesc += precio * 0.1f;
		}
		
		if(prime.equals("si")) {
			descuento += 5;
			impDesc += precio * 0.05f;
		}
		
		total = precio - impDesc;
		
		System.out.println("Numero de botes: " +botes);
		System.out.println("Cliente prime: " + prime);
		System.out.println("Importe de los descuentos: " + impDesc+ "€");
		System.out.println("Descuento: " + descuento+ "%");
		System.out.println("Importe: " + precio+ "€");
		System.out.println("Total a Pagar: " + total+ "€");
	}

}