import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String[] posibilidades = {"pescabichos", "zangano", "macetero"};
        String palabra = posibilidades[(int) (Math.random() * posibilidades.length)];
        char[] palabraOculta = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta[i] = '_';
        }

        int vidas = 5;
        boolean palabraAdivinada = false;
        String letrasAdivinadas = "";

        System.out.println("Esto es el juego del ahorcado, agarrate a la silla");
        System.out.println("Dispones de 5 vidas, si pierdes no me extrañaria");       
        
        while (vidas > 0 && !palabraAdivinada) {
        	System.out.println("\n");
            System.out.println("Progreso: " + new String(palabraOculta));
            System.out.println("Te quedan " + vidas + " vidas");
            System.out.println("Has adivinado las letras " + letrasAdivinadas);
            System.out.print("Escribe una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            if (letrasAdivinadas.indexOf(letra) != -1) {
                System.out.println("Ya has usado la letra '" + letra + "' prueba con otra, melon");
                continue;
            }

            letrasAdivinadas += letra;

            boolean acierto = false;
            
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                vidas--;
                System.out.println("La letra '" + letra + "' no está en la palabra.");
            }

            palabraAdivinada = palabra.equals(new String(palabraOculta));
        }

        if (palabraAdivinada) {
        	System.out.println("\n");
            System.out.println("Has ganado, ahora vete hacker ");
        } else {
        	System.out.println("\n");
            System.out.println("Ni al ahorcado puedes ganar, lamentable (la palabra era " + palabra +"), no te preocupes, es parte del proceso");
        }

        scanner.close();
    }
}