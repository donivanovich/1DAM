#include <iostream>
#include <stdlib.h>
#include <stdio.h>

int suma(int n1, int n2) {
    return n1 + n2;
}

int resta(int n1, int n2) {
    return n1 - n2;
}

int division(int n1, int n2) {
    return n1 / n2;
}

int multiplicacion(int n1, int n2) {
    return n1 * n2;
}

void sumar() {
    int numero1, numero2, resultado;
    printf("Introduce el numero 1: ");
    scanf("%d", &numero1);
    printf("Introduce el numero 2: ");
    scanf("%d", &numero2);
    resultado = suma(numero1, numero2);
    printf("El resultado de la suma es %d", resultado);
}

void restar() {
    int numero1, numero2, resultado;
    printf("Introduce el numero 1: ");
    scanf("%d", &numero1);
    printf("Introduce el numero 2: ");
    scanf("%d", &numero2);
    resultado = resta(numero1, numero2);
    printf("El resultado de la resta es %d", resultado);
}

void dividir() {
    int numero1, numero2, resultado;
    printf("Introduce el numero 1: ");
    scanf("%d", &numero1);
    printf("Introduce el numero 2: ");
    scanf("%d", &numero2);
    resultado = division(numero1, numero2);
    printf("El resultado de la division es %d", resultado);
}

void multiplicar() {
    int numero1, numero2, resultado;
    printf("Introduce el numero 1: ");
    scanf("%d", &numero1);
    printf("Introduce el numero 2: ");
    scanf("%d", &numero2);
    resultado = multiplicacion(numero1, numero2);
    printf("El resultado de la multiplicacion es %d", resultado);
}

void convertirMayusMinus() {
    char letra;
    printf("Introduce una letra: ");
    scanf(" %c", &letra);

    if (letra >= 'A' && letra <= 'Z') {
        letra += 32;
        printf("La letra en minuscula es: %c\n", letra);
    } else if (letra >= 'a' && letra <= 'z') {
        letra -= 32; 
        printf("La letra en mayuscula es: %c\n", letra);
    } else {
        printf("El caracter ingresado no es una letra.\n");
    }
}

int main() {
    int opcion;
    printf("1.Mayus <--> Minus\n2.Sumar\n3.Restar\n4.Dividir\n5.Multiplicar\n");
    scanf("%d", &opcion);

    switch (opcion) {
        case 1:
        	convertirMayusMinus();
        	break;
        case 2:
            sumar();
            break;
        case 3:
            restar();
            break;
        case 4:
            dividir();
            break;
        case 5:
            multiplicar();
            break;
        default:
            printf("Opcion invalida.");
            break;
    }
    return 0;
}
