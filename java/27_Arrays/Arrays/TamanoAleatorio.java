package Arrays;

public class TamanoAleatorio {

	public static void main(String[] args) {
		// Crea una array de tamaño random(max 50) y
		// cargalo con número entre
		// 100 y 200 incluidos.
		//
		// Ejemplo: 102,178,126,.......
		
		int aleatorio = (int) (Math.random() * 50) + 1;
		int numeros[] = new int[aleatorio];
		
		for(int i=0; i<aleatorio; i++) {
			int randomizar = (int) (Math.random() * 100) + 101;
			
			numeros[i] = randomizar;
			if(i == aleatorio -1) {
				System.out.println(numeros[i]);
			} else {
				System.out.print(numeros[i]+ "-");
			}
			
		}
		System.out.println("Tamaño del array: " + (aleatorio));
		
	}

}