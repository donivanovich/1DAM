#include <iostream>
#include <stdio.h>
#include <stdlib.h>

/* Crea un programa que reciba una palabra del usuario y la imprima al revés. */

int main() {
	char palabra[15], reves[15];
	int i, j, longitud=0;
	
	printf("Dame la palabra: ");
	scanf("%s", palabra);
	
	while (palabra[longitud] != '\0') {
        longitud++;
    }
	
	j=longitud;
	
	for(i=0; i<longitud; i++){
		reves[j] = palabra[i]; 
		j -= 1;
	}
	
	printf("%s", reves);
	
	return 0;
}
