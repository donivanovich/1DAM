package TresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char[][] tablero = new char[3][3];
		int i, j;
		int j1, j2;
		boolean ganaJ1 = false, ganaJ2 = false;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				tablero[i][j] = '-';
			}
		}
		
		do {
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					
					System.out.print("[" + tablero[i][j] + "]");
				}
				System.out.println();
			}
			
			do {
				System.out.println();
				System.out.print("J1 (1-9): ");
				j1 = sc.nextInt();
				System.out.println();
			} while(j1 < 1 || j1 > 9);
			
			if (j1 == 7 && tablero[0][0] == '-') {
				tablero[0][0] = 'O';
			} else if (j1 == 8 && tablero[0][1] == '-') {
				tablero[0][1] = 'O';
			} else if (j1 == 9 && tablero[0][2] == '-') {
				tablero[0][2] = 'O';
			} else if (j1 == 4 && tablero[1][0] == '-') {
				tablero[1][0] = 'O';
			} else if (j1 == 5 && tablero[1][1] == '-') {
				tablero[1][1] = 'O';
			} else if (j1 == 6 && tablero[1][2] == '-') {
				tablero[1][2] = 'O';
			} else if (j1 == 1 && tablero[2][0] == '-') {
				tablero[2][0] = 'O';
			} else if (j1 == 2 && tablero[2][1] == '-') {
				tablero[2][1] = 'O';
			} else if (j1 == 3 && tablero[2][2] == '-') {
				tablero[2][2] = 'O';
			} else {
				System.err.println("Error");
			}
			
			if(tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O') {
				ganaJ1 = true;
			} else if(tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O') {
				ganaJ1 = true;
			} else if(tablero[0][0] == 'O' && tablero[1][0] == 'O' && tablero[2][0] == 'O') {
				ganaJ1 = true;
			} else if(tablero[0][1] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == 'O') {
				ganaJ1 = true;
			} else if(tablero[0][2] == 'O' && tablero[1][2] == 'O' && tablero[2][2] == 'O') {
				ganaJ1 = true;
			} else if(tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O') {
				ganaJ1 = true;
			} else if(tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[1][2] == 'O') {
				ganaJ1 = true;
			} else if(tablero[2][0] == 'O' && tablero[2][1] == 'O' && tablero[2][2] == 'O') {
				ganaJ1 = true;
			}
			
			if(!ganaJ1) {
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						
						System.out.print("[" + tablero[i][j] + "]");
					}
					System.out.println();
				}
					
				do {
					System.out.println();
					System.out.print("J2 (1-9): ");
					j2 = sc.nextInt();
					System.out.println();
				} while(j2 < 1 || j2 > 9);
				
				if (j2 == 7 && tablero[0][0] == '-') {
					tablero[0][0] = 'X';
				} else if (j2 == 8 && tablero[0][1] == '-') {
					tablero[0][1] = 'X';
				} else if (j2 == 9 && tablero[0][2] == '-') {
					tablero[0][2] = 'X';
				} else if (j2 == 4 && tablero[1][0] == '-') {
					tablero[1][0] = 'X';
				} else if (j2 == 5 && tablero[1][1] == '-') {
					tablero[1][1] = 'X';
				} else if (j2 == 6 && tablero[1][2] == '-') {
					tablero[1][2] = 'X';
				} else if (j2 == 1 && tablero[2][0] == '-') {
					tablero[2][0] = 'X';
				} else if (j2 == 2 && tablero[2][1] == '-') {
					tablero[2][1] = 'X';
				} else if (j2 == 3 && tablero[2][2] == '-') {
					tablero[2][2] = 'X';
				} else {
					System.err.println("Error");
				}
				
				if(tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
					ganaJ2 = true;
				} else if(tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X') {
					ganaJ2 = true;
				} else if(tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') {
					ganaJ2 = true;
				} else if(tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X') {
					ganaJ2 = true;
				} else if(tablero[0][2] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X') {
					ganaJ2 = true;
				} else if(tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
					ganaJ2 = true;
				} else if(tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X') {
					ganaJ2 = true;
				} else if(tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X') {
					ganaJ2 = true;
				}
			}
			
		} while (!ganaJ1 && !ganaJ2);
		
		if(ganaJ1 == true) {
			System.err.println("Ha ganado J1");
		}
		
		if(ganaJ2 == true) {
			System.err.println("Ha ganado J2");
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				
				System.out.print("[" + tablero[i][j] + "]");
			}
			System.out.println();
		}
	}

}
