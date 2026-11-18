#include <iostream>

#define maxAstronautas 3  // Para ampliar la cantidad de astronautas cambiar el valor de la constante maxAstronautas a 5 (O los que se deseen)

typedef struct{
	int idA;
	char nombre[50];
	float pesoT;
	int edad;
	char profesion[50];
	int idNave;
}Astronautas;

typedef struct{
	int idN;
	char nombre[50];
	float pesoT;
	int contAst = 0;
	Astronautas ast[maxAstronautas];
	float pesoTotal = 0;
	float pesoMarte = 0;
}Naves;

void astronauta(Astronautas a[], int *contA, Naves n[], int *contN){
	int idN, contador;
	printf("Nombre: ");
	scanf("%s", a[*contA].nombre);
	printf("Peso: ");
	scanf("%f", &a[*contA].pesoT);
	printf("Edad: ");
	scanf("%d", &a[*contA].edad);
	printf("Profesion: ");
	scanf("%s", a[*contA].profesion);
	printf("ID de la Nave: ");
	scanf("%d", &a[*contA].idNave);
	a[*contA].idNave;
	a[*contA].idA = *contA + 1;																																								
	
	idN = a[*contA].idNave-1;
	contador = n[idN].contAst;
	
	n[idN].pesoT += a[*contA].pesoT;
	
	n[idN].ast[contador] = a[*contA];
	
	n[idN].contAst++;
	(*contA)++;
}

void naves(Naves n[], int *contN){
	printf("Nombre: ");
	scanf("%s", n[*contN].nombre);
	printf("Peso: ");
	scanf("%f", &n[*contN].pesoT);
	n[*contN].idN = *contN + 1;
	(*contN)++;
}


void mostrar(Astronautas a[], int *contA, Naves n[], int *contN){
	int i, j, contador;
	
	for(i = 0; i< *contN; i++){
		contador = n[i].contAst;
		printf("Nave: %d\n", i+1);
		printf("Nombre: %s\n", n[i].nombre);
		printf("Peso: %.2f\n", n[i].pesoT);		
		printf("Peso Tierra: %.2f\n", n[i].pesoTotal);
		printf("Peso Marte: %.2f\n", n[i].pesoMarte);
		printf("[Tripulacion]\n");
		for(j=0; j< contador; j++){
			printf("Astronauta %d\n", j+1);
			printf("Nombre: %s\n", n[i].ast[j].nombre);
			printf("Peso %.2f\n", n[i].ast[j].pesoT);
			printf("Edad %d\n", n[i].ast[j].edad);
			printf("Profesion %s\n\n", n[i].ast[j].profesion);
		}
	}
}

void ordenar(Astronautas a[], int *contA, Naves n[], int *contN){
	int i, j;
	Naves temp;
																																																	
	for(i=0; i<= *contN -1; i++){
		for(j=i-1; j< *contN; j++){
			if(n[i].pesoTotal > n[j].pesoTotal){
				temp = n[i];
				n[i] = n[j];
				n[j] = n[i];
			}
		}
	}
}

void calcular(Astronautas a[], int *contA, Naves n[], int *contN){

	int i;
	
	for(i=0; i<*contN; i++){
		n[i].pesoTotal = n[i].pesoT / 9.2;
		n[i].pesoMarte= n[i].pesoT / 3.71;
		printf("Nave %d\n", i+1);
		printf("Peso en Tierra %.2f\n", n[i].pesoTotal);
		printf("Peso en Marte %.2f\n\n", n[i].pesoMarte);
	}
		
}

void anadir(Astronautas a[], int *contA, Naves n[], int *contN){
	int i, j, idA, idN, contador;
	printf("ID del Astronauta: ");
	scanf("%d", &idA);
	printf("ID del Nave: ");
	scanf("%d", &idN);
	idA--;
	idN--;
	
	contador = n[idN].contAst;
	
	n[idN].ast[contador] = a[idA];
}

int main() {
	int opc, contA = 0, contN = 0;
	Astronautas a[20];
	Naves n[20];
	
	do{
		printf("1. Astronauta\n2. Nave\n3. Calcular\n4. Mostrar\n5. Ordenar\n6. Salir\n---> ");
		do{
			scanf("%d", &opc);
		} while(opc < 1 || opc > 6);
		
		
		system("cls");
		
		if(opc == 1){
			astronauta(a, &contA, n, &contN);
		} else if(opc == 2){
			naves(n, &contN);
		} else if(opc == 3){
			calcular(a, &contA, n, &contN);
		} else if(opc == 4){
			mostrar(a, &contA, n, &contN);
		} else if(opc == 5){
			ordenar(a, &contA, n, &contN);
		} 
		system("pause");
		system("cls");
	} while(opc != 6);
	
	printf("Gracias por usar el programa\n");
	
	return 0;
}
