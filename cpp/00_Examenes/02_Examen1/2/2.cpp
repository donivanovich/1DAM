#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cmath>
#include <time.h>
#include <conio.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int n[10]; 
	int i, d;
	
	printf("Dame numero: ");
	for(i=0; i<10; i++){
		n[i] = 0;
		n[i] = getch();
	}
	
	printf("Los numeros primos son: \n");
	for(i=0; i<10; i++){
		if(n[i] == 1 || n[i] == 2){
			printf("%d\n", n[i]-48);
		} else if(n[i] / n[i] == 1 && n[i] % 2 != 0){
			printf("%d\n", n[i]-48);
		}
		
	}
	
	return 0;
}
