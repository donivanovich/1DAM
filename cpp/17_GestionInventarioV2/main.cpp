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

typedef struct{
	int id;
	char nombre[50];
	float precio;
	int iva;
	float precioVenta;
	float recargo;
}Producto;

typedef struct{
	int unidades;
	Producto p;
}Venta;

void alta(Producto p[], int *cont1){
	if(*cont1 == 99){
		printf("Inventario Lleno.\n");
		return;
	}
	
	system("cls");
	printf("Nombre: ");
	scanf("%s", p[*cont1].nombre);
	printf("Precio: ");
	do{
		scanf("%f", &p[*cont1].precio);
	} while(p[*cont1].precio < 0);
	
	printf("IVA: ");
	do{
		scanf("%d", &p[*cont1].iva);
	} while(p[*cont1].iva != 4 && p[*cont1].iva != 10 && p[*cont1].iva != 21);
	
	printf("Precio Venta: ");
	do{
		scanf("%f", &p[*cont1].precioVenta);	
	} while(p[*cont1].precioVenta <= p[*cont1].precio);
	
	system("cls");
	
	p[*cont1].id = *cont1 + 1;
	if(p[*cont1].iva == 21){
		p[*cont1].recargo = 5.2;
	} else if(p[*cont1].iva == 10){
		p[*cont1].recargo = 1.4;
	} else if(p[*cont1].iva == 4){
		p[*cont1].recargo = 0.5;
	}
	
	printf("[Producto %d Anadido]\n", p[*cont1].id);
	printf("Nombre: %s\n", p[*cont1].nombre);
	printf("Precio: %.2f$\n", p[*cont1].precio);
	printf("IVA: %d%\n", p[*cont1].iva);
	printf("Precio Venta: %.2f$\n\n", p[*cont1].precioVenta);
	system("pause");
	(*cont1)++;
}

void mostrar(Producto p[], int cont1){
	int i;
	
	for(i=0; i<cont1; i++){
		if(p[i].iva != -1){
			printf("[Producto %d]\n", i+1);
			printf("Nombre: %s\n", p[i].nombre);
			printf("Precio: %.2f$\n", p[i].precio);
			printf("IVA: %d%\n", p[i].iva);
			printf("Precio Venta: %.2f$\n\n", p[i].precioVenta);
		}
	}
	
	system("pause");
}

void eliminar(Producto p[], int cont1){
	int i, id;
	
	for(i=0; i<cont1; i++){
		printf("[Producto %d]\n", i+1);
		printf("Nombre: %s | ", p[i].nombre);
		printf("Precio: %.2f | ", p[i].precio);
		printf("IVA: %d | ", p[i].iva);
		printf("Precio Venta: %.2f\n", p[i].precioVenta);
	}
	
	printf("\nDame ID del Producto a eliminar: ");
	do{
		scanf("%d", &id);
	} while(id < 1 || id > i);
	
	for(i=0; i<cont1; i++){
		if(id == p[i].id){
			p[i].iva = -1;
		}
	}
	
	printf("[Producto %d Eliminado]\n", id);
	
	system("pause");
}

void venta(Producto p[], int cont1, Venta v[], int *cont2){
	int i, id;
	
	if (cont2 == 0) {
        printf("No hay ventas registradas.\n");
        system("pause");
        return;
    }
	
	for(i=0; i<cont1; i++){
		printf("[Producto %d]\n", i+1);
		printf("Nombre: %s | ", p[i].nombre);
		printf("Precio: %.2f | ", p[i].precio);
		printf("IVA: %d | ", p[i].iva);
		printf("Precio Venta: %.2f\n", p[i].precioVenta);
	}
	
	printf("\nDame ID del Producto a vender: ");
	do{
		scanf("%d", &id);
	} while(id < 1 || id > i);
	
	v[*cont2].p = p[id - 1];
	
	printf("Unidades: ");
	scanf("%d", &v[*cont2].unidades);
	
	printf("[Producto %d Vendido]\n", id);
	printf("Con %d uds\n", v[*cont2].unidades);
	
    (*cont2)++;
	system("pause");
}

void total(Venta v[], int cont2){
	int i;
	
	if (cont2 == 0) {
        printf("No hay ventas registradas.\n");
        system("pause");
        return;
    }
	
	for(i=0; i<cont2; i++){
		printf("[Venta %d]\n", i+1);
		printf("Nombre: %s\n", v[i].p.nombre);
		printf("Unidades: %d\n", v[i].unidades);
		printf("Total: %.2f\n\n", v[i].unidades * v[i].p.precioVenta);
	}
	system("pause");
}

void rentable(Venta v[], int cont2){
	int i, j, tempId, idx;
	float rentabilidad[100];
	int indices[100];
	float temp, iva, recargo;
	
	if (cont2 == 0) {
        printf("No hay ventas registradas.\n");
        system("pause");
        return;
    }
	
	for(i=0; i<cont2; i++){
		iva = v[i].p.precio * (v[i].p.iva / 100.0);
        recargo = v[i].p.precio * (v[i].p.recargo / 100.0);
        rentabilidad[i] = (v[i].p.precioVenta - (v[i].p.precio + iva + recargo)) * v[i].unidades;
        indices[i] = i;
	}
	
	for (i = 0; i < cont2 - 1; i++) {
        for (j = 0; j < cont2 - i - 1; j++) {
            if (rentabilidad[j] < rentabilidad[j + 1]) {
                temp = rentabilidad[j];
                rentabilidad[j] = rentabilidad[j + 1];
                rentabilidad[j + 1] = temp;

                tempId = indices[j];
                indices[j] = indices[j + 1];
                indices[j + 1] = tempId;
            }
        }
    }
	
	printf("\nTop 5 Productos mas Rentables:\n");
    for (i = 0; i < 5 && i < cont2; i++) {
        idx = indices[i];
        printf("[Producto %d]\n", idx + 1);
        printf("Nombre: %s\n", v[idx].p.nombre);
        printf("Unidades Vendidas: %d\n", v[idx].unidades);
        printf("Rentabilidad: %.2f$\n\n", rentabilidad[i]);
    }
	
	system("pause");
}

int main() {
	int opc, cont1 = 0, cont2 = 0;
	Producto p[100];
	Venta v[100];
	
	do{
		system("cls");
		printf("1. Alta\n2. Mostrar\n3. Eliminar\n4. Realizar Venta\n5. Mostar Total de Ventas\n6. Top 5 Productos\n7. Salir\n---> ");
		do{
			scanf("%d", &opc);
		} while(opc < 1 || opc > 7);
	
	
		if(opc == 1){
			alta(p, &cont1);
		} else if(opc == 2){
			mostrar(p, cont1);
		} else if(opc == 3){
			eliminar(p, cont1);
		} else if(opc == 4){
			venta(p, cont1, v, &cont2);
		} else if(opc == 5){
			total(v, cont2);
		} else if(opc == 6){
			rentable(v, cont2);
		}
	
	} while (opc != 7);
	
	return 0;
}
