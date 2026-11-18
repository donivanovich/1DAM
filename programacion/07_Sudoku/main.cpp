#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string>
#include <stdbool.h>

int main() {
	int i,j, x, y, t, k, contador1[9], contador2[9], contador3[9];
	int matriz[9][9];
	bool fin, correcto = true;
	
	for(j=0; j<9; j++){
		for(i=0; i<9; i++){
			contador1[i] = 0;
			contador2[i] = 0;
			contador3[i] = 0;
			matriz[i][j] = 0;
		}
	}
	
	printf("Bienvenido a SUDOKU\n");
	do{
		printf("\n   1  2  3  4  5  6  7  8  9\n");
		for(j=0; j<9; j++){
			printf("%d ", j+1);
			for(i=0; i<9; i++){
				printf("[%d]", matriz[i][j]);
			}
			printf("\n");
		}
		
		do{
			printf("Dame columna: ");
			scanf("%d", &y);
		} while (y < 1 || y > 9);
		
		do{
			printf("Dame fila: ");
			scanf("%d", &x);
		} while (x < 1 || x > 9);
		
		do{
			printf("Dame numero: ");
			scanf("%d", &t);
		} while (t < 1 || t > 9);
			
		x -=1;
		y -=1;
		matriz[y][x] = t;		
		system("cls");
		
		for(j=0; j<9; j++){
			for(i=0; i<9; i++){
				if(matriz[i][j] != 0){
					fin = true;
				} else {
					fin = false;
				}
			}
		}
		
	} while(fin == false);
	
	for(j=0; j<9; j++){
		for(i=0; i<9; i++){
			contador1[j] += matriz[j][i];
			contador2[j] += matriz[i][j];
		}
	}
	/*
	for(j=0; j<3; j++){
		for(i=0; i<3; i++){
			contador3[1] += matriz[j][i];
		}		
	}	
	for(j=0; j<3; j++){
		for(i=3; i<6; i++){
			contador3[2] += matriz[j][i];
		}		
	}
	for(j=0; j<3; j++){
		for(i=6; i<9; i++){
			contador3[3] += matriz[j][i];
		}		
	}	
	for(j=3; j<6; j++){
		for(i=0; i<3; i++){
			contador3[4] += matriz[j][i];
		}
	}
	for(j=3; j<6; j++){
		for(i=3; i<6; i++){
			contador3[5] += matriz[j][i];
		}
	}
	for(j=3; j<6; j++){
		for(i=6; i<9; i++){
			contador3[6] += matriz[j][i];
		}
	}
	for(j=6; j<9; j++){
		for(i=0; i<3; i++){
			contador3[7] += matriz[j][i];
		}
	}
	for(j=6; j<9; j++){
		for(i=3; i<6; i++){
			contador3[8] += matriz[j][i];
		}
	}
	for(j=6; j<9; j++){
		for(i=6; i<9; i++){
			contador3[9] += matriz[j][i];
		}
	}
	*/
	k=0;
	for(j=0; j<9; j++){
		if(j>= 0 && j<= 3){
			for(i=0; i<9; i++){
				if(i>=0 && i<=3){
					contador3[k] += matriz[j][i];
				}	
				if(i>=3 && i<=6){
					contador3[k] += matriz[j][i];
				}
				if(i>=6 && i<=9){
					contador3[k] += matriz[j][i];
				}			
			}
		}
		if(j>= 3 && j<= 6){
			for(i=0; i<9; i++){
				if(i>=0 && i<=3){
					contador3[k] += matriz[j][i];
				}	
				if(i>=3 && i<=6){
					contador3[k] += matriz[j][i];
				}
				if(i>=6 && i<=9){
					contador3[k] += matriz[j][i];
				}			
			}
		}
		if(j>= 6 && j<= 9){
			for(i=0; i<9; i++){
				if(i>=0 && i<=3){
					contador3[k] += matriz[j][i];
				}	
				if(i>=3 && i<=6){
					contador3[k] += matriz[j][i];
				}
				if(i>=6 && i<=9){
					contador3[k] += matriz[j][i];
				}			
			}
		}
		k++;
	}	
	
	for(k=0; k<9; k++){
		if(contador1[k] != 45 || contador2[k] != 45 || contador3[k] != 45){
			correcto = false;
		}
	}
	
	if(correcto == false){
		printf("La matriz introducida es incorrecta");
	} else {
		printf("La matriz introducida es correcta");
	}
	return 0;
}
