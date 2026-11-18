#include <iostream>
#include <stdio.h>
#include <stdlib.h>

/* Escribe un programa que solicite al usuario una palabra y cuente cuántas
vocales tiene sin usar funciones predefinidas. */

int main() {
	char palabra[15];
	int i, contador=0;
	
	printf("Dame la palabra: ");
	scanf("%s", palabra);
	
	for(i=0; i<15; i++){
		if(palabra[i] == 'a' || palabra[i] == 'e' || palabra[i] == 'i' || palabra[i] == 'o' || palabra[i] == 'u' ||
		palabra[i] == 'A' || palabra[i] == 'E' || palabra[i] == 'I' || palabra[i] == 'O' || palabra[i] == 'U'){
			contador++;
		}
	}
	printf("Contador de vocales: %d", contador);
	return 0;
}
