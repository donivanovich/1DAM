#include <iostream>
#include <string.h>
#include <stdio.h>

/* Escribe un programa que gestione el inventario de una tienda :
   Crea una estructura para almacenar el nombre (String), cantidad (entero) y precio (Float) de hasta 10 productos.

 Agregar un producto.
 Mostrar todos los productos.
 Buscar un producto por su nombre.
 Calcular el valor total del inventario. */

struct producto{
	char nombre[50];
	int cantidad;
	float precio;
};

void agregarProducto(struct producto productos[], int &contador, bool &inventarioVacio){
	inventarioVacio = false;
	printf("Introduce nombre: ");
	scanf("%49s", productos[contador].nombre);
	printf("Introduce cantidad: ");
	scanf("%d", &productos[contador].cantidad);
	printf("Introduce precio: ");
	scanf("%f", &productos[contador].precio);	
	contador++;
}

void mostrarProductos(struct producto productos[], int contador, bool inventarioVacio, int i){
	if(inventarioVacio == true){
		printf("[Inventario Vacio]\n");
	} else {	
		for(i=0; i<contador; i++){
			printf("[Producto %d]\nNombre: %s\nCantidad = %d uds\nPrecio = %0.2f$\n\n", i+1, productos[i].nombre, productos[i].cantidad, productos[i].precio);			
		}
		
	}
}

void buscarProducto(struct producto productos[], int contador, bool inventarioVacio, int i, char buscador[], bool encontrado){
	if(inventarioVacio == true){
		printf("[Inventario Vacio]\n");
	} else {
		printf("Introduce nombre: ");
		scanf("%49s", buscador);
		
		encontrado = false;
		
		for(i=0; i<contador; i++){
			if(strcmp(buscador, productos[i].nombre) == 0){
				printf("\nNombre: %s\nCantidad = %d uds\nPrecio = %0.2f$\n", productos[i].nombre, productos[i].cantidad, productos[i].precio);
				encontrado = true;
			}		
		}
		
		if(encontrado == false){
			printf("\n[Producto no encontrado]\n");
		}
	}
}

void calcularTotalInventario(struct producto productos[], int contador, bool inventarioVacio, int i, float total){
	if(inventarioVacio == true){
		printf("[Inventario Vacio]\n");
	} else {
		for(i=0; i<10; i++){
			total += productos[i].precio * productos[i].cantidad;				
		}
		
		printf("Total de inventario = %0.2f$\n", total);	
	}
}

int main() {
	int opc, i, contador = 0;
	float total = 0;
	char buscador[50];
	bool encontrado, inventarioVacio = true;
	struct producto productos[10];
	
	do{
		printf("[Programa Inventario]\n1.Agregar producto\n2.Mostrar productos\n3.Buscar producto\n4.Calcular inventario\n\nIntroduce otro numero para salir...\n");
		scanf("%d", &opc);
		system("cls");
		
		if(opc == 1){
			agregarProducto(productos, contador, inventarioVacio);			
		} else if(opc == 2){
			mostrarProductos(productos, contador, inventarioVacio, i);
		} else if(opc == 3){
			buscarProducto(productos, contador, inventarioVacio, i, buscador, encontrado);			
		} else if(opc == 4){
			calcularTotalInventario(productos, contador, inventarioVacio, i, total);			
		}
		printf("\n");
	} while (opc > 0 && opc < 5);
	
	printf("*********************************************\n");
    printf("*                                           *\n");
    printf("*   Gracias por usar el sistema de gestion  *\n");
    printf("*               de inventario               *\n");
    printf("*                                           *\n");
    printf("*   Esperamos que tengas un excelente dia!  *\n");
    printf("*                                           *\n");
    printf("*********************************************\n");
	
	return 0;
}

/*

//Funcion casera para obtener la longitud de una cadena
int strlen(char cadena[]){
	int i = 0;
	
	while(cadena[i] != '\0'){
		i++;
	}
	
	return i;
}


//Funcion casera para comprobar si dos cadenas son iguales
bool strcmp(char cadena1[], char cadena2[]){
	if(strlen(cadena1) != strlen(cadena2)) return false;
	
	for(int i = 0; i<strlen(cadena1); i++){
		if(cadena[i] != cadena2[i]) return false;
	}
	
	return true;
}
*/
