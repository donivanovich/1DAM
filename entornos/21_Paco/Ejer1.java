package Paco;

public class Ejer1 {
	
	private static Mensajes mismensajes;
	
	public static void main(String[] args) {
		
		mismensajes= new Mensajes();
		
		mismensajes.mensaje("Hola prueba Clases");
		mismensajes.mensaje_rojo("Adios a las clases");
		mismensajes.mensaje_info("Dale al ok o a la x si eres imbecil");
		
	}
	
	public static void mensaje(String msg) {
		System.out.println(msg);
	}

}
