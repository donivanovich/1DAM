package Rep02Cadenas;

public class Javijesji {

	public static void main(String[] args) {
		int i,j, k, l;
		
		for(i=1; i<=6; i++) {
			for(j=6; j>i; j--) {
				System.out.print("  ");
			}
			for(k=1; k<i; k++) {
				if(i==3 && k==2 || i==4 && k>=2 && k<=3 || i==5 && k>=2 && k<=4) {
					System.out.print("  ");
				} else { 
					System.out.print("* ");
				}
			}
			for(l=2; l<i; l++) {
				if(i==4 && l==2 || i==5 && l>=2 && l<=3) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
					
			}
			System.out.println();
		}

	}

}
