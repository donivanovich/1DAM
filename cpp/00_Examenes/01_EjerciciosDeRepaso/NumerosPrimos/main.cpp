#include <iostream>
#include <stdio.h>
#include <stdlib.h>

/* Diseña un programa que solicite un número al usuario y muestre todos los
números primos menores o iguales a ese número. */

int main() {
    int num, i, j;
	bool esPrimo;

    printf("Dame el numero: ");
    scanf("%d", &num);

    printf("Primos menores o iguales a %d:\n", num);

    for (i = 1; i <= num; i++) {
        esPrimo = true;

        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo == true) {
            printf("%d\n", i);
        }
    }


    return 0;
}
