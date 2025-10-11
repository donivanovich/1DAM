package Dados;

public class Dado {
	int valor;
	
	public Dado() {
		valor = (int) (Math.random()*6)+1;
	}
	
	public int getValor() {
		return valor;
	}
}
