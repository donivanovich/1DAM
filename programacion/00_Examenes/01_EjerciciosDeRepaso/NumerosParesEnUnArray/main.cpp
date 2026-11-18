#include <iostream>
#include <stdlib.h>
#include <stdio.h>

/* Escribe una función que reciba un array y su tamaño como
parámetros, y retorne la cantidad de números pares que contiene. */

int recibirArray(int n[], int len){
	
	int pares = 0;
	int i = 0;
	
	for(i=0; i<len; i++){
		if(n[i] % 2 == 0){
			pares++;
		}
	}
	
	return pares;
}

int main() {
	int n[10];
	int len = 0;
	int i, pares;
	
	printf("Dame el numero: ");
	for (i = 0; i < 10; i++) {
        scanf("%d", &n[i]);
    }
	
	for(i=0; i<10; i++){
		if(n[i] == '\0'){
			break;
		} else{
			len++;
		}
	}
	
	pares = recibirArray(n, len);
	
	printf("Pares: %d\n", pares);
	printf("Longitud: %d", len);
	
	
	return 0;
}
