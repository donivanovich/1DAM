import java.util.Scanner;

public class CondicionalAnidadoEjer2 {

	public static void main(String[] args) {
		// Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le 
		// realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por 
		// teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
		// Nivel máximo:      Porcentaje>=90%.
		// Nivel medio:       Porcentaje>=75% y <90%.
		// Nivel regular:     Porcentaje>=50% y <75%.
		// Fuera de nivel:    Porcentaje<50%.
		
        Scanner sc = new Scanner(System.in);

        int preguntas;
        int correctas;

        System.out.println("Introduce el numero de preguntas: ");
        preguntas = sc.nextInt();

        System.out.println("Introduce el numero de preguntas correctas: ");
        correctas = sc.nextInt();

        if (preguntas > 0 && correctas <= preguntas) {
            float porcentaje = ((float) correctas / preguntas) * 100;

            if (porcentaje >= 90) {
                System.out.println("Nivel máximo");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular");
            } else {
                System.out.println("Fuera de nivel");
            }
        } else {
            System.err.println("Cantidad ingresada incorrecta");
        }
    }
}
