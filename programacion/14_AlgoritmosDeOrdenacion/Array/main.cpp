#include <iostream>
#include <stdlib.h>
#include <stdio.h>


/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void imprimir(int datos[], int len){
	for(int i=0; i<len; i++){
		printf("%d ", datos[i]);
	}
	printf("\n");
}

int main() {
	int datos[10] = {4, 5, 9, 5, 6, 7, 8, 1, 2, 3};
	int aux;
	
	imprimir(datos, 10);
	
	for(int i=0; i<10; i++){
		for(int j=0; j<10; j++){
			if(datos[i] < datos[j]){
				aux = datos[i];
				datos[i] = datos[j];
				datos[j] = aux;	
			}
		}
	}
	
	imprimir(datos, 10);
	
	for(int i=0; i<10; i++){
		for(int j=0; j<10; j++){
			if(datos[i] > datos[j]){
				aux = datos[i];
				datos[i] = datos[j];
				datos[j] = aux;	
			}
		}
	}
	
	imprimir(datos, 10);
	
	return 0;
}
