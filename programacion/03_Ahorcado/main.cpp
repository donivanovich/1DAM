#include <iostream>
#include <stdio.h>
#include <string.h>
#include <conio.h>

/*
menu 
1. Jugar
2. Cuantas partidas he jugado
3. Cuantas partidas he ganado
4. Cuantas partidas he perdido

Tenemos 6 vidas por parida, al empezar 
tenemos que enseñar la cantidad de letras a adivinar
como guiones o a medida que vamos adivinando letras
se reemplazan en los guiones

ejemplo:
	palabra = hola
	----
	letra = h
	h---
	
ademas tenemos que hacer el dibujo del ahorcado a 
medida de que vayamos perdiendo vidas

 -------
|      |
|      0
|	  /|\
|	  /\
|
*/
// strlen(palabra), longitud del string
int main() {
    bool palabraAdivinada = false;
    bool acierto = false;
    char palabra[20] = "";
    char palabraMostrada[20] = "";
    char letra;
    int i = 0;
    int vidas = 6;
    int opcion;
    int partidasJugadas = 0;
    int partidasGanadas = 0;
    int partidasPerdidas = 0;
	
	printf("Bienvenido al juego del ahorcado, elige una opcion\n");
    do {
    	printf("\n|------------------------------------------------|\n");
        printf("|                 Elige una opcion               |\n");
        printf("|------------------------------------------------|\n");
        printf("|1. Jugar                                        |\n");
        printf("|2. Cuantas partidas he jugado                   |\n");
        printf("|3. Cuantas partidas he ganado                   |\n");
        printf("|4. Cuantas partidas he perdido                  |\n");
        printf("|5. Salir                                        |\n");
        printf("|------------------------------------------------|\n");
        scanf("%d", &opcion);
        getchar();

        switch(opcion) {
            case 1:
            	system("cls");
                printf("Introduce una palabra para jugar: ");
                scanf("%s", palabra);
                getchar();

                for (i = 0; i < strlen(palabra); i++) {
                    palabraMostrada[i] = '-';
                }
                palabraMostrada[strlen(palabra)] = '\0';

                vidas = 6;
                palabraAdivinada = false;


                do {
                	if (vidas >= 1 && vidas <= 6) {
		                if (vidas == 6) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|\n");
		                    printf("|\n");
		                    printf("|\n");
		                    printf("|\n");
		                } else if (vidas == 5) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|      0\n");
		                    printf("|\n");
		                    printf("|\n");
		                    printf("|\n");
		                } else if (vidas == 4) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|      0\n");
		                    printf("|      |\n");
		                    printf("|\n");
		                    printf("|\n");
		                } else if (vidas == 3) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|      0\n");
		                    printf("|     /|\n");
		                    printf("|\n");
		                    printf("|\n");
		                } else if (vidas == 2) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|      0\n");
		                    printf("|     /|\\\n");
		                    printf("|\n");
		                    printf("|\n");
		                } else if (vidas == 1) {
		                    printf("-------\n");
		                    printf("|      |\n");
		                    printf("|      0\n");
		                    printf("|     /|\\\n");
		                    printf("|     /  \n");
		                    printf("|\n");
		                }
		        	}
                    printf("\nPalabra: %s\n", palabraMostrada);
                    printf("Vidas restantes: %d\n", vidas);
                    printf("Introduce una letra para adivinar: ");
                    scanf(" %c", &letra);
                    getchar();
                    system("cls");

                    acierto = false;
                    for (i = 0; i < strlen(palabra); i++) {
                        if (palabra[i] == letra && palabraMostrada[i] == '-') {
                            palabraMostrada[i] = letra;
                            acierto = true;
                        }
                    }

                    if (!acierto) {
                        vidas--;
                    }

                    if (strcmp(palabra, palabraMostrada) == 0) {
                        palabraAdivinada = true;
                    }

                } while (vidas > 0 && !palabraAdivinada);

                if (vidas == 0) {
                    printf("-------\n");
                    printf("|      |\n");
                    printf("|      0\n");
                    printf("|     /|\\\n");
                    printf("|     / \\\n");
                    printf("|\n");
                    printf("Mala suerte, has perdido esta vez\n");
                    printf("La palabra era: %s\n", palabra);
                    partidasJugadas++;
                    partidasPerdidas++;
                    system("pause");
                    system("cls");
                }

                if (palabraAdivinada) {
                    printf("Enhorabuena, has ganado el juego del ahorcado\n");
                    partidasJugadas++;
                    partidasGanadas++;
                }
                system("pause");
                break;

            case 2:
                printf("Has jugado un total de %d partidas\n", partidasJugadas);
                system("pause");
                system("cls");
                break;

            case 3:
                printf("Has ganado un total de %d partidas\n", partidasGanadas);
                system("pause");
                system("cls");
                break;

            case 4:
                printf("Has perdido un total de %d partidas\n", partidasPerdidas);
                system("pause");
                system("cls");
                break;

            case 5:
                printf("Gracias por jugar, adios\n");
                return 0;

            default:
                printf("Opcion no valida\n");
                system("pause");
                system("cls");
        }
    } while (true);

    return 0;
}
