package Discoteca;

public class Club {
	private Socio s1, s2, s3;
	
	public Club(){
		System.out.println("Registro Socio 1");
		s1 = new Socio();
		System.out.println("Registro Socio 2");
		s2 = new Socio();
		System.out.println("Registro Socio 3");
		s3 = new Socio();
	}
	
	public void MasAntiguo() {
		Socio mayor = s1;
		
		if(s2.getAntiguedad() > mayor.getAntiguedad()) {
			mayor = s2;
		}
		
		if(s3.getAntiguedad() > mayor.getAntiguedad()) {
			mayor = s3;
		}
		
		System.out.println(mayor.getNombre() + " es el socio con más antiguedad con " + mayor.getAntiguedad() + " años.");
	}

	public static void main(String[] args) {
		// Plantear una clase Club y otra clase Socio. La clase Socio debe tener los siguientes atributos privados:
		// nombre y la antiguedad en el Club (en años). En el constructor pedir la carga del nombre y su antiguedad.
		// La clase Club debe tener como atributos 3 objetos de la clase Socio. Definir una funcion para
		// imprimir el nombre del socio con mayor antiguedad en el club.
		
		Club club = new Club();
		club.MasAntiguo();
	}

}
