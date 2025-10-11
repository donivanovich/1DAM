#include <iostream>
#include <stdio.h>
#include <stdlib.h>

/* Diseña un programa que almacene las calificaciones de un grupo
de 30 estudiantes en un array y calcule el promedio del grupo. Indica cuántos estudiantes
obtuvieron una calificación superior al promedio. */

int main() {
	float alumno[30];
	int i, contador=0;
	float promedio, suma;
	
	for(i=0; i<=29; i++){
		printf("Nota alumno %d: ", i+1);
		scanf("%f", &alumno[i]);
	}
	
	for(i=0; i<=29; i++){
		suma += alumno[i];
	}
	
	promedio = suma;
	promedio /= 30;
	printf("\nPromedio de la promocion: %0.2f", promedio);
	
	for(i=0; i<=29; i++){
		if(alumno[i] > promedio){
			contador++;
		}
	}
	
	printf("\nAlumnos con nota superior al promedio: %d", contador);
	
	return 0;
}
