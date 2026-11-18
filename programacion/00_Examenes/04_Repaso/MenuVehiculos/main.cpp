#include <iostream>
#include <donnie.h>

/* Menú que pida al usuario (30 minutos):
	-Crear vehículos (modelo, velocidad)
	-Calcular cuánto tiempo tardaría cada vehículo en hacer un recorrido de X km (pidiendo por teclado los km)
	-Eliminar vehículos */

typedef struct{
	char modelo[50];
	int velocidad;
}coches;

int main() {
	float km;
	float tiempo;
	coches c[10];
	int opc, contador = 0, i;
	char buscador[50];
	
	do{
		system("pause");
		system("cls");
		printf("Elige\n1. Crear Vehiculo\n2. Calcular tiempo\n3. Eliminar Vehiculo\nX. Salir\n---> ");
		scanf("%d", &opc);
		
		if(opc == 1){
			printf("\nModelo: ");
			scanf("%s", c[contador].modelo);
			
			printf("Velocidad Maxima: ");
			scanf("%d", &c[contador].velocidad);
			
			contador++;
			
		} else if(opc == 2){
			
			printf("\nCual es el modelo de tu coche: ");
			scanf("%s", buscador);
			
			for(i=0; i<contador; i++){
				if(strcmp(buscador, c[i].modelo) == 1){
					printf("Cuantos KM recorre tu %s: ", c[i].modelo);
					scanf("%f", &km);
					
					tiempo = km / c[i].velocidad;
					
					printf("\nTu %s tardaria %0.2f hora/s en recorrer %0.2fKM\n", c[i].modelo, tiempo, km);
					
					break;
				}
			}	
			
			if(i==contador){
				printf("\n[No existe modelo registrado con ese nombre]\n");
			}
			
		} else if(opc == 3){
			printf("Cual es el modelo de tu coche: ");
			scanf("%s", buscador);
			
			for(i=0; i<contador; i++){
				if(strcmp(buscador, c[i].modelo) == 1){
					c[i] = c[contador-1];
					contador--;
					printf("Vehiculo eliminado correctamente\n");
					break;
				}
			}	
			
			if(i==contador){
				printf("No existe modelo registrado con ese nombre\n");
			}
			
		} else {
			break;
		}
	} while(opc > 1 || opc < 3);
	
	return 0;
}
