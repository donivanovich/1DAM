#include<stdio.h>
#include<stdlib.h>

struct alumno{
	char *nombre;
	int edad;
	int nota;
	struct alumno *sig = false;
};

struct alumno *primero = NULL;

void nuevoAlumno(){
	
	struct alumno *actual = primero, *nuevo;
	char buffer[50];
	
	while(actual != NULL && actual->sig != false){
		actual = actual->sig;
	}
	
	nuevo = (struct alumno*) malloc(sizeof(struct alumno));
	
	printf("Introduce el nombre del alumno: ");
	scanf("%s", buffer);
	printf("Introduce la edad del alumno: ");
	scanf("%d", &nuevo->edad);
	printf("Introduce la nota del alumno: ");
	scanf("%d", &nuevo->nota);
	
	nuevo->sig = false;
	
	nuevo->nombre = (char *) malloc(sizeof(char) * (strlen(buffer) + 1));
	strcpy(nuevo->nombre, buffer);
	
	if(primero == NULL){
		primero = nuevo;
	} else {
		actual->sig = nuevo;
	}
		
}


void mostrarElemento(int pos){
	
	struct alumno *actual = primero;
	
	while(actual != false && pos != 1){		
		actual = actual->sig;
		pos--;
	}	
	
	if(actual != false){
		printf("%s %d %d\n", actual->nombre, actual->nota, actual->edad);
	} else {
		printf("No existe");
	}

}


int main(){
	nuevoAlumno();
	nuevoAlumno();

	mostrarElemento(2);
}
