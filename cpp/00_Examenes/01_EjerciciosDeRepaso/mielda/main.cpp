#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
#include <stdbool.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char n1[20], n2[20]; 
    int n3[20];
    int l1 = 0, l2 = 0, i, d1, d2;

    do{

	    printf("Dame n1: ");
	    scanf("%s", n1);
	
	    printf("Dame n2: ");
	    scanf("%s", n2);
	
	    printf("%s, %s\n", n1, n2);
	
	    for(i=0; i<20; i++){
	        if(n1[i] != '\0'){
	            l1++;
	        } else {
	            break;
	        }
	    }
	    for(i=0; i<20; i++){
	        if(n2[i] != '\0'){
	            l2++;
	        } else {
	            break;
	        }
	    }
	
	    printf("%d, %d\n", l1, l2);

    }while(l1 < 10 || l2 < 10 || l1 != l2);

	for(i=0; i<l1; i++){
		n3[i] = n2[i];
	}
	
    for(i = 0; i < l1; i++){
    	d1 = n1[i] - '0';
    	d2 = n2[i] - '0';
    	
    	n3[i] = d1 * d2;
        printf("%c*%c=%d ", n1[i], n2[i], n3[i]);
    }
	
	
	return 0;
}
