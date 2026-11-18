#include <stdio.h>
#include <stdlib.h>

/*  Código que imprima por pantalla un tablero de 10 x 10 que tenga
    un * en la pos 0 0, el * se tiene que mover cada vez que pulsemos
    una de las FLECHAS del teclado (no puede salirse de los limites
    del tablero)
    -------------
    | *         |
    |            |
    |            |
    |            |
    |            |
    ------------- 
*/

int main() {
    char tablero[10][10];
    int x, y, i, j = 0; 
    char opcion;
    bool continuar = true;

    for (i = 0; i < 10; i++) {
        for (j = 0; j < 10; j++) {
            tablero[i][j] = ' ';
        }
    }
    y=0;
    x=0;
    tablero[x][y] = '*';

    while (continuar) {
    	
        printf("|--------------------|\n");
        for (i = 0; i < 10; i++) {
            printf("|");
            for (j = 0; j < 10; j++) {
                printf("%c ", tablero[i][j]);
            }
            printf("|\n");
        }
        printf("|--------------------|\n");

        printf("\nMuevete con W, A, S, D (o 'e' para salir): ");
        scanf(" %c", &opcion);

        tablero[x][y] = ' ';

        switch (opcion) {
            case 'w':
            case 'W':
                if (x > 0) x--; 
                break;
            case 's':
            case 'S':
                if (x < 10 - 1) x++;
                break;
            case 'a':
            case 'A':
                if (y > 0) y--;
                break;
            case 'd':
            case 'D':
                if (y < 10 - 1) y++;
                break;
            case 'e':
            case 'E':
                return 0; 
            default:
                printf("Intentalo de nuevo\n");
                break;
        }

        tablero[x][y] = '*';
        system("cls");
    }

    return 0;
}
