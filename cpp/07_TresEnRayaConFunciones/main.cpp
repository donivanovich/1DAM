#include <cstdio>
#include <cstdlib>
#include <ctime>

void inicializarMapa(char mapa[3][3]);
void imprimirMapa(char mapa[3][3]);
bool verificarGanador(char mapa[3][3], char jugador);
bool realizarMovimiento(char mapa[3][3], int posicion, char jugador);
int obtenerMovimientoCPU(char mapa[3][3]);
void jugarContraCPU(int &partidas);
void jugarContraJugador(int &partidas);
void mostrarMenu();

int main() {
    int opcion, partidas = 0;
    bool continuar = true;

    printf("Bienvenido al Tres en Raya\n\n");
    system("pause");
    system("cls");

    while (continuar) {
        mostrarMenu();
        scanf("%d", &opcion);
        system("cls");

        switch (opcion) {
            case 1:
                jugarContraCPU(partidas);
                break;
            case 2:
                jugarContraJugador(partidas);
                break;
            case 3:
                printf("Has jugado un total de %d partidas\n", partidas);
                system("pause");
                system("cls");
                break;
            case 4:
                continuar = false;
                printf("Gracias por jugar\n");
                break;
            default:
                printf("Error, selecciona un numero valido\n");
                break;
        }
    }
    return 0;
}

void inicializarMapa(char mapa[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            mapa[i][j] = '-';
        }
    }
}

void imprimirMapa(char mapa[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%c ", mapa[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

bool verificarGanador(char mapa[3][3], char jugador) {
    return (mapa[0][0] == jugador && mapa[0][1] == jugador && mapa[0][2] == jugador) ||
           (mapa[1][0] == jugador && mapa[1][1] == jugador && mapa[1][2] == jugador) ||
           (mapa[2][0] == jugador && mapa[2][1] == jugador && mapa[2][2] == jugador) ||
           (mapa[0][0] == jugador && mapa[1][0] == jugador && mapa[2][0] == jugador) ||
           (mapa[0][1] == jugador && mapa[1][1] == jugador && mapa[2][1] == jugador) ||
           (mapa[0][2] == jugador && mapa[1][2] == jugador && mapa[2][2] == jugador) ||
           (mapa[0][0] == jugador && mapa[1][1] == jugador && mapa[2][2] == jugador) ||
           (mapa[0][2] == jugador && mapa[1][1] == jugador && mapa[2][0] == jugador);
}

bool realizarMovimiento(char mapa[3][3], int posicion, char jugador) {
    int fila = (posicion - 1) / 3;
    int columna = (posicion - 1) % 3;

    if (posicion < 1 || posicion > 9 || mapa[fila][columna] != '-') {
        return false;
    }

    mapa[fila][columna] = jugador;
    return true;
}

int obtenerMovimientoCPU(char mapa[3][3]) {
    int posicion;
    do {
        posicion = rand() % 9 + 1;
    } while (!realizarMovimiento(mapa, posicion, 'O'));
    return posicion;
}

void jugarContraCPU(int &partidas) {
    char mapa[3][3];
    int posicion;
    bool turnoJugador = true;

    inicializarMapa(mapa);

    while (true) {
        imprimirMapa(mapa);

        if (turnoJugador) {
            printf("Selecciona una casilla (1-9): ");
            scanf("%d", &posicion);

            if (!realizarMovimiento(mapa, posicion, 'X')) {
                printf("Movimiento invalido, intentalo de nuevo.\n");
                continue;
            }
        } else {
            printf("La CPU esta pensando\n");
            obtenerMovimientoCPU(mapa);
        }

        system("cls");

        if (verificarGanador(mapa, turnoJugador ? 'X' : 'O')) {
            imprimirMapa(mapa);
            printf("%s ha ganado\n", turnoJugador ? "Jugador" : "CPU");
            partidas++;
            break;
        }

        turnoJugador = !turnoJugador;
    }
    system("pause");
    system("cls");
}

void jugarContraJugador(int &partidas) {
    char mapa[3][3];
    int posicion;
    bool turnoJugador1 = true;

    inicializarMapa(mapa);

    while (true) {
        imprimirMapa(mapa);
        printf("Turno del jugador %d\n", turnoJugador1 ? 1 : 2);
        printf("Selecciona una casilla (1-9): ");
        scanf("%d", &posicion);

        if (!realizarMovimiento(mapa, posicion, turnoJugador1 ? 'X' : 'O')) {
            printf("Movimiento invalido, intentalo de nuevo.\n");
            continue;
        }

        system("cls");

        if (verificarGanador(mapa, turnoJugador1 ? 'X' : 'O')) {
            imprimirMapa(mapa);
            printf("Jugador %d ha ganado\n", turnoJugador1 ? 1 : 2);
            partidas++;
            break;
        }

        turnoJugador1 = !turnoJugador1;
    }
    system("pause");
    system("cls");
}

void mostrarMenu() {
    printf("         Selecciona\n");
    printf("____________________________\n");
    printf("| 1. Jugar contra CPU      |\n");
    printf("| 2. Jugar contra jugador  |\n");
    printf("| 3. Partidas jugadas      |\n");
    printf("| 4. Salir                 |\n");
    printf("|__________________________|\n");
    printf("Opcion: ");
}
