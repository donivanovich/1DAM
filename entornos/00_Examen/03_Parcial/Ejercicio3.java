package examen;

public class Ejercicio3 {

	private int matriz[][] = new int[5][5];
	
	public static void main(String[] args) {
		// Diagonales. Rellenar una matriz 5x5 con numeros consecutivos del 1 al 25, y ejecuta una funcion que modifique las diagonales
		// para que cambien los valores a 0 tal y como se muestra en la imagen (2 puntos)
		
		Ejercicio3 obj = new Ejercicio3();
		obj.cargarMatriz();
		obj.pintarMatriz();
		obj.cambiarDiagonales();
		obj.pintarMatriz();

	}
	
	public void cargarMatriz() {
		int contador = 1;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = contador;
				contador++;
			}
		}
	}
	
	public void pintarMatriz() {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j] >= 0 && matriz[i][j] <= 9) {
					System.out.print(matriz[i][j] + "  ");
				} else {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void cambiarDiagonales() {
		for(int i=0; i<matriz.length; i++) {
			matriz[i][i] = 0;
		}
		
		for(int i=0; i<matriz.length; i++) {
			matriz[i][matriz.length - 1 - i] = 0;
		}
	}

}
