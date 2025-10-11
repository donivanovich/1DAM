#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char *nombre;
    int notaC;
    int notaJava;
}Alumnos;

/* struct alumno{
    char *nombre;
    int notaC;
    int notaJava;
}
printf("Que quieres hacer? \n");
printf("1. Agregar alumno\n");
printf("2. Mostrar alumnos\n");
printf("3. Media de la clase\n");
printf("4. Eliminar alumno por nombre\n"); */

void agregar(Alumnos **a, int *cont){
	Alumnos temp;
	char buffer[100];
	
	printf("Nombre del alumno: ");
	scanf(" %[^\n]", buffer);
	temp.nombre = (char*) malloc(strlen(buffer) + 1);
	strcpy(temp.nombre, buffer);
	
	printf("Nota en C: ");
    scanf("%d", &temp.notaC);
    printf("Nota en Java: ");
    scanf("%d", &temp.notaJava);
    
    *a = (Alumnos*) realloc(*a, (*cont+1) * sizeof(Alumnos));
    (*a)[*cont] = temp;
    (*cont)++;
    
    printf("Alumno agregado.\n\n");
}

void mostrar(Alumnos *a, int cont){
	int i, j;
	
	for(i=0; i<cont; i++){
		printf("Alumno %d\n", i+1);
		printf("Nombre %s\n", a[i].nombre);
		printf("Java %d\n", a[i].notaJava);
		printf("C %d\n\n", a[i].notaC);
	}
}

void media(Alumnos *a, int cont){
	int i, j;
	float mediaC = 0, mediaJ = 0;
	
	if(cont <= 1){
		printf("Minimo 2 alumnos para hacer media.");
		return;
	}
	
	for(i=0; i<cont; i++){
		mediaJ += a[i].notaJava;
		mediaC += a[i].notaC;
	}
	mediaJ /= cont;
	mediaC /= cont;
	
	printf("Media en C: %0.2f\n", mediaC);
	printf("Media en Java: %0.2f\n\n", mediaJ);
}

void eliminar(Alumnos **a, int *cont){
	char nombreBuscar[100];
	int i, j;
	
	if (*cont == 0) {
        printf("No hay alumnos registrados.\n");
        return;
    }
    
    printf("Nombre del alumno a eliminar: ");
    scanf(" %[^\n]", nombreBuscar);
    
    for (int i = 0; i < *cont; i++) {
        if (strcmp((*a)[i].nombre, nombreBuscar) == 0) {
            free((*a)[i].nombre);
            for (int j = i; j < *cont - 1; j++) {
                (*a)[j] = (*a)[j + 1];
            }
            (*cont)--;
            *a = (Alumnos*) realloc(*a, (*cont) * sizeof(Alumnos));
            printf("Alumno eliminado.\n\n");
            return;
        }
    }
	
	printf("Alumno no encontrado.\n");
}

int main() {
	int opc;
	Alumnos *a = NULL;
	int cont = 0;
	
	do{
		system("pause");
		system("cls");
		printf("Que quieres hacer? \n");
		printf("1. Agregar alumno\n");
		printf("2. Mostrar alumnos\n");
		printf("3. Media de la clase\n");
		printf("4. Eliminar alumno por nombre\n---> ");
		scanf("%d", &opc);
		system("cls");
		
		if(opc == 1){
			agregar(&a, &cont);
		} else if(opc == 2){
			mostrar(a, cont);
		} else if(opc == 3){
			media(a, cont);
		} else if(opc == 4){
			eliminar(&a, &cont);
			mostrar(a, cont);
		}
		
	} while(opc < 5 && opc > 0);
	
	for (int i = 0; i < cont; i++) {
        free(a[i].nombre);
    }
    free(a);
	
	return 0;
}
