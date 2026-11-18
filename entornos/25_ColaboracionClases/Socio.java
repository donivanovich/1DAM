package Discoteca;

import java.util.Scanner;

public class Socio {
	
	private int antiguedad;
	private String nombre;
	
	public Socio() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		this.nombre = sc.next();
		System.out.print("Antiguedad: ");
		this.antiguedad = sc.nextInt();		
		System.out.println();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getAntiguedad(){		
		return antiguedad;
	}

}
