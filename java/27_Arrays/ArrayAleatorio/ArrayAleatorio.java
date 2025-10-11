package ArrayAleatorio;

public class ArrayAleatorio {

    public static void main(String[] args) {
    	// Con un solo array de 10 con numeros aleatorios del 1 al 100, ordenar de mayor a menor
    	
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) { 
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]); 
            } else {
                System.out.print(numeros[i] + "-"); 
            }
        }
    }
}
