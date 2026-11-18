#include <iostream>
#include <stdlib.h>
#include <stdio.h>

/* Implementa una función que calcule el factorial de un número usando un bucle. */

int main() {
	int num = 0;
	int factorial = 1;
	int i = 0;
	
	printf("Dame el numero: ");
	scanf("%d", &num);
	
	for(i=num; i >= 1; i--){
		factorial *= i;
	}
	
	printf("%d", factorial);
	
	return 0;
}
