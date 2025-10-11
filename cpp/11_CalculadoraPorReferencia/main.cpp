#include <iostream>

/* Calculadora usando funciones con paso por referencia
sumar restar dividir y multiplicar */

void sumar(int *n1, int *n2, int *n3){
	printf("Dame n1: ");
	scanf("%d", n1);
	printf("Dame n2: ");
	scanf("%d", n2);
	*n3 = *n1 + *n2;
}
void restar(int *n1, int *n2, int *n3){
	printf("Dame n1: ");
	scanf("%d", n1);
	printf("Dame n2: ");
	scanf("%d", n2);
	*n3 = *n1 - *n2;
}
void dividir(int *n1, int *n2, int *n3){
	printf("Dame n1: ");
	scanf("%d", n1);
	printf("Dame n2: ");
	scanf("%d", n2);
	*n3 = *n1 / *n2;
}
void multiplicar(int *n1, int *n2, int *n3){
	printf("Dame n1: ");
	scanf("%d", n1);
	printf("Dame n2: ");
	scanf("%d", n2);
	*n3 = *n1 * *n2;
}

int main() {
	int n1, n2, n3;
	int opc;
	
	do{
		printf("1.Sumar\n2.Restar\n3.Dividir\n4.Multiplicar\n---> ");
		scanf("%d", &opc);
		
		if(opc == 1){
			sumar(&n1, &n2, &n3);
		} else if(opc == 2){
			restar(&n1, &n2, &n3);
		} else if(opc == 3){
			dividir(&n1, &n2, &n3);
		} else if(opc == 4){
			multiplicar(&n1, &n2, &n3);
		} else{
			return 0;	
		}
		
		printf("%d", n3);
		printf("\n\n");
	} while(1);
	
}
