package Arrays;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		// Una empresa tiene dos turnos (mañana y tarde)
		// en los que trabajan 8 empleados (4 por la mañana
		// y 4 por la tarde)
		// Confeccionar un programa que permita almacenar
		// los sueldos de los empleados agrupados por turno.
		// Imprimir los gastos en sueldos de cada turno.
		
		Scanner sc = new Scanner(System.in);
		
		float sueldos[] = new float[8];
		float gastos = 0, gastosM = 0, gastosT = 0;
		int i;
		
		for(i=0; i<8; i++) {
			if(i>=0 && i<4) {
				System.out.println("[Turno de mañana]");
				System.out.print("Dame el sueldo del trabajador " + (i+1) + ": ");
				sueldos[i] = sc.nextFloat();
				System.out.println();
				gastosM += sueldos[i]; 
			} else if(i>=4 && i<8) {
				System.out.println("[Turno de tarde]");
				System.out.print("Dame el sueldo del trabajador " + (i+1) + ": ");
				sueldos[i] = sc.nextFloat();
				System.out.println();
				gastosT += sueldos[i]; 
			}
			
			gastos += sueldos[i]; 
		}
		
		gastos /= 8;
		gastosM /= 4;
		gastosT /= 4;
		
		System.out.println("Gasto en sueldos de trabajadores del turno de mañana: " + gastosM);
		System.out.println("Gasto en sueldos de trabajadores del turno de tarde: " + gastosT);
		System.out.println("Gasto total en sueldos de trabajadores: " + gastos);
	}

}
