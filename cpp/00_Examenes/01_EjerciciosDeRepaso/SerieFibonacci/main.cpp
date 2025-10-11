#include <iostream>
#include <stdio.h>

/* Escribe un programa que imprima los primeros 20 números de la serie de fibonacci. */

int main() {
	
    int fibonacci[20], i;

    fibonacci[0] = 1;

    for (i = 1; i < 20; i++) {
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
    }

    printf("Fibonacci:\n");
    for (i = 0; i < 20; i++) {
        printf("%d\n", fibonacci[i]);
    }
    printf("\n");

    return 0;
}
