#include <iostream>
#include <string.h>

#define Xpuntos 5

typedef struct{
	char nombre[50];
	int edad;
	char pais[50];
	int puntos[10];
	int total = 0;
	int contador = 0;
	int puntosBuscar = 0;
}Tiradores;

/* Somos los desarrolladores de un equipo olímpico de tiro al blanco. Necesitamos facilitar el proceso de cálculo de
puntuaciones durante los entrenamientos para determinar qué tiradores obtienen mejores resultados. Nuestro
programa debe:
1. Crear tiradores con nombre, edad y nacionalidad. (1.5 puntos)
2. Agregar puntos a un tirador, solicitando primero su nombre y luego la puntuación del tiro (que puede ser
5, 3, 2, 1 o 0). (1.5 puntos)
3. Mostrar los tiradores ordenados de mayor a menor puntuación total. (2 puntos)
4. Mostrar los tiradores ordenados según la cantidad de tiros con puntuación de 5 puntos. (2 puntos)

• El uso de punteros EN TODAS LAS FUNCIONES (1 punto) (Solo si tenemos 3 de los 4 puntos hechos )
• Código limpio, uso de funciones y buenas prácticas vistas en clase (1 punto) (Solo si tenemos 3 de los 4
puntos hechos )
• Es posible que nos pidan modificar la opción 4 del menú para que, en lugar de ordenar por cantidad de
tiros con 5 puntos, se ordene por cantidad de tiros con 0 puntos. Debes implementar la solución de forma
que, para realizar este cambio, solo sea necesario modificar una única variable en el código. (1 punto) */

void crear(Tiradores *t, int *cont){
	printf("Nombre: ");
	scanf("%s", t[*cont]->nombre);
	printf("Pais: ");
	scanf("%s", t[*cont]->pais);
	printf("Edad: ");
	scanf("%d", &[*cont]t->edad);
	
	(*cont)++;
}

void darPuntos(Tiradores *t, int *cont){
	char aux[50];
	int i;
	
	printf("Nombre del Tirador: ");
	scanf("%s", aux);

	for(i=0; i<*cont; i++){
		if(strcmp(aux, t[i]->nombre) == 0){
			printf("Puntos (0-5): ");
			do{
				scanf("%d", &t[i]->puntos[t[i]->contador]);
			} while(t[i]->puntos[t[i]->contador] < 0 || t[i]->puntos[t[i]->contador] > 5);
			
			if(t[i]->puntos[t[i]->contador] == Xpuntos){
				t[i]->puntosBuscar++;
			}
			
			t[i]->total += t[i]->puntos[t[i]->contador];
			t[i]->contador++;
			return;
		}
	}
	
	printf("Tirador no encontrado\n");
}

void ordenarTotal(Tiradores *t, int *cont){
	Tiradores temp;
	int i, j;
	
	for(i=0; i< *cont - 1; i++){
		for(j= i + 1; j < *cont; j++){
			if(t[i]->total < t[j]->total){
				temp = t[i];
				t[i] = t[j];
				t[j] = temp;
			}
		}
	}
}

void ordenarTiros(Tiradores *t, int *cont){
	Tiradores temp;
	int i, j;
	
	for(i=0; i< *cont - 1; i++){
		for(j= i + 1; j < *cont; j++){
			if(t[i]->puntosBuscar < t[j]->puntosBuscar){
				temp = t[i];
				t[i] = t[j];
				t[j] = temp;
			}
		}
	}
}

int main() {
	Tiradores t[10];
	int opc, cont = 0;
	
	do{
		system("pause");
		system("cls");
		printf("1. Crear Tirador\n2. Agregar puntos a un Tirador\n3. Ordenar de Mayor a Menor\n4. Ordenar por cantidad de tiros con puntuacion de 5");
		do{
			printf("\n---> ");
			scanf("%d", &opc);
		} while(opc < 1 || opc > 4);
		system("cls");
		
		if(opc == 1){
			crear(t, &cont);
		} else if(opc == 2){
			darPuntos(t, &cont);
		} else if(opc == 3){
			ordenarTotal(t, &cont);
		} else if(opc == 4){
			ordenarTiros(t, &cont);
		} 
	} while (1);
	return 0;
}
