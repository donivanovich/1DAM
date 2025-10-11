#include <stdlib.h>
#include <string.h>

int main() {
		
		// H o l a \0
	char palabra[5] = "Hola";
	char letra = 'c';
	int i = 0;
	
	printf("%d\n", sizeof(palabra)); //longitud maxima del array
	printf("%d\n", strlen(palabra)); //longitud ocupada del array
	
	printf("%s", palabra);
	printf("\n");
	scanf("%s", palabra);
	
	printf("\n");
	
	while(palabra[i] != '\0'){
		printf("%c", palabra[i] + 1);
		i++;
	}
	
	printf("\n");
	
	for(int i = 0 ; i < strlen(palabra); i++){
		printf("%c", palabra[i]);
	}
	
	
	
	return 0;
}
