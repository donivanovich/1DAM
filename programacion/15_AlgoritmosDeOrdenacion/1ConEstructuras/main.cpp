#include <iostream>
#include <stdlib.h>
#include <stdio.h>

typedef struct persona{
	char nombre[50];
	int nota;
}alumno;

void imprimir(persona alumno[], int len){
	int i;
	for(i=0; i<len; i++){
		printf("Alumno : %s [%d]\n", alumno[i].nombre, alumno[i].nota);
	}
	printf("\n");
}

int main() {
	int len = 4;
	persona alumno[len];
	persona aux;
	
	for(int i=0; i<len; i++){
		printf("Introduce el nombre: ");
		scanf("%s", alumno[i].nombre);
		printf("Introduce nota: ");
		scanf("%d", &alumno[i].nota);
	}
	
	imprimir(alumno, len);
	
	for(int i=0; i<len; i++){
		for(int j=0; j<len; j++){
			if(alumno[i].nota < alumno[j].nota){
				aux.nota = alumno[j].nota;
				alumno[j].nota = alumno[i].nota;
				alumno[i].nota = aux.nota;
				
				//aux.nombre = alumno[j].nombre;
				//alumno[j].nombre = alumno[i].nombre;
				//alumno[i].nombre = aux.nombre;
			}
		}
	}
	
	imprimir(alumno, len);
	
	for(int i=0; i<len; i++){
		for(int j=0; j<len; j++){
			if(alumno[i].nota > alumno[j].nota){
				aux.nombre = alumno[j].nombre;
				alumno[j].nombre = alumno[i].nombre;
				alumno[i].nombre = aux.nombre;
				
				//aux.nombre = alumno[j].nombre;
				//alumno[j].nombre = alumno[i].nombre;
				//alumno[i].nombre = aux.nombre;
			}
		}
	}
	
	imprimir(alumno, len);
	
	return 0;
}
