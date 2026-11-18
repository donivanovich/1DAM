#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cmath>
#include <time.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	
	char texto[15];
	int l = 0, clave, i, opcion;
	
	do{
		printf("1.Codificar\n2.Descodificar\n3.Salir\n------> ");
		scanf("%d", &opcion);
		system("cls");
		
		if(opcion == 1){
			printf("Texto: ");
			scanf("%s", texto);
			printf("Clave: ");
			scanf("%d", &clave);
			
			for(i=0; i<15; i++){
				if(texto[i] == '\0'){
					break;
				} else{
					l++;
				}
			}
			
			for(i=0; i<l; i++){
				if(texto[i] == '0'){
					texto[i] += '0' - clave;
				} else {
					texto[i] += clave;
				}				
			}			
			printf("%s\n", texto);
		} else if(opcion == 2){
			printf("Texto: ");
			scanf("%s", texto);
			printf("Clave: ");
			scanf("%d", &clave);
			
			for(i=0; i<15; i++){
				if(texto[i] == '\0'){
					break;
				} else{
					l++;
				}
			}
			
			for(i=0; i<l; i++){
				if(texto[i] < '0'){
					
				} else {
					texto[i] -= clave;
				}			
			}			
			printf("%s\n\n", texto);
		}
	} while(opcion !=3);
	
	return 0;
}
