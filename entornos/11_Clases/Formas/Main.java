package Ejer1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	/*
    	- Añadir los getters y setters a todos los atributos.
 
		- Crear nuevo atributo PRIVADO llamado "tipo", que sera un String que guarde el tipo de triangulo que es segun sus lados (Equilatero, Isosceles o Escaleno).
		Ademas este atributo solo tendra getter y no tendra setter, ya que su valor solo cambia en funcion de los lados del triangulo. Su valor se setteara en el constructor.
		   
		- Nuevo metodo PRIVADO "calcularTipo" que usaremos para calular el tipo de triangulo segun sus lados, este metodo no devuelve nada ni recibe nada como parametro, simplemente
		utiliza los atributos de la clase.
		   
		- En los setters de los lados del triangulo habra que comprobar que no introduzcan valores negativos ni 0, como esto habra que repetirlo 3 veces, como ya hemos comentado en clase
		puede ser que si cambiamos esa regla por algun motivo tendremos que cambiarla en los 3 sitios,
 		de manera que de esto se encargara otra funcion privada llamada "esLadoValido" que devolvera un booleano y recibira como parametro el valor a comprobar.
	    Para usar este metodo en el constructor sin llenarlo de ifs, utilizaremos el operador ternario explicado en clase (? :), aqui teneis un ejemplo:
	   	" this.lado1 = esLadoValido(lado1) ? lado1 : 1", le damos valor de 1 por defecto si no es un valor valido.
   		Tambien debreis usarla en los setters de los lados.
		   
		- Por ultimo recordar que en los setters de los lados habra que comprobar de nuevo el tipo del triangulo ya que este ha podido cambiar
    	*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado 1 del triangulo: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Ingrese el lado 2 del triangulo: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Ingrese el lado 3 del triangulo: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        if (triangulo.getTipo().equals("Inválido")) {
            System.out.println("No se puede crear un triangulo con esos lados.");
        } else {
            System.out.println("Tipo de triangulo: " + triangulo.getTipo());
            
            System.out.println();
            
            System.out.print("Ingrese el nuevo lado 1: ");
            triangulo.setLado1(scanner.nextDouble());
            
            System.out.print("Ingrese el nuevo lado 2: ");
            triangulo.setLado2(scanner.nextDouble());
            
            System.out.print("Ingrese el nuevo lado 3: ");
            triangulo.setLado3(scanner.nextDouble());
            
            if (triangulo.getTipo().equals("Invalido")) {
                System.out.println("No se puede crear un triangulo con esos lados.");
            } else {
                System.out.println("Tipo de triangulo: " + triangulo.getTipo());
            }
        }

        scanner.close();
    }
}