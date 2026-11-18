#include <iostream>

/* programa que pida por teclado una palabra y con funciones que usen el paso por referencia, 
impima la palabra invertida, 
imprima la palabra convertida a Mayuscula y 
impirma las vocales de la palabra */

void invertirPalabra(char palabra[], int *longitud){
	int i;
	
	printf("Palabra Invertida: ");
	
	for(i=*longitud; i>=0; i--){
		printf("%c", palabra[i]);
	}
	
	printf("\n");
}

void convertirMayusculas(char palabra[], int *longitud){
	int i;
	
	printf("Palabra en Mayusculas: ");
	
	for(i=0; i<*longitud; i++){
		if(palabra[i] <= 122 && palabra[i] >= 97){
			palabra[i] = palabra[i] - 32;
		}
		printf("%c", palabra[i]);
	}
	
	printf("\n");
}

void imprimirVocales(char palabra[], int *longitud){
	int i;
	
	printf("Vocales de la Palabra: ");
	
	for(i=0; i<*longitud; i++){
		if(palabra[i] == 'a' || palabra[i] == 'e' || palabra[i] == 'i' || palabra[i] == 'o' || palabra[i] == 'u' || palabra[i] == 'A' || palabra[i] == 'E' || palabra[i] == 'I' || palabra[i] == 'O' || palabra[i] == 'U'){
			printf("%c", palabra[i]);
		}
	}
	
	printf("\n");
}

int main() {
	char palabra[25];
	int longitud = 0;
	
	printf("Dame la palabra\n---> ");
	scanf("%s", palabra);
	system("cls");
		
	while(palabra[longitud] != '\0'){
		longitud++;
	}
	
	printf("Palabra: %s\n", palabra);

	invertirPalabra(palabra, &longitud);
	imprimirVocales(palabra, &longitud);
	convertirMayusculas(palabra, &longitud);

	return 0;
}
