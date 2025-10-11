#include <iostream>
#include <cstdlib>
#include <ctime>

/* 
	Piedra, papel o tijeracon los siguiente requisitos
	
	- Menu:
		1. Jugar
		2. Cuantas partidas he jugado
		3. Salir
		
	Cuando jugamos, tanto la maquina como nosotros tenemos 3 vidas, pierde 
	el que se quede sin vidas y al terminar una partida volvemos al menu	

*/

int main() {
	
	int jugador, maquina, seleccion;
    const char* opciones[] = {"piedra", "papel", "tijera"};
    int contador = 0;
    int vidas_jugador = 3, vidas_maquina = 3;
    
    while (true) {
        printf("|Bienvenido al Piedra, Papel o Tijera, selecciona para continuar:|\n");
        printf("|----------------------------------------------------------------|\n");
        printf("| 1. Jugar                                                       |\n");
        printf("| 2. Cuantas partidas he jugado?                                 |\n");
        printf("| 3. Salir                                                       |\n");
        printf("|----------------------------------------------------------------|\n");
        scanf("%d", &seleccion);

        switch (seleccion) {
            case 1:
                vidas_jugador = 3;
                vidas_maquina = 3;
                while (vidas_jugador > 0 && vidas_maquina > 0) {
                    printf("Elige:\nPiedra = 1\nPapel = 2\nTijera = 3\n");
                    scanf("%d", &jugador);

                    if (jugador < 1 || jugador > 3) {
                        printf("Introduce una opcion valida\n");
                        continue;
                    }

                    srand(time(0));
                    maquina = rand() % 3;

                    printf("La maquina elige: %s\n", opciones[maquina]);

                    if (jugador == maquina) {
                        printf("Empate\n");
                        contador++;
                    } else if ((jugador == 1 && maquina == 3) || 
                               (jugador == 2 && maquina == 1) || 
                               (jugador == 3 && maquina == 2)) {
                        printf("Has ganado esta ronda\n");
                        vidas_maquina--;
                        contador++;
                    } else {
                        printf("Perdiste esta ronda\n");
                        vidas_jugador--;
                        contador++;
                    }

                    printf("Vidas jugador: %d\nVidas maquina: %d\n", vidas_jugador, vidas_maquina);
                }

                if (vidas_jugador > 0) {
                    printf("Ganaste\n");
                } else {
                    printf("Perdiste\n");
                }

                break;

            case 2:
                printf("Has jugado un total de %d partida/s\n", contador);
                break;

            case 3:
                printf("Saliendo del juego...\n");
                return 0;

            default:
                printf("Opcion no valida, intentalo de nuevo.\n");
        }
    }

    return 0;
}
