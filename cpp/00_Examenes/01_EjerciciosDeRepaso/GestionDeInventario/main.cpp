#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
#include <stdbool.h>
#include <math.h>

/* -Gestión de inventario
Escribe un programa que gestione el inventario de una tienda:

Crea un array bidimensional para almacenar el nombre (string), cantidad (entero) y precio
(float) de hasta 10 productos.
Implementa funciones para:
Agregar un producto.
Mostrar todos los productos.
Buscar un producto por su nombre.
Calcular el valor total del inventario. */


void agregarProducto(char nombre[20][10], int cantidad[10], float precio[10], int producto) {
	if(producto<10){
		printf("[AGREGAR PRODUCTO]\nNombre: ");
		scanf("%s", nombre[producto]);
		printf("\Precio: ");
		scanf("%f", &precio[producto]);
		printf("\Cantidad: ");
		scanf("%d", &cantidad[producto]); 
		system("cls");
		printf("Has agregado: Producto N%d\nNombre: %s\nPrecio: %.2lf$\nCantidad: %d\n\n", producto+1, nombre[producto], precio[producto], cantidad[producto]);
	} else {
		printf("Almacen lleno.");
	}
	system("pause");
	system("cls");
}

void mostrarProductos(char nombre[20][10], int cantidad[10], float precio[10], int producto, int i) {
	for(i=0; i<producto; i++){
		printf("[Producto N%d]", i+1);
		printf("\nNombre: %s", nombre[i]);
		printf("\nPrecio: %.2lf$", precio[i]);
		printf("\nCantidad: %d/u", cantidad[i]);
		printf("\n\n");				
	}
	system("pause");
	system("cls");
}

void buscarProducto(char nombre[20][10], int cantidad[10], float precio[10], int j, int i) {
	char buscador[20];
	bool encontrado = false, iguales = false;
	
	printf("[BUSCADOR]\nIntroduce el nombre del producto: ");
	scanf("%s", buscador);
	
	for(j=0; j<10; j++){
		iguales = true;
		for(i=0; buscador[i] != '\0' || nombre[j][i] != '\0'; i++){
			if(buscador[i] != nombre[j][i]){
				iguales = false;
				break;
			}
		}
		if(iguales){
			printf("\nNombre: %s", nombre[j]);
			printf("\nPrecio: %.2lf$", precio[j]);
			printf("\nCantidad: %d/u", cantidad[j]);
			printf("\n\n");
			encontrado = true;
			break;
		}
	}
	if(!encontrado){
		printf("\nNo se ha encontrado el producto\n\n");
	}
	
	system("pause");
	system("cls");
}

void calcularTotalInventario(float precio[10], int cantidad[10], int producto, int j, int total) {
	total = 0;
	printf("[VALOR DE INVENTARIO]\n");
	for(j=0; j<producto; j++){
		total += precio[j] * cantidad[j];
		
	}
	printf("Valor total del inventario: %d$\n", total);
	system("pause");
	system("cls");
}

int main() {
	char nombre[20][10], buscador[20];
	int cantidad[10];
	float precio[10];
	int i= 0, j= 0, opcion = 0, producto = 0, total = 0;
	bool iguales = false, encontrado = false;
	
	do{
		do{
			printf("Que quieres hacer?\n1.Agregar un producto\n2.Mostrar todos los productos\n3.Buscar un producto por su nombre\n4.Calcular el valor total del inventario\n5.Salir\n---> ");
			scanf("%d", &opcion);
			system("cls");
		} while(opcion < 1 || opcion > 5);
		
		if(opcion == 1){
			agregarProducto(nombre, cantidad, precio, producto);
			producto++;
		} else if(opcion == 2){
			mostrarProductos(nombre, cantidad, precio, producto, i);
		} else if(opcion == 3){
			buscarProducto(nombre, cantidad, precio, j, i);
		} else if(opcion == 4){
			calcularTotalInventario(precio, cantidad, producto, j, total);
		}
		
	} while(opcion != 5);
	
	return 0;
}
