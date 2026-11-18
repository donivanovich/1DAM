#include <iostream>
#include <donnie.h>
#include <stdlib.h>
#include <time.h>

/* Tenemos que desarrollar un simulador de combates con
monstruos, al principio el simulador tiene que pedir nuestras estadísticas (ataque,
defensa y vida) (ataque y defensa puede ser de 1 a 100 y la vida de 100 a 1000)

y luego generar 10 monstruos con estadísticas aleatorias, el daño del combate
se determina restándole a la defensa del atacado el ataque del que ataca y al
que primero se le acabe la vida pierde. 

El simulador tiene que empezar a simular cada combate empezando por el monstruo 
más débil (el que la suma de si ataque y defensa sea más baja)
y nos dirá los monstruos que nuestro personaje ha
logrado derrotar (la vida se reinicia en cada combate) */

typedef struct {
	char nombre[50];
	int ataque;
	int defensa;
	int vida;
}Monstruo;

int main() {
	Monstruo m[11];
	Monstruo aux;
	int i, j, rngAtaque, rngDefensa, rngVida;
	int resetVida;
	
	srand(time(NULL));
	
	do{
		printf("Nombre de tu monstruo: ");
		scanf("%s", m[10].nombre);
		
		printf("Ataque de %s: ", m[10].nombre);
		do{
			scanf("%d", &m[10].ataque);
		} while(m[10].ataque < 1 || m[10].ataque > 100);
		
		printf("Defensa de %s: ", m[10].nombre);
		do{
			scanf("%d", &m[10].defensa);
		} while(m[10].defensa < 1 || m[10].defensa > 100);
		
		printf("Vida de %s: ", m[10].nombre);
		do{
			scanf("%d", &m[10].vida);
		} while(m[10].vida < 100 || m[10].vida > 1000);
		
		system("cls");
		resetVida = m[10].vida;
		
		strcpy(m[0].nombre, "Paco");
		strcpy(m[1].nombre, "Leila");
		strcpy(m[2].nombre, "David");
		strcpy(m[3].nombre, "Badia");
		strcpy(m[4].nombre, "Olga");
		strcpy(m[5].nombre, "Gabriel");
		strcpy(m[6].nombre, "Guille");
		strcpy(m[7].nombre, "Andres");
		strcpy(m[8].nombre, "Javier");
		strcpy(m[9].nombre, "Ivan");
		
		for(i=0; i<10; i++){
			rngAtaque = (rand() % 100) + 1;
			m[i].ataque = rngAtaque;
			rngDefensa = (rand() % 100) + 1;
			m[i].defensa = rngDefensa;
			rngVida = (rand() % 901) + 100;
			m[i].vida = rngVida;
		}
		
		for(i=0; i<9; i++){
			for(j=1 + i; j<10; j++){
				if((m[i].ataque + m[i].defensa) > (m[j].ataque + m[j].defensa)){
					aux = m[i];
					m[i] = m[j];
					m[j] = aux;
				}
			}
		}
		
		for(i=0; i<10; i++){
			m[10].vida = resetVida;
			printf("[Te has encontrado a %s]\n\n", m[i].nombre);
			
			do{
				if(m[10].vida > 0){
					printf("%s[%d] ha atacado a %s[%d]\n", m[10].nombre, m[10].vida, m[i].nombre, m[i].vida);
					if(m[10].ataque - m[i].defensa <= 0){
						m[i].vida -= 10;
					} else {
						m[i].vida -= m[10].ataque - m[i].defensa;	
					}
				} 
				
				if(m[i].vida > 0){
					printf("%s[%d] ha atacado a %s[%d]\n", m[i].nombre, m[i].vida, m[10].nombre, m[10].vida);
					if(m[i].ataque - m[10].defensa <= 0){
						m[10].vida -= 10;
					} else {
						m[10].vida -= m[i].ataque - m[10].defensa;
					}
				} else {
					printf("\n[Has derrotado a %s]\n", m[i].nombre);
				}
				
				if(m[10].vida <= 0){
					printf("\n[Has sido derrotado por %s]\n\n", m[i].nombre);
				}
				
			} while(m[i].vida > 0 && m[10].vida > 0);
			
			system("pause");
			system("cls");
			
			if(m[10].vida <= 0){
			    break;
			}
		}
		
		if(m[0].vida <= 0 || m[1].vida <= 0 || m[2].vida <= 0 || m[3].vida <= 0 || m[4].vida <= 0 || m[5].vida <= 0 || m[6].vida <= 0 || m[7].vida <= 0 || m[8].vida <= 0 || m[9].vida <= 0){
			printf("{Has logrado vencer a ");
			for(i = 0; i < 10; i++){
				if(m[i].vida <= 0){
					printf("%s", m[i].nombre);
					for(j = i + 1; j < 10; j++){
						if(m[j].vida <= 0){
							printf(", ");
							break;
						}
					}
				}
			}
			printf("}\n\n");
			system("pause");
			system("cls");
		}
		
	} while(true);
	
	return 0;
}
