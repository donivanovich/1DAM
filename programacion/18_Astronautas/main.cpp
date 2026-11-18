#include <iostream>
#include <string.h>
#include <unistd.h>

#define maxAstronautas 3

typedef struct{
	char nombre[50];
	int edad;
	char profesion[50];
	float masa;
	int nave;
}Astronautas;

typedef struct{
	char nombre[50];
	float masa;
	float pesoT = 0;
	float pesoM = 0;
	int cont = 0;
	Astronautas a[maxAstronautas];
}Naves;


/*  Somos parte del equipo de desarrollo de software de la ESA (Agencia Espacial Europea). Nos han encargado crear
	un programa que ayude a decidir cuál nave es la más apropiada para la próxima misión de envío de astronautas a
	Marte. Para lograrlo, el software debe:
	
	1. Crear naves con los siguientes datos (1,5 punto):
		o Nombre
		o Peso de la nave en la Tierra
		• Cada nave puede tener máximo 3 astronautas
	
	2. Crear astronautas con (1,5 punto):
		o Nombre
		o Edad
		o Profesión
		o Peso del astronauta en la Tierra
		o Nave a la que pertenece
		
	3. Mostrar todas las naves con sus pesos tanto en la Tierra como en Marte (2 punto).
		o El peso se obtiene de multiplicar la masa por la gravedad.
		o La gravedad en la Tierra es 9.2 m/s2 y en Marte es 3.71 m/s2.
		o La masa se calcula dividiendo el peso entre la gravedad del planeta de origen.	
	Ejemplo: si un astronauta “pesa” 70 kg en la Tierra, su masa sería 70 / 9.2 ˜ 7.6 kg.
	
	4. Ordenar y mostrar las naves junto con sus astronautas, de la que tenga el equipo menos pesado al más
	pesado (2 punto).
	
	• El uso de punteros EN TODAS LAS FUNCIONES (1 punto) (Solo si tenemos 3 de los 4 puntos hechos )
	• Código limpio, uso de funciones y buenas prácticas vistas en clase (1 punto) (Solo si tenemos 3 de los 4
	puntos hechos )
	• Es posible que la ESA cambie de opinión con el tamaño de los equipos y pida aumentar el limite de 3 a 5
	miembros, nuestro código debería permitirlo cambiando solo UNA VARIABLE (1 punto) 
*/

void crearNave(Naves *n, int *cont){
	printf("Nombre: ");
	scanf("%49s", n[*cont].nombre);
	printf("Masa: ");
	do{
		scanf("%f", &n[*cont].masa);
	} while(n[*cont].masa < 0);
	
	n[*cont].pesoT += n[*cont].masa / 9.2;
	n[*cont].pesoM += n[*cont].masa / 3.71;
	
	(*cont)++;
}

void crearAstronauta(Naves *n, int *cont){
	int id;
	
	if(*cont == 0){
		printf("Debes añadir una nave antes.");
		sleep(1);
	} else {
		printf("ID de la Nave: ");
		scanf("%d", &id);
		id--;
		if(n[id].cont >= maxAstronautas){
			printf("Esta nave esta completa.");
			sleep(1);
		} else {
			printf("Nombre: ");
			scanf("%s", n[id].a[n[id].cont].nombre);
			printf("Edad: ");
			do{
				scanf("%d", &n[id].a[n[id].cont].edad);
			} while(n[id].a[n[id].cont].edad < 18 || n[id].a[n[id].cont].edad > 80);
			printf("Profesion: ");
			scanf("%s", n[id].a[n[id].cont].profesion);
			printf("Masa: ");
			do{
				scanf("%f", &n[id].a[n[id].cont].masa);
			} while(n[id].a[n[id].cont].masa < 60.0 || n[id].a[n[id].cont].masa > 95.0);
			n[id].a[n[id].cont].nave = id;
			n[id].masa += n[id].a[n[id].cont].masa;
			n[id].pesoT += n[id].a[n[id].cont].masa / 9.2;
			n[id].pesoM += n[id].a[n[id].cont].masa / 3.71;
			
			n[id].cont++;
		}
	}
}

void mostrarNaves(Naves *n, int *cont){
	int i, j;
	
	for(i=0; i<*cont; i++){
		printf("[Nave %d]\n", i+1);
		printf("Nombre: %s\n", n[i].nombre);
		printf("Masa: %.2f\n", n[i].masa);
		printf("Peso Tierra: %.2f\n", n[i].pesoT);
		printf("Peso Marte: %.2f\n{Tripulacion}\n", n[i].pesoM);
		for(j=0; j<n[i].cont; j++){
			printf("  [Astronauta %d]\n", j+1);
			printf("    Nombre: %s\n", n[i].a[j].nombre);
			printf("    Edad: %d\n", n[i].a[j].edad);
			printf("    Masa: %.2f\n", n[i].a[j].masa);
			printf("    Profesion: %s\n", n[i].a[j].profesion);
		}
		printf("\n");
	}
	system("pause");
}

void ordenarNaves(Naves *n, int *cont){
	int i, j;
	Naves temp;
	
	for (i = 0; i < *cont - 1; i++) {
        for (j = 0; j < *cont - i - 1; j++) {
            if (n[j].masa > n[j + 1].masa) {
                temp = n[j];
                n[j] = n[j + 1];
                n[j + 1] = temp;
            }
        }
    }
	
}

int main() {
	int opc, cont = 0;
	Naves n[10];
	
	do{
		system("cls");
		printf("1. Crear Nave\n2. Crear Astronauta\n3. Mostrar Naves\n4. Ordenar Naves\n5. Salir\n---> ");
		do{
			scanf("%d", &opc);	
		} while(opc < 1 || opc > 5);
		system("cls");
		
		if(opc == 1){
			crearNave(n, &cont);
		} else if(opc == 2){
			crearAstronauta(n, &cont);
		} else if(opc == 3){
			mostrarNaves(n, &cont);
		} else if(opc == 4){
			ordenarNaves(n, &cont);
			mostrarNaves(n, &cont);
		}
		
	} while(opc != 5);
	
	return 0;
}
