#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cmath>
#include <time.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	
	int producto = 0, nombre[20][10], cantidad[20], opcion, i, buscador[20], j, encontrar = 0;
	float precio[20], valor = 0;
	bool encontrado = false;
	
	do{
		do{
			printf("[Que quieres hacer]\n1. Agregar producto\n2. Mostrar todos los productos\n3. Buscar producto\n4. Calcular el valor total del invertario\n5. Salir\n---> ");
			scanf("%d", &opcion); 
			system("cls");
		} while(opcion < 0 || opcion > 5);
		
		if(opcion == 1){
			printf("[AGREGAR PRODUCTO]\n");
			printf("Nombre del producto: ");
			scanf("%s", nombre[producto]);
			printf("Cantidad: ");
			scanf("%d", &cantidad[producto]);
			printf("Precio: ");
			scanf("%f", &precio[producto]);
			printf("\n%s", nombre[producto]);
			printf("\n%d", cantidad[producto]);
			printf("\n%f", precio[producto]);
			printf("\n");
			producto++;
		} else if(opcion == 2){
			printf("[TODOS LOS PRODUCTOS]");
			for(i=0; i<10; i++){
				if(precio[i] > 0){
					printf("\n%s", nombre[i]);
					printf("\n%d", cantidad[i]);
					printf("\n%f\n", precio[i]);
				} else {
					break;
				}
			}
		} else if(opcion == 3){
			printf("[BUSCADOR]\n");
			scanf("%s", buscador);
			
			for(j=0; j<10; j++){
				encontrado = true;
				for(i=0; i<20; i++){
					if(buscador != nombre[j]){
						encontrado = false;
					} 
					if(encontrado = true){
						encontrar++;
						printf("\n%s", nombre[encontrar]);
						printf("\n%d", cantidad[encontrar]);
						printf("\n%f\n", precio[encontrar]);
						break;
					}
				}
				if(encontrado = true){
						break;
					}
			} 
		} else if(opcion == 4){
			printf("[VALOR INVENTARIO]\n");
			for(i=0; i<10; i++){
				if(cantidad[i] > 0){
					valor += precio[i] * cantidad[i];
				} else{
					break;
				}
			}
			printf("Valor total del inventario: %.2lf\n", valor);
		}
	} while(opcion != 5);
	
	
	return 0;
}
