#include <iostream>
#include <donnie.h>

/* Pedir por teclado 10 palabras y 10 números (cada palabra va
relacionada con un numero), tenemos que ordenar de mayor a menor todas las
palabras usando como criterio la suma del valor ascii de cada una de sus letras
EN MINUSCULA + el numero que tenia asociada la palabra (30 minutos) */

int main() {
	char palabras[10][25];
	char temporal[25];
	int numeros[10];
	int valor[10];
	int i, longitud, j;
	int temp;
	
	for(i=0; i<10; i++){
		printf("Introduce palabra N%d: ", i+1);
		scanf("%s", temporal);
		
		printf("Introduce numero N%d: ", i+1);
		scanf("%d", &numeros[i]);
		
		system("cls");
		
		strcpy(palabras[i], tominus(temporal));
		valor[i] = numeros[i];
		
		for(j=0; j< strlen(palabras[i]); j++){
			valor[i] += palabras[i][j];
		}
	}
	
	for(i=0; i<9; i++){
		for(j=i+1; j<10; j++){
			if(valor[i] < valor[j]){
				temp = valor[i];
				valor[i] = valor[j];
				valor[j] = temp;
				
				strcpy(temporal, palabras[i]);
				strcpy(palabras[i], palabras[j]);
				strcpy(palabras[j], temporal);
			}
		}
	}
	
	for(i = 0; i < 10; i++) {
        printf("Palabra: %s\nValor: %d\n\n", palabras[i], valor[i]);
    }
	
	return 0;
}
