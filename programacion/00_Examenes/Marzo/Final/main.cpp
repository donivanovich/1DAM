#include <iostream>
#include <donnie.h>
#include <stdlib.h>

/* Examen 2a Evaluación Programación C DAM 2025

TIEMPO: 150 Minutos.
Para considerar valido un ejercicio tiene que cumplir EXACTAMENTE con lo pedido en el enunciado, si en el
enunciado no se pide hacer comprobaciones de los valores introducidos por teclado no contaran para puntuar el
ejercicio.
Cualquier indicio de uso de ChatGPT o herramientas similares para la resolución de los ejercicios (funciones no vistas
en clase, uso de paradigmas de programación avanzados como POO, etc.) puede suponer un suspenso inmediato
del examen y cualquier otra medida aplicable según el reglamento escolar.

Eres profesor de programación en un centro de Formación Profesional. Tu tarea es desarrollar un programa de
ejemplo en lenguaje C para explicar distintos conceptos en clase. El programa deberá contar con un menú que
permita elegir entre las siguientes funcionalidades:
1. Máximo Común Divisor y Mínimo Común Múltiplo:
o Solicitar dos números al usuario.
o Calcular y mostrar su máximo común divisor (MCD) y mínimo común múltiplo (MCM).
(0,5 puntos)
2. Manipulación de Cadenas:
o Solicitar una palabra.
o Mostrarla invertida.
o Convertirla y mostrarla en mayúsculas.
o Convertirla y mostrarla en minúsculas.
o Mostrarla con solo la primera letra en mayúscula y el resto en minúsculas.
(1 punto)
3. Extracción de Vocales:
o Solicitar una palabra.
o Mostrar únicamente las letras que sean vocales.
(0,5 puntos)
4. Extracción de Consonantes:
o Solicitar una palabra.
o Mostrar únicamente las letras que no sean vocales.
(0,5 puntos)
5. Vocal más Repetida:
o Solicitar una palabra.
o Determinar y mostrar cuál es la vocal que se repite con mayor frecuencia.
(0,5 puntos)
6. Dígito Primo Mayor:
o Solicitar un número.
o Mostrar el dígito que sea primo y, de ellos, el mayor.
(1 punto)
7. Registro de Alumno:
o Permitir dar de alta a un alumno solicitando:
? Nombre
? DNI
? Nota en C
? Nota en Web
? Nota en Entornos
(1 punto)
8. Listado de Alumnos:
o Mostrar todos los alumnos que hayan sido registrados.
(1 punto)

Examen 2a Evaluación Programación C DAM 2025

9. Eliminación de Alumno:
o Permitir eliminar un alumno ingresando su nombre.
o (2 puntos, o 1 punto si se realiza sin aritmética de punteros).
10. Ordenación de Alumnos:
o Ordenar los alumnos según su nota media de mayor a menor.
o (2 puntos, o 1 punto si se implementa sin aritmética de punteros). */

typedef struct{
	char nombre[50];
	char dni[10];
	float notac;
	float notaweb;
	float notaentornos;
}Alumnos;

void e1(){
	int n1, n2, temp, x, y, mcd, mcm;
	
	printf("N1: ");
	scanf("%d", &n1);
	printf("N2: ");
	scanf("%d", &n2);
	
	x = n1;
	y = n2;
	
	while(y != 0){
		temp = y;
		y = x % y;
		x = temp;
	}
	
	mcd = x;
	
	mcm = (n1 * n2) / mcd;
	
	
	printf("MCM: %d\nMCD: %d\n\n", mcm, mcd);
}

void e2(){
	char c[50], invertida[50], i;
	
	printf("Dame cadena: ");
	scanf("%s", c);
	
	printf("Cadena: %s\n", c);
	
	invertir(invertida, c);
	printf("Invertida: %s\n", invertida);
	
	i=0;
	
	while (c[i] != '\0') {
        if (c[i] >= 'a' && c[i] <= 'z') {
            c[i] -= 32;
        }
        i++;
    }
	printf("Mayus: %s\n", c);
	
	i=0;
	
	while (c[i] != '\0') {
        if (c[i] >= 'A' && c[i] <= 'Z') {
            c[i] += 32;
        }
        i++;
    }
	printf("Minus: %s\n", c);
	
	if (c[0] >= 'a' && c[0] <= 'z') {
        c[0] -= 32;
    } 
	printf("Primera Mayuscula: %s\n\n", c);
}

void e3(){
	char c[50];
	char vocal[50];
	
	printf("Dame cadena: ");
	scanf("%s", c);
	
	obtenerVocales(c, vocal);
	
	printf("Vocales: %s\n\n", vocal);
}

void e4(){
	char c[50];
	char conso[50];
	
	printf("Dame cadena: ");
	scanf("%s", c);
	
	obtenerConsonantes(c, conso);
	
	printf("Consonantes: %s\n\n", conso);
}

