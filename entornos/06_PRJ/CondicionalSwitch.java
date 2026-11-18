import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// Introduzca un número e indique por pantalla el mes del año correspondiente a
		// ese número. Si terminas rápido incluye la estación del año (Primavera, Verano....)
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 12: ");
        int numero = scanner.nextInt();
        
        String mes = "";
        String estacion = "";

        switch (numero) {
            case 1:
                mes = "Enero";
                estacion = "Invierno";
                break;
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                mes = "Marzo";
                estacion = "Primavera";
                break;
            case 4:
                mes = "Abril";
                estacion = "Primavera";
                break;
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
                break;
            case 6:
                mes = "Junio";
                estacion = "Verano";
                break;
            case 7:
                mes = "Julio";
                estacion = "Verano";
                break;
            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;
            case 9:
                mes = "Septiembre";
                estacion = "Otoño";
                break;
            case 10:
                mes = "Octubre";
                estacion = "Otoño";
                break;
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;
            case 12:
                mes = "Diciembre";
                estacion = "Invierno";
                break;
            default:
                System.out.println("Número inválido. Por favor, introduce un número del 1 al 12.");
                return;
        }
        System.out.println("El mes correspondiente es: " + mes);
        System.out.println("La estación del año es: " + estacion);
    }
}