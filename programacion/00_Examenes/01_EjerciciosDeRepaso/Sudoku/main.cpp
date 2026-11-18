#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string>
#include <stdbool.h>


/* Escribe un programa que valide si una matriz de 9x9 representa una solución válida de Sudoku:

-Comprueba que cada fila, cada columna y cada submatriz de 3x3 contengan todos los
números del 1 al 9 sin repetir.
-Implementa una función para verificar cada fila, columna y submatriz.
-El programa debe imprimir &quot;Válido&quot; o &quot;Inválido&quot; según el caso.*/

int main() {
	int i,j, x, y, o;
	int matriz[9][9];
	bool final = false;
	
	for(i=0; i<9; i++){
		x[i] = false;
		y[i] = false;
		
		for(j=0; j<9; j++){
			matriz[i][j] = 0;
		}
	}
	

	for(i=0; i<9; i++){
		for(j=0; j<9; j++){
			printf("[%d]", matriz[i][j]);
		}
		printf("\n");
	}
	
	do{
		for(i=0; i<9; i++){
			for(j=0; j<9; j++){
				if(matriz[i][j] == 0){
					final = false;
				}
			}
		}
		
		printf("Dame la fila: ");
		scanf("%d", &x);
		printf("Dame la columna: ");
		scanf("%d", &y);
		printf("Opcion: ");
		scanf("%d", &o);
		
		matriz[x-1][y-1] = o;
		for(i=0; i<9; i++){
			for(j=0; j<9; j++){
				printf("[%d]", matriz[i][j]);
			}
			printf("\n");
		}
	} while(final == false);	
	
	for(i=0; i<9; i++){
		for(j=0; j<9; j++){
			if(matriz[i][j] != 0){
				y[j] = true;
			}
		}
	}
	
	return 0;
}
