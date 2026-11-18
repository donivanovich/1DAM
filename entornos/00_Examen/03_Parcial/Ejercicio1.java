package examen;

public class Ejercicio1 {
	
	private int numeros[] = new int[7];

	public static void main(String[] args) {
		// Desarrolla un programa que genere un array de 7 numeros enteros aleatorios y lo ordene de tal manera que 
		// El mayor quede en el ultimo lugar y el menor en el penultimo (2 puntos)
		// metodos: cargarValores(); colocar_menor(); colocar_mayor(); imprimir_enOrden();
		
		Ejercicio1 obj = new Ejercicio1();
		obj.cargarValores();
		obj.colocar_menor();
		obj.colocar_mayor();
		obj.imprimir_enOrden();
	
	}
	
	public void cargarValores() {
		System.out.print("Array inicial:  ");
		for(int i = 0; i<numeros.length; i++) {
			int rng = (int) (Math.random() * 21);
			numeros[i] = rng;
			System.out.print(numeros[i] + " ");
		}
	}
	
	public void colocar_menor() {
		int menor = 11;
		int posMenor = 0;
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] < menor) {
				posMenor = i;
				menor = numeros[i];
			}
		}
		
		int aux = numeros[numeros.length - 2];		
		numeros[numeros.length - 2] = menor;		
		numeros[posMenor] = aux;
	}
	
	public void colocar_mayor() {
		int mayor = 0;
		int posMayor = 0;
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] > mayor) {
				posMayor = i;
				mayor = numeros[i];
			}
		}
		
		int aux = numeros[numeros.length - 1];		
		numeros[numeros.length - 1] = mayor;		
		numeros[posMayor] = aux;
	}
	
	public void imprimir_enOrden() {
		System.out.println();
		System.out.print("Array ordenado: ");
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
