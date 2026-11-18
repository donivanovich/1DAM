#include <iostream>

int main() {
	
	//& -> direccion de memoria || * -> contenido de la direccion de memoria almacenada en la variable
	
	int numero = 4;
	int *numero1, *numero2 = 98;
	
	numero1 = &numero; 
	
	printf("%d %d %d\n", *numero1, numero, &numero);
	
	*numero1 = 6;
	
	printf("%d %d %d\n", *numero1, numero, numero1);
	
	numero1 = &numero2;
	
	printf("%d %d %d \n", *nuumero1, numero, numero1)
	
	return 0;
}
