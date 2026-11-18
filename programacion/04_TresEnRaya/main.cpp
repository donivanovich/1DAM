#include <iostream>
#include <math.h>
#include <stdlib.h>
#include <string>
#include <ctime>

int main() {
	
	int opcion, partidas, i, j, posicion = 0;
	char mapa[3][3];
	bool seguir, continuar = true;
	int cpu;
	
	partidas = 0;

    printf("Bienvenido al Tres en Raya\n\n");
	system("pause");
	system("cls");   

	while(continuar){
		
		printf("         Selecciona\n____________________________\n| 1. Jugar contra cpu      |\n| 2. Jugar contra jugador2 |\n| 3. Partidas jugadas      |\n| 4. Salir                 |\n|__________________________|\n");
		scanf("%d", &opcion);
		system("cls");
	
		for (i = 0; i < 3; i++){
			for (j = 0; j <3; j++){
				mapa[i][j] = '-';
			}
		}	
		seguir = true;
		
		switch(opcion){
			
			case 1: 
				
				do{
					cpu = rand() % 9 + 1;
					
					printf("Selecciona una casilla\nPosiciones:\n1 2 3\n4 5 6\n7 8 9\n\n");
					scanf("%d", &posicion);
					
					if(cpu != posicion){
						if(posicion == 1 && mapa[0][0] == '-'){
							mapa[0][0] = 'X';
						} else if(posicion == 2 && mapa[0][1] == '-'){
							mapa[0][1] = 'X';
						} else if(posicion == 3 && mapa[0][2] == '-'){
							mapa[0][2] = 'X';
						} else if(posicion == 4 && mapa[1][0] == '-'){
							mapa[1][0] = 'X';
						} else if(posicion == 5 && mapa[1][1] == '-'){
							mapa[1][1] = 'X';
						} else if(posicion == 6 && mapa[1][2] == '-'){
							mapa[1][2] = 'X';
						} else if(posicion == 7 && mapa[2][0] == '-'){
							mapa[2][0] = 'X';
						} else if(posicion == 8 && mapa[2][1] == '-'){
							mapa[2][1] = 'X';
						} else if(posicion == 9 && mapa[2][2] == '-'){
							mapa[2][2] = 'X';
						} else {
							printf("Error, introduce una posicion valida\n");
							continue;
						}
					} else {
						continue;
					}
					
					printf("Mapa:\n");
					for (i = 0; i < 3; i++){
						for (j = 0; j < 3; j++){
							printf("%c ", mapa[i][j]);
						}
						printf("\n");
					}
					
					printf("\n");					
					printf("\n");	
					system("pause");
					
					if(posicion != cpu){
						if(cpu == 1  && mapa[0][0] == '-'){
							mapa[0][0] = 'O';
						} else if(cpu == 2 && mapa[0][1] == '-'){
							mapa[0][1] = 'O';
						} else if(cpu == 3 && mapa[0][2] == '-'){
							mapa[0][2] = 'O';
						} else if(cpu == 4 && mapa[1][0] == '-'){
							mapa[1][0] = 'O';
						} else if(cpu == 5 && mapa[1][1] == '-'){
							mapa[1][1] = 'O';
						} else if(cpu == 6 && mapa[1][2] == '-'){
							mapa[1][2] = 'O';
						} else if(cpu == 7 && mapa[2][0] == '-'){
							mapa[2][0] = 'O';
						} else if(cpu == 8 && mapa[2][1] == '-'){
							mapa[2][1] = 'O';
						} else if(cpu == 9 && mapa[2][2] == '-'){
							mapa[2][2] = 'O';
						}
					} else {
						continue;
					}
					
					printf("Mapa:\n");
					for (i = 0; i < 3; i++){
						for (j = 0; j < 3; j++){
							printf("%c ", mapa[i][j]);
						}
						printf("\n");
					}
					
					printf("\n");					
					printf("\n");	
					system("pause");
					system("cls");		
					
					if( mapa[0][0] == 'X' && mapa[0][1] == 'X' && mapa[0][2] == 'X' || mapa[1][0] == 'X' && mapa[1][1] == 'X' && mapa[1][2] == 'X' || mapa[2][0] == 'X' && mapa[2][1] == 'X' && mapa[2][2] == 'X' || 
						mapa[0][0] == 'X' && mapa[1][0] == 'X' && mapa[2][0] == 'X' || mapa[0][1] == 'X' && mapa[1][1] == 'X' && mapa[2][1] == 'X' || mapa[0][2] == 'X' && mapa[1][2] == 'X' && mapa[2][2] == 'X' ||
						mapa[0][0] == 'X' && mapa[1][1] == 'X' && mapa[2][2] == 'X' || mapa[0][2] == 'X' && mapa[1][1] == 'X' && mapa[2][0] == 'X'){
							printf("Has ganado\n");
							partidas++;							
							break;
						}
						
					if( mapa[0][0] == 'O' && mapa[0][1] == 'O' && mapa[0][2] == 'O' || mapa[1][0] == 'O' && mapa[1][1] == 'O' && mapa[1][2] == 'O' || mapa[2][0] == 'O' && mapa[2][1] == 'O' && mapa[2][2] == 'O' || 
						mapa[0][0] == 'O' && mapa[1][0] == 'O' && mapa[2][0] == 'O' || mapa[0][1] == 'O' && mapa[1][1] == 'O' && mapa[2][1] == 'O' || mapa[0][2] == 'O' && mapa[1][2] == 'O' && mapa[2][2] == 'O' ||
						mapa[0][0] == 'O' && mapa[1][1] == 'O' && mapa[2][2] == 'O' || mapa[0][2] == 'O' && mapa[1][1] == 'O' && mapa[2][0] == 'O'){			
							printf("Has perdido\n");
							partidas++;
							break;
						}
					
				} while (seguir);
				break;
			
			case 2:
				
				do{
					
					printf("Mueve el jugador 1\nSelecciona una casilla\n\nPosiciones:\n1 2 3\n4 5 6\n7 8 9\n\n");
					scanf("%d", &posicion);
					
					if(posicion == 1 && mapa[0][0] == '-'){
						mapa[0][0] = 'X';
					} else if(posicion == 2 && mapa[0][1] == '-'){
						mapa[0][1] = 'X';
					} else if(posicion == 3 && mapa[0][2] == '-'){
						mapa[0][2] = 'X';
					} else if(posicion == 4 && mapa[1][0] == '-'){
						mapa[1][0] = 'X';
					} else if(posicion == 5 && mapa[1][1] == '-'){
						mapa[1][1] = 'X';
					} else if(posicion == 6 && mapa[1][2] == '-'){
						mapa[1][2] = 'X';
					} else if(posicion == 7 && mapa[2][0] == '-'){
						mapa[2][0] = 'X';
					} else if(posicion == 8 && mapa[2][1] == '-'){
						mapa[2][1] = 'X';
					} else if(posicion == 9 && mapa[2][2] == '-'){
						mapa[2][2] = 'X';
					} else {
						printf("Error, introduce una posicion valida\n");
						continue;
					}
					
					printf("Mapa:\n");
					for (i = 0; i < 3; i++){
						for (j = 0; j < 3; j++){
							printf("%c ", mapa[i][j]);
						}
						printf("\n");
					}
					
					printf("\n");
					system("pause");
					system("cls");
					
					if( mapa[0][0] == 'X' && mapa[0][1] == 'X' && mapa[0][2] == 'X' || mapa[1][0] == 'X' && mapa[1][1] == 'X' && mapa[1][2] == 'X' || mapa[2][0] == 'X' && mapa[2][1] == 'X' && mapa[2][2] == 'X' || 
						mapa[0][0] == 'X' && mapa[1][0] == 'X' && mapa[2][0] == 'X' || mapa[0][1] == 'X' && mapa[1][1] == 'X' && mapa[2][1] == 'X' || mapa[0][2] == 'X' && mapa[1][2] == 'X' && mapa[2][2] == 'X' ||
						mapa[0][0] == 'X' && mapa[1][1] == 'X' && mapa[2][2] == 'X' || mapa[0][2] == 'X' && mapa[1][1] == 'X' && mapa[2][0] == 'X'){
							seguir = false;
							printf("\nHa ganado el jugador 1\n\n");
							printf("\n");
							partidas++;
							system("pause");
							system("cls");
							break;
					}
					
					printf("Mueve el jugador 2\nSelecciona una casilla\n\nPosiciones:\n1 2 3\n4 5 6\n7 8 9\n\n");
					scanf("%d", &posicion);
					
					if(posicion == 1 && mapa[0][0] == '-'){
						mapa[0][0] = 'O';
					} else if(posicion == 2 && mapa[0][1] == '-'){
						mapa[0][1] = 'O';
					} else if(posicion == 3 && mapa[0][2] == '-'){
						mapa[0][2] = 'O';
					} else if(posicion == 4 && mapa[1][0] == '-'){
						mapa[1][0] = 'O';
					} else if(posicion == 5 && mapa[1][1] == '-'){
						mapa[1][1] = 'O';
					} else if(posicion == 6 && mapa[1][2] == '-'){
						mapa[1][2] = 'O';
					} else if(posicion == 7 && mapa[2][0] == '-'){
						mapa[2][0] = 'O';
					} else if(posicion == 8 && mapa[2][1] == '-'){
						mapa[2][1] = 'O';
					} else if(posicion == 9 && mapa[2][2] == '-'){
						mapa[2][2] = 'O';
					} else {
						printf("Error, introduce una posicion valida\n");
						continue;
					}
					
					printf("Mapa:\n");
					for (i = 0; i < 3; i++){
						for (j = 0; j < 3; j++){
							printf("%c ", mapa[i][j]);
						}
						printf("\n");
					}
					
					printf("\n");
					system("pause");
					system("cls");
					
					if( mapa[0][0] == 'O' && mapa[0][1] == 'O' && mapa[0][2] == 'O' || mapa[1][0] == 'O' && mapa[1][1] == 'O' && mapa[1][2] == 'O' || mapa[2][0] == 'O' && mapa[2][1] == 'O' && mapa[2][2] == 'O' || 
						mapa[0][0] == 'O' && mapa[1][0] == 'O' && mapa[2][0] == 'O' || mapa[0][1] == 'O' && mapa[1][1] == 'O' && mapa[2][1] == 'O' || mapa[0][2] == 'O' && mapa[1][2] == 'O' && mapa[2][2] == 'O' ||
						mapa[0][0] == 'O' && mapa[1][1] == 'O' && mapa[2][2] == 'O' || mapa[0][2] == 'O' && mapa[1][1] == 'O' && mapa[2][0] == 'O'){
							seguir = false;
							printf("\nHa ganado el jugador 2\n\n");
							printf("\n");
							partidas++;
							system("pause");
							system("cls");
							break;
					}
					
				} while (seguir = true);
				break;
			
			case 3:
				printf("Has jugado un total de %d", partidas);
				return 0;
				break;
			
			case 4:
				continuar = false;
	            printf("Gracias por jugar.\n");
	            break;
			
			
			default:
				printf("Error, selecciona un numero valido\n");
				break;
		}
	}
	return 0;	
}
