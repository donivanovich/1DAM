package Dados;

public class Juego {
	
	private static Juego mi_juego;	
	private static Dado dado1, dado2;
	private static int result;
	
	public Juego() { //constructor
		dado1 = new Dado();
		dado2 = new Dado();
	}
	
	public static void main(String[] args) { // main
		
		mi_juego = new Juego();
		result = dado1.getValor() + dado2.getValor();
		if(result > 8) {
			System.out.println("Enhorabuena has ganado");
		} else {
			System.out.println("Lo siento has perdido");
		}
	}
}
