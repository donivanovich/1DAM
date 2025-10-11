#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cmath>
#include <time.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char p[15];
	int a = 0, e = 0, i = 0, o = 0, u = 0, j;
	
	printf("Dame palabra: ");
	scanf("%s", p);
	
	for(j=0; j<15; j++){
		if(p[j] == 'a' || p[j] == 'A'){
			a++;
		} else if(p[j] == 'e' || p[j] == 'E'){
			e++;
		} else if(p[j] == 'i' || p[j] == 'I'){
			i++;
		} else if(p[j] == 'o' || p[j] == 'O'){
			o++;
		} else if(p[j] == 'u' || p[j] == 'U'){
			u++;
		}	
	}
	
	printf("a=%d\ne=%d\ni=%d\no=%d\nu=%d\n", a, e, i, o, u);
	
	return 0;
}
