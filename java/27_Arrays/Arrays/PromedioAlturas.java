package Arrays;

import java.util.Scanner;

public class PromedioAlturas {
	
	public static void Resultado(float promedio, int altos, int bajos) {
		System.out.println("Promedio: " + promedio);
		System.out.println(altos + " personas por encima del promedio");
		System.out.println(bajos + " personas por debajo del promedio");
	}

	public static void main(String[] args) {
		// Definir un array de 5 componentes de tipo float que reprensenten las alturas de 5 personas. Obtener el promedio de las mismas.
		// Contar cuantas personas son mas altas que el promedio y cuantas mas bajas.
		
		Scanner sc = new Scanner(System.in);
		
		float alturas[] = new float[5];
		float promedio = 0;
		int i, altos=0, bajos=0;
		
		for(i=0; i<5; i++) {
			System.out.print("Dame la altura de " + (i+1) + ": ");
			alturas[i] = sc.nextFloat();
			promedio += alturas[i];
		}
		
		promedio = promedio / 5;
		
		for(i=0; i<5; i++) {
			if(alturas[i] >= promedio) {
				altos++;
			} else if(alturas[i] < promedio){
				bajos++;
			}
		}
		
		Resultado(promedio, altos, bajos);
	}

}
