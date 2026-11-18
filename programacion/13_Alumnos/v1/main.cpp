#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

#define longitud 10

struct persona{
	int telefono;
	char nombre[50];
	int notaMedia;
};

void agregarAlumno(struct persona *alumnos, int *contadorAlumnos){
	system("cls");
	
	printf("Dame el nombre\n---> ");
	scanf("%49s", alumnos[*contadorAlumnos].nombre);
	printf("Dame telefono\n---> ");
	scanf("%d", &alumnos[*contadorAlumnos].telefono);
	printf("Dame la nota\n---> ");
	scanf("%d", &alumnos[*contadorAlumnos].notaMedia);
	(*contadorAlumnos)++;
	system("cls");
}

void mostrarAlumnos(struct persona *alumnos, int *contadorAlumnos){
	int i;
	system("cls");
	
	for(i=0; i<*contadorAlumnos; i++){
		printf("[Alumno %d]\n", i+1);
		printf("Nombre: %s\n", alumnos[i].nombre);
		printf("Telefono: %d\n", alumnos[i].telefono);
		printf("Nota: %d\n\n", alumnos[i].notaMedia);
	}
	system("pause");
	system("cls");
}

void eliminarPorNombre(struct persona *alumnos, int *contadorAlumnos, char aux[50]){
	int i, j, longitud1 = 0, longitud2 = 0;
	system("cls");
	
	while(aux[longitud1] != '\0'){
		longitud1++;
	}
	
	for(i=0; i<*contadorAlumnos; i++){
		longitud2 = 0;
		
		while(alumnos[i].nombre[longitud2] != '\0'){
			longitud2++;
		}
		
		if(longitud1 == longitud2){
			int iguales = 1;
            
            for(j = 0; j < longitud1; j++) {
                if(alumnos[i].nombre[j] != aux[j]) {
                    iguales = 0;
                    break;
                }
            }
            
            if(iguales) {
                for(j = i; j < *contadorAlumnos - 1; j++) {
                    alumnos[j] = alumnos[j + 1];  
                }
                (*contadorAlumnos)--;  
                printf("Alumno eliminado\n");
                system("pause");
				system("cls");
                return;
            }
		} 
	}
	
	printf("Alumno no encontrado\n");
	system("pause");
	system("cls");
}

void mayorAmenor(struct persona *alumnos, int *contadorAlumnos){
    int i, j;
    struct persona temp;
    
    for(i = 0; i < *contadorAlumnos - 1; i++){
        for(j = i + 1; j < *contadorAlumnos; j++){
            if(alumnos[i].notaMedia < alumnos[j].notaMedia){
                temp = alumnos[i];
                alumnos[i] = alumnos[j];
                alumnos[j] = temp;
            }
        }
    }
}

void menorAmayor(struct persona *alumnos, int *contadorAlumnos){
    int i, j;
    struct persona temp;
    
    for(i = 0; i < *contadorAlumnos - 1; i++){
        for(j = i + 1; j < *contadorAlumnos; j++){
            if(alumnos[i].notaMedia > alumnos[j].notaMedia){
                temp = alumnos[i];
                alumnos[i] = alumnos[j];
                alumnos[j] = temp;
            }
        }
    }
}

int main(){
	int contadorAlumnos = 0;
	int option = 0;
	struct persona alumnos[longitud];
	char aux[50];
	
	while(option != 6){
		printf("Que quieres hacer? \n");
		printf("1. Agregar alumno\n");
		printf("2. Mostrar alumnos\n");
		printf("3. Eliminar alumno por nombre\n");
		printf("4. Ordenar por nota (mayor a menor)\n");
		printf("5. Ordenar por nota (menor a mayor)\n");
		printf("6. Salir\n");
		
		option = getch();
		option = option - '0';
		
		switch(option){
			case 1:
				agregarAlumno(alumnos, &contadorAlumnos);
				break;
				
			case 2:
				mostrarAlumnos(alumnos, &contadorAlumnos);
				break;
				
			case 3: 
				printf("Introduce el nombre que quieres eliminar: ");
				scanf("%s", aux);
				eliminarPorNombre(alumnos, &contadorAlumnos, aux);
				
				break;
				
			case 4:
				mayorAmenor(alumnos, &contadorAlumnos);
				mostrarAlumnos(alumnos, &contadorAlumnos);
				
				break;
				
			case 5:
				menorAmayor(alumnos, &contadorAlumnos);
				mostrarAlumnos(alumnos, &contadorAlumnos);
				
				break;
		}
		
	}
}
