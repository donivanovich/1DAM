#include <iostream>

/* OBLIGATORIO PASO POR REFERENCIA


En la empresa donde trabajamos necesitan un software de
gestión de inventario que tenga las siguientes funcionalidades:

- Alta de productos (máximo 100 productos) con los
campos nombre, precio de compra SIN IVA NI RECARGO DE EQUIVALENCIA, tipo de iva
(en España tenemos 3 tipos de iva que son del 21% para productos con azúcar, 10% para alimentos sin azúcar ni cafeína y 4% para categorías especiales), precio de venta
-  Mostrar todos los productos
-  Eliminar productos (si eliminamos un producto
tenemos que eliminar también todas sus ventas)
-  Realizar venta donde pedimos que producto queremos
vender y cuantas unidades se venden de ese producto
-  Mostrar total de ventas (suma total de precio de
venta * unidades de todos los productos vendidos)
-  Mostrar 5 productos más rentable (la
rentabilidad se calcula con: (precio de venta – (precio de compra + IVA + recargo de equivalencia) ) * total ventas)

*recargo de equivalencia que aplica un % extra al precio de compra
dependiendo de su tipo de iva  21%:
recargo del 5,2%, 10%: recargo del 1,4%, 4%: recargo del 0,5% */

typedef struct Inventario{
	char nombre[50];
	float precioCompra;
	float precioVenta;
	int iva;	
	int id;
}Producto;

typedef struct Gestion{
	Producto p;
	int unidades;
}Venta;

void AltaProducto(Producto p[100], int *cont){
	if(*cont == 99){
		printf("Inventario Completo\n");
	} else {
		p[*cont].id = *cont+1;
		printf("Nombre\n---> ");
		scanf("%s", p[*cont].nombre);
		printf("Precio de Compra\n---> ");
		scanf("%f", &p[*cont].precioCompra);
		printf("Precio de Venta\n---> ");
		scanf("%f", &p[*cont].precioVenta);
		printf("Tipo IVA (4, 10, 21)\n---> ");
		do{
			scanf("%d", &p[*cont].iva);
		} while(p[*cont].iva != 4 && p[*cont].iva != 10 && p[*cont].iva != 21);
		(*cont)++;
	}
	
}

void MostrarProductos(Producto p[100], int *cont){
	int i;
	
	for(i=0; i<*cont; i++){
		printf("[Producto %d]\n", p[i].id);
		printf("Nombre: %s\n", p[i].nombre);
		printf("Precio de Compra: %0.2f\n", p[i].precioCompra);
		printf("Precio de Venta: %0.2f\n", p[i].precioVenta);
		printf("Tipo IVA: %d%%\n\n", p[i].iva);
	}
	
}

void EliminarProducto(Producto p[100], int *cont){
	char aux[50];
	int l1 = 0, l2 = 0, i, j, encontrado = -1, iguales;
	printf("Nombre del Producto a Eliminar\n---> ");
	scanf("%s", aux);
	
	while(aux[l1] != '\0'){
		l1++;
	}
	
	for(i=0; i<*cont; i++){
		l2 = 0;
		while(p[i].nombre[l2] != '\0'){
			l2++;
		}
		
		if(l1 == l2){
			iguales = 1;
			
			for(j=0; j<l2; j++){
				if(aux[j] != p[i].nombre[j]){
					iguales = 0;
					break;
				}
			}
			
			if (iguales) {
                encontrado = i;
                break;
            }
		}
	}
	
	if(encontrado != -1){
		printf("[Producto Eliminado]\n");
		printf("Nombre: %s\n", p[encontrado].nombre);
		printf("Precio de Compra: %0.2f\n", p[encontrado].precioCompra);
		printf("Precio de Venta: %0.2f\n", p[encontrado].precioVenta);
		printf("Tipo IVA: %d%%\n\n", p[encontrado].iva);
		
		for (i = encontrado; i < *cont - 1; i++) {
            p[i] = p[i + 1];
        }
        (*cont)--;
	} else {
        printf("Producto no encontrado\n");
    }
	
}

void RealizarVenta(Producto p[100], int *cont, Venta v[100], int *cont2){
	int id;
	
	printf("ID del Producto a Vender\n---> ");
	scanf("%d", &id);
	id--;
	
	if(id < 0 || id >= *cont){
		printf("Producto no encontrado\n");
	} else {
		printf("Cantidad a Vender\n---> ");
		scanf("%d", &v[*cont2].unidades);
		v[*cont2].p = p[id];
		(*cont2)++;
		printf("Venta realizada con exito\n");
	}
	
}

