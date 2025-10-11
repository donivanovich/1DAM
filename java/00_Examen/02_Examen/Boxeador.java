package Examen;

public class Boxeador {
	int vida=3;
	String nombre;
	
	public Boxeador(String nombre) {
		super();
		this.nombre = nombre;
	}
	//Estados del boxeador 
	//1 --> Ataca   2 --> Defiende  3 --> encaja
	public int pelear() {
		int estado = (int) (Math.random()*3) +1;
		System.out.print(this.nombre + " está ");
		switch (estado) {
		case 1:
			System.out.println("atacando");
			break;
		case 2:
			System.out.println("defendiendo");
			break;	
		case 3:
			System.out.println("encajando");
			break;
		default:
			break;
		}
		return estado;
		
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int golpe) {
		this.vida -= golpe;
		System.out.println(nombre + "vida: " + vida ); 
	}
	
	
}