void e5(){
	char c[50];
	int contador[5], i = 0, mayor;
	char masRepetida = 'a';
	
	printf("Dame cadena: ");
	scanf("%s", c);
	
	
	for(i=0; i<5; i++){
		contador[i] = 0;
	}
	
	for(i=0; i<strlen(c); i++){
		if(c[i] == 'a' || c[i] == 'A'){
			contador[0]++;
		} else if(c[i] == 'e' || c[i] == 'E'){
			contador[1]++;
		} else if(c[i] == 'i' || c[i] == 'I'){
			contador[2]++;
		} else if(c[i] == 'o' || c[i] == 'O'){
			contador[3]++;
		} else if(c[i] == 'u' || c[i] == 'U'){
			contador[4]++;
		} 
	}
	
	printf("a: %d\n", contador[0]);
	printf("e: %d\n", contador[1]);
	printf("i: %d\n", contador[2]);
	printf("o: %d\n", contador[3]);
	printf("u: %d\n", contador[4]);
	
	mayor = contador[0];
	
	if(mayor < contador[1]){
		masRepetida = 'e';
	} else if(mayor < contador[2]){
		masRepetida = 'i';
	} else if(mayor < contador[3]){
		masRepetida = 'o';
	} else if(mayor < contador[4]){
		masRepetida = 'u';
	}
	
	printf("La letra mas repetida es %c\n\n", masRepetida);
}

void e6(){
	int n, i, mayor;
	
	printf("Dame numero: ");
	scanf("%d", &n);
	
	mayor = n;
	
	for (i = 2; i < n; i++) { 
        if (n % i != 0) {
            mayor = i; 
        }
    }
    
    
    
    if(mayor == n-1){
    	mayor++;
	}
	
	if(mayor == n && mayor % n != 0){
    	mayor++;
	}
    
    printf("El numero primo mayor es %d\n\n", mayor);
}

void agregar(Alumnos *a, int *cont){
	printf("Nombre: ");
	scanf("%s", a[*cont].nombre);
	printf("DNI: ");
	scanf("%s", a[*cont].dni);
	printf("C: ");
	scanf("%f", &a[*cont].notac);
	printf("WEB: ");
	scanf("%f", &a[*cont].notaweb);
	printf("Entornos: ");
	scanf("%f", &a[*cont].notaentornos);
	system("cls");
	
	printf("Nombre: %s\nDNI: %s\nC: %0.2f\nWEB: %0.2f\nEntornos: %0.2f\n\n", a[*cont].nombre, a[*cont].dni, a[*cont].notac, a[*cont].notaweb, a[*cont].notaentornos);
	(*cont)++;
}

void mostrar(Alumnos *a, int *cont){
	int i;
	
	for(i = 0; i<*cont; i++){
		if(a[i].notac != -1){
			printf("Alumno %d\nNombre: %s\nDNI: %s\nC: %0.2f\nWEB: %0.2f\nEntornos: %0.2f\n\n", i+1, a[i].nombre, a[i].dni, a[i].notac, a[i].notaweb, a[i].notaentornos);	
		}
	}
}

void eliminar(Alumnos *a, int *cont, char *buscar){
	int i, j;
	
	for(i=0; i<*cont; i++){
		if(strcmp(buscar, a[i].nombre) == 1){
			a[i].notac = -1;
			printf("El Alumno ha sido eliminado\n\n");
			break;
		}
	}
	
}

void ordenar(Alumnos *a, int *cont){
	int i, j;
	Alumnos temp;
	
	for(i = 0; i<*cont-1; i++){
		for(j=i+1; j<*cont; j++){
			if(((a[i].notac + a[i].notaweb + a[i].notaentornos ) / 3) < ((a[j].notac + a[j].notaweb + a[j].notaentornos ) / 3)){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
	}
	
	printf("Alumnos ordenados correctamente\n\n");
}

int main() {
	Alumnos a[10];
	int cont = 0, opc, i;
	char buscar[50];
	
	do{
		system("pause");
		system("cls");
		printf("1. MCD Y MCM\n2. Manipulacion Cadenas\n3. Extraccion Vocales\n4. Extraccion Consonantes\n5. Vocal mas Repetida\n6. Primo Mayor\n7. Registro Alumno\n8. Mostrar Alumnos\n9. Eliminar Alumno\n10. Ordenar Alumnos\n---> ");
		scanf("%d", &opc);
		system("cls");
		
		if(opc == 1){
			e1();
		} else if(opc == 2){
			e2();
		} else if(opc == 3){
			e3();
		} else if(opc == 4){
			e4();
		} else if(opc == 5){
			e5();
		} else if(opc == 6){
			e6();
		} else if(opc == 7){
			agregar(a, &cont);
		} else if(opc == 8){
			mostrar(a, &cont);
		} else if(opc == 9){
			printf("Nombre del alumno a eliminar: ");
			scanf("%s", buscar);
			eliminar(a, &cont, buscar);
		} else if(opc == 10){
			ordenar(a, &cont);
			mostrar(a, &cont);
		} else {
			break;
		}
		
	} while(true);
	
	
	return 0;
}