void MostrarTotalVentas(Producto p[100], int *cont, Venta v[100], int *cont2){
	int i;
	float precioTotal = 0;
	float totalVentas = 0;
	
	for(i=0; i<*cont2; i++){
		precioTotal = v[i].unidades * v[i].p.precioVenta;
		printf("[Venta %d]", i+1);
		printf("Nombre: %s\n", v[i].p.nombre);
		printf("Precio de Compra: %0.2f\n", v[i].p.precioCompra);
		printf("Precio de Venta: %0.2f\n", v[i].p.precioVenta);
		printf("Tipo IVA: %d%%\n\n", v[i].p.iva);
		printf("Unidades: %d", v[i].unidades);
		printf("Precio Total: %.2f", v[i].unidades * v[i].p.precioVenta);
		totalVentas += precioTotal;
	}
	
	printf("Total de todas las ventas: %.2f\n", totalVentas);
	
}

void ProductosMasRentables(Producto p[100], int *cont, Venta v[100], int *cont2) {
	float rentabilidad[100];
    int i, j;
    float iva = 0, recargo = 0, tempRent = 0;
    Venta tempVenta;
    
    if (*cont2 == 0) {
        printf("No hay ventas registradas\n");
        return;
    }

    for (i = 0; i < *cont2; i++) {
        iva = 0; 
		recargo = 0;

        if (v[i].p.iva == 21) {
            iva = v[i].p.precioCompra * 0.21;
            recargo = v[i].p.precioCompra * 0.052;
        } else if (v[i].p.iva == 10) {
            iva = v[i].p.precioCompra * 0.10;
            recargo = v[i].p.precioCompra * 0.014;
        } else if (v[i].p.iva == 4) {
            iva = v[i].p.precioCompra * 0.04;
            recargo = v[i].p.precioCompra * 0.005;
        }

        rentabilidad[i] = (v[i].p.precioVenta - (v[i].p.precioCompra + iva + recargo)) * v[i].unidades;
    }

    for (i = 0; i < *cont2 - 1; i++) {
        for (j = 0; j < *cont2 - i - 1; j++) {
            if (rentabilidad[j] < rentabilidad[j + 1]) {
                tempRent = rentabilidad[j];
                rentabilidad[j] = rentabilidad[j + 1];
                rentabilidad[j + 1] = tempRent;

                tempVenta = v[j];
                v[j] = v[j + 1];
                v[j + 1] = tempVenta;
            }
        }
    }

    printf("Top 5 Productos mas Rentables:\n");
    for (i = 0; i < (*cont2 < 5 ? *cont2 : 5); i++) {
        printf("[Producto %d]\n", i + 1);
        printf("Nombre: %s\n", v[i].p.nombre);
        printf("Rentabilidad: %.2f\n", rentabilidad[i]);
        printf("Precio de Venta: %.2f\n", v[i].p.precioVenta);
        printf("Precio de Compra: %.2f\n", v[i].p.precioCompra);
        printf("IVA: %d%%\n", v[i].p.iva);
        printf("Cantidad Vendida: %d\n\n", v[i].unidades);
    }
}

int main() {
	int opc, cont = 0, cont2 = 0;
	Producto p[100];
	Venta v[100];
	
	do{
		printf("Aplicacion de Gestion de Inventario\n");
		printf("0. Alta Producto\n1. Mostrar Productos\n2. Eliminar Producto\n3. Realizar Venta\n4. Mostrar Total de Ventas\n5. Mostrar 5 Productos mas Rentables\n6. Salir\n");
		
		do{
			printf("---> ");
			scanf("%d", &opc);
		} while(opc < 0 || opc > 6);
		
		system("cls");
	
		if(opc == 0){
			AltaProducto(p, &cont);
		} else if(opc == 1){
			MostrarProductos(p, &cont);
		} else if(opc == 2){
			EliminarProducto(p, &cont);
		} else if(opc == 3){
			RealizarVenta(p, &cont, v, &cont2);
		} else if(opc == 4){
			MostrarTotalVentas(p, &cont, v, &cont2);
		} else if(opc == 5){
			ProductosMasRentables(p, &cont, v, &cont2);
		}
		
		system("pause");
		system("cls");
		
	} while(opc != 6);
		
	
	return 0;
}
