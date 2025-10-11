#include <iostream>
#include <stdlib.h>
#include <donnie.h>
#include <ctime>

/* Pedir por teclado una palabra de mínimo 10 letras, tenemos
que escoger aleatoriamente una de las letras de la palabra (no la enseñamos), el
usuario tiene que introducir letras hasta adivinar cual es la letra (10 minutos) */

int main() {
	
	char palabra[25];
	int longitud;
	bool adivinado = false;
	int rng = 0;
	char letra;
	
	do{
		printf("Dame palabra de minimo 10 letras: ");
		scanf("%s", palabra);
		longitud = strlen(palabra);
	} while(longitud < 10);
	
	system("cls");
	
	srand(time(NULL));
	rng = rand() % longitud;
	
	do{
		printf("Letra: ");
		scanf("%c", &letra);
		
		if(letra == palabra[rng]){
			adivinado = true;
		}
		
		system("cls");
		
	} while (!adivinado);
	
	printf("Palabra: %s\n", palabra);
	printf("Letra: %c", letra);
	
	
	return 0;
}
