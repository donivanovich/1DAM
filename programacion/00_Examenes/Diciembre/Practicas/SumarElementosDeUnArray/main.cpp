#include <iostream>
#include <stdlib.h>
#include <stdio.h>

/* Escribe un programa que solicite al usuario ingresar 10
números enteros, los almacene en un array y calcule la suma de todos ellos. */

int main() {
	int i, longitud, suma = 0;
	int numero[10];
	
	for(i=0; i<=9; i++){
		printf("Dame numero %d: ", i+1);		
		scanf("%d", &numero[i]);
	}
	
	
	for(i=0; i<=9; i++){
		suma += numero[i];
	}
	
	printf("%d", suma);
	return 0;
}
