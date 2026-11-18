package ArraysParalelos;

import java.util.Scanner;

public class AlumnosNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String alumnos[] = new String[5];
		int notas[] = new int[5];
		int opc;
		int media = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print("Dame alumno N" + (i+1) + ": ");
			alumnos[i] = sc.next().toLowerCase();
			sc.nextLine();
			System.out.print("Introduce nota N" + (i+1) + ": ");
			notas[i] = sc.nextInt();
		}
		
		System.out.println("1.Ordenar por alumno | 2.Ordenar por notas");
		opc = sc.nextInt();
		
		if(opc == 1) {
			for(int i=0; i<alumnos.length-1; i++) {
				for(int j = 0; j< alumnos.length-1-i; j++) {
					if(alumnos[j].compareTo(alumnos[j+1]) > 0) {
						String aux = alumnos[j];
						alumnos[j] = alumnos[j+1];
						alumnos[j+1] = aux;
						
						int aux2 = notas[j];
						notas[j] = notas[j+1];
						notas[j+1] = aux2;
					}
				}
			}
			
			for(int i=0; i<alumnos.length; i++) {
				System.out.print(alumnos[i] + " | ");
			}
			sc.nextLine();
			for(int i=0; i<alumnos.length; i++) {
				System.out.print(notas[i] + " | ");
			}
		} else {
			for(int i=0; i<notas.length-1; i++) {
				for(int j = 0; j< notas.length-1-i; j++) {
					if(notas[j] > notas[j+1]) {
						int aux2 = notas[j];
						notas[j] = notas[j+1];
						notas[j+1] = aux2;
						
						String aux = alumnos[j];
						alumnos[j] = alumnos[j+1];
						alumnos[j+1] = aux;
					}
				}
			}
			for(int i=0; i<alumnos.length; i++) {
				System.out.print(notas[i] + " | ");
			}
			sc.nextLine();
			for(int i=0; i<alumnos.length; i++) {
				System.out.print(alumnos[i] + " | ");
			}
			
		}
		
		for(int i=0; i<notas.length; i++) {
			media += notas[i];
		}
		
		media /= notas.length;
		
	}

}
