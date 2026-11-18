#include <iostream>
#include <stdlib.h>  
#include <string.h>    

/* guardar 5 nombres y notas de 5 alumnos usando malloc */

int main() {
	int i, j;
	char **nombre;
	int *notas;
	
	nombre = (char**) malloc(5 * sizeof(char*));
	
	for (i = 0; i < 5; i++) {
        nombre[i] = (char*) malloc(50 * sizeof(char));
    }
    
    notas = (int*) malloc(5 * sizeof(int));
    
    for (i = 0; i < 5; i++) {
        printf("Ingrese el nombre del alumno %d: ", i + 1);
        scanf(" %[^\n]", nombre[i]);  

        printf("Ingrese la nota del alumno %d: ", i + 1);
        scanf("%d", &notas[i]);
    }
    
    system("cls");
    
    for (i = 0; i < 5; i++) {
        printf("Alumno: %s - Nota: %d\n", nombre[i], notas[i]);
    }
    
    for (i = 0; i < 5; i++) {
        free(nombre[i]);
    }
    free(nombre);
    free(notas);
	
	return 0;
}
