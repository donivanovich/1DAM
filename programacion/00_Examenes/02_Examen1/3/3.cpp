#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cmath>
#include <time.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	float total, propina, debe;
	float porcentaje = 0;
	
	printf("Dame el total de la cuenta: ");
	scanf("%f", &total);
	
	do{
		printf("Dame el porcentaje de la propina a dar: ");
		scanf("%f", &porcentaje);
	} while(porcentaje < 0 || porcentaje > 100);
	
	propina = total * (porcentaje / 100);
	
	debe = total + propina;
	
	printf("Total sin propina: %.2lf\n", total);
	printf("Propina calculada: %.2lf\n", propina);
	printf("Total a pagar: %.2lf\n", debe);
	
	return 0;
}
