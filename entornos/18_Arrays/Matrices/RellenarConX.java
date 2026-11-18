package Matrices;

public class RellenarConX {

	private char matriz[][] = new char[3][3];
	
	public void inicializarMatriz() {
		int r1 = (int) (Math.random() * 3);
		int r2 = (int) (Math.random() * 3);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
					matriz[i][j] = 'x';			
			}
		}
		
		matriz[r1][r2] = 'o';
	}
	
	public void pintarMatriz() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// Matriz 3x3, rellena con 'x' en todas las posiciones menos en 1 conseguir rellenar el hueco con un 'o'
		
		RellenarConX r = new RellenarConX();
		r.inicializarMatriz();		
		r.pintarMatriz();
	}

}
