package Barcos;

import java.util.Scanner;
import java.util.Random;

public class Barcos {

	public static void main(String[] args) {
		// 3 barcos de 1, 2 barcos de 2 y un barco de 3 en mapa de 10x10
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		char[][] tablero = new char[10][10];
		char[][] radar = new char[10][10];
		int vidas = 10, x, y;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tablero[i][j] = ' ';
				radar[i][j] = ' ';
			}
		}
		
		int cantidad1 = 3, cantidad2 = 2, cantidad3 = 1;
        int tamano1 = 1, tamano2 = 2, tamano3 = 3;
        
        for (int i = 0; i < cantidad1; i++) {
            boolean colocado;
            do {
                int xPos = rand.nextInt(10);
                int yPos = rand.nextInt(10);
                colocado = tablero[xPos][yPos] == ' ';
                if (colocado) {
                    tablero[xPos][yPos] = '#';
                }
            } while (!colocado);
        }
        
        for (int i = 0; i < cantidad2; i++) {
            boolean colocado;
            do {
            	
                int xPos = rand.nextInt(10);
                int yPos = rand.nextInt(10);
                int direccion = rand.nextInt(2);
                colocado = true;
                
                if (direccion == 0) { 
                    if (yPos + tamano2 > 10) {
                        colocado = false;
                    } else {
                        for (int j = 0; j < tamano2; j++) {
                            if (tablero[xPos][yPos + j] == '#') {
                                colocado = false;
                                break;
                            }
                        }
                    }
                    if (colocado) {
                        for (int j = 0; j < tamano2; j++) {
                            tablero[xPos][yPos + j] = '#';
                        }
                    }
                } else { 
                    if (xPos + tamano2 > 10) {
                        colocado = false;
                    } else {
                        for (int j = 0; j < tamano2; j++) {
                            if (tablero[xPos + j][yPos] == '#') {
                                colocado = false;
                                break;
                            }
                        }
                    }
                    if (colocado) {
                        for (int j = 0; j < tamano2; j++) {
                            tablero[xPos + j][yPos] = '#';
                        }
                    }
                }
            } while (!colocado);
        }
        
        for (int i = 0; i < cantidad3; i++) {
            boolean colocado;
            do {
                int xPos = rand.nextInt(10);
                int yPos = rand.nextInt(10);
                int direccion = rand.nextInt(2);
                colocado = true;
                
                if (direccion == 0) { 
                    if (yPos + tamano3 > 10) {
                        colocado = false;
                    } else {
                        for (int j = 0; j < tamano3; j++) {
                            if (tablero[xPos][yPos + j] == '#') {
                                colocado = false;
                                break;
                            }
                        }
                    }
                    if (colocado) {
                        for (int j = 0; j < tamano3; j++) {
                            tablero[xPos][yPos + j] = '#';
                        }
                    }
                } else { 
                    if (xPos + tamano3 > 10) {
                        colocado = false;
                    } else {
                        for (int j = 0; j < tamano3; j++) {
                            if (tablero[xPos + j][yPos] == '#') {
                                colocado = false;
                                break;
                            }
                        }
                    }
                    if (colocado) {
                        for (int j = 0; j < tamano3; j++) {
                            tablero[xPos + j][yPos] = '#';
                        }
                    }
                }
            } while (!colocado);
        }
		
		
		
		do {
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					System.out.print("[" + radar[i][j] + "]");
				}
				System.out.println();
			}
			
			do {
				System.out.print("Dame x (0-9): ");
				x = sc.nextInt();
			} while (x < 0 || x > 9);
				
			do {
				System.out.print("Dame y (0-9): ");
				y = sc.nextInt();
			} while (y < 0 || y > 9);
			System.out.println();
			
			
			if(tablero[x][y] == ' ') {
				radar[x][y] = '·';
				System.out.println("[Agua]");
			} else if(tablero[x][y] == '#') {
				radar[x][y] = 'X';
				vidas--;
				System.err.println("[Golpe]");
			}
		} while (vidas > 0);
			
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("[" + radar[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("{Felicidades has ganado el hundir la flota}");
	}

}
