#include <iostream>
#include <stdio.h>
#include <stdlib.h>

/* Escribe una función que reciba dos cadenas y determine si son iguales (sin
usar funciones de la librería). */

bool compararCadenas(char c1[], char c2[], int l1, int l2, int i){
	while(c1[l1] != '\0'){
		l1++;
	}
	
	while(c2[l2] != '\0'){
		l2++;
	}
	
	if(l1 != l2){
		return false;
	}
	
	for(i=0; i<l1; i++){
		if(c1[i] != c2[i]){
			return false;
		}	
	}
	return true;
}

int main() {
	char c1[15], c2[15];
	int i, j, l1 = 0, l2 = 0;
	
	printf("Dame cadena 1: ");
	scanf("%s", c1);
	
	printf("Dame cadena 2: ");
	scanf("%s", c2);
	
	if(compararCadenas(c1, c2, l1, l2, i) == false){
		printf("Las cadenas no son iguales");
	} 
	if(compararCadenas(c1, c2, l1, l2, i) == true){
		printf("Las cadenas son iguales");
	}
	
	return 0;
}
