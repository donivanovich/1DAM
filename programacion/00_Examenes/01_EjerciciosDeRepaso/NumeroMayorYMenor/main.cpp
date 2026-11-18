#include <iostream>
#include <stdlib.h>
#include <stdio.h>

/* Escribe un programa que lea un array de 20 elementos ingresados
por el usuario y determine cuál es el mayor y cuál es el menor de todos los valores. */

int main() {
	int i=0, mayor = 0, menor = 9;
	int numeros[20];
	
	for(i=0; i<=19; i++){
		printf("Dame el numero %d: ", i+1);	
		scanf("%d", &numeros[i]);
	}
	
	for(i=0; i<=19; i++){
		if(mayor < numeros[i]){
			mayor = numeros[i];
		}
		if(menor > numeros[i]){
			menor = numeros[i];
		}
	}
	
	printf("\nMayor: %d\nMenor: %d\n", mayor, menor);
	
	return 0;
}
