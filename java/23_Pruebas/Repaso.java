package Pruebas;

import java.util.Scanner;

public class Repaso {
	// 1. Crear un array de numeros enteros de tamaño 10 (5 mins)
	// 2. Haced una funcion que muestre el array separado por guiones (5 mins)
	// 3. Buscad el mayor elemento del array y colocadlo en la primera posicion (10 mins)
	// 4. Ordenar el array de mayor a menor (10 mins)
	// 5. Crear una matriz 5x5 inicialmente vacía:
	/*        Hacer un menú con estas opciones:
	*
	* - Rellenar TODA la matriz de números, debes pedírselo al usuario.
	* - Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
	* - Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
	* - Sumar la diagonal principal
	* - Sumar la diagonal inversa
	* - La media de todos los valores de la matriz
	*/
	
	private int numeros[] = new int[10];
	private int matriz[][] = new int [5][5];
	
	public void inicializarArray() {
		for(int i = 0; i<10; i++) {
			numeros[i] = i+1;
		}
	}
	
	public void imprimirArray() {
		for(int i = 0; i<10; i++) {
			
			if(i != 9) {
				System.out.print(numeros[i] + "-");
			} else {
				System.out.print(numeros[i]);
			}
		}
		
		System.out.println();
	}
	
	public void elementoMayor() {
		int mayor = 0, lugar = 0, temp;          
		
		for(int i = 0; i<10; i++) {
			if(mayor < numeros[i]) {
				mayor = numeros[i];
				lugar = i;
			}
		}
		
		temp = numeros[0];
		numeros[0] = mayor;
		numeros[lugar] = temp;

	}	
	
	public void ordenarArray() {
		int temp;
		
		for(int i=0; i< numeros.length -1; i++) {
			for(int j=i+1; j< numeros.length; j++) {
				if(numeros[i] < numeros[j]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
	}
	
	public void menuMatriz() {
	    Scanner sc = new Scanner(System.in);
	    int opc;
	    boolean relleno = false;
	    
	    do {
	        for (int i = 0; i < 5; i++) {
	            System.out.println();
	        }
	        System.out.print("Menu de Matrices\n1. Inicializar a Mano\n2. Sumar una fila\n3. Sumar una columna\n4. Sumar Diagonal Principal\n5. Sumar Diagonal Inversa\n6. Media de la matriz\n---> ");
	        opc = sc.nextInt();
	        
	        if (opc == 1) {
	            // Rellenar la matriz
	            for(int i = 0; i < matriz.length; i++) {
	                for(int j = 0; j < matriz.length; j++) {
	                    System.out.print("Dame numero [" + i + "] [" + j + "]: ");
	                    matriz[i][j] = sc.nextInt();
	                }
	            }
	            relleno = true;
	        } 
	        else if (opc == 2 && relleno) {
	            // Sumar fila
	            int fila, suma = 0;
	            System.out.print("Que fila deseas sumar? (0-4): ");
	            do {
	                fila = sc.nextInt();
	            } while (fila < 0 || fila > 4);
	            
	            for (int i = 0; i < matriz[fila].length; i++) {
	                suma += matriz[fila][i];
	            }
	            System.out.println("La suma de la fila " + fila + " es " + suma);
	        }
	        else if (opc == 3 && relleno) {
	            // Sumar columna
	            int columna, suma = 0;
	            System.out.print("Que columna deseas sumar? (0-4): ");
	            do {
	                columna = sc.nextInt();
	            } while (columna < 0 || columna > 4);
	            
	            for (int i = 0; i < matriz.length; i++) {
	                suma += matriz[i][columna];
	            }
	            System.out.println("La suma de la columna " + columna + " es " + suma);
	        }
	        else if (opc == 4 && relleno) {
	            // Sumar diagonal principal
	            int suma = 0;
	            for (int i = 0; i < matriz.length; i++) {
	                suma += matriz[i][i];
	            }
	            System.out.println("La suma de la diagonal principal es " + suma);
	        }
	        else if (opc == 5 && relleno) {
	            // Sumar diagonal inversa
	            int suma = 0;
	            for (int i = 0; i < matriz.length; i++) {
	                suma += matriz[i][matriz.length - 1 - i];
	            }
	            System.out.println("La suma de la diagonal inversa es " + suma);
	        }
	        else if (opc == 6 && relleno) {
	            // Media de la matriz
	            int suma = 0, elementos = matriz.length * matriz.length;
	            for (int i = 0; i < matriz.length; i++) {
	                for (int j = 0; j < matriz.length; j++) {
	                    suma += matriz[i][j];
	                }
	            }
	            double media = (double) suma / elementos;
	            System.out.println("La media de la matriz es " + media);
	        }
	        else {
	            System.out.println("Por favor, inicializa la matriz primero.");
	        }
	    } while (true);
	}
		
	public static void main(String[] args) {
		Repaso repaso = new Repaso();
		repaso.menuMatriz();
	}

}
