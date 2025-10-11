package Examen;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k, l;
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				if((i==2 && j>=3 && j<=7) || (i==3 && j>=4 && j<=6) || (i==4 && j==5) || (i==6 && j==5) || (i==7 && j>=4 && j<=6) || (i==8 && j>=3 && j<=7)) {
					System.out.print("  ");
				} else if((i==3 && j==2) || (i==4 && j>=2 && j<=3) || (i==5 && j>=2 && j<=4) || (i==6 && j>=2 && j<=3) || (i==7 && j==2)) {
					System.out.print("  ");
				} else if((i==3 && j==8) || (i==4 && j>=7 && j<=8) || (i==5 && j>=6 && j<=8) || (i==6 && j>=7 && j<=8) || (i==7 && j==8)) {
					System.out.print("  ");
				} else {			
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
