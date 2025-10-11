package Ejer2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	/*
    	Un cliente requiere un programa sencillo en Java que permita registrar y gestionar información de estudiantes. La aplicación debe incluir las siguientes funcionalidades:

		1. **Registrar información de un estudiante**: El sistema debe solicitar el nombre y la edad de cada estudiante, y almacenarlos en el programa.
		
		2. **Mostrar información del estudiante**: Almacenada la información, el programa debe mostrar el nombre y la edad de cada estudiante.
		
		3. **Verificar mayoría de edad**: La aplicación debe verificar si un estudiante es mayor de edad (18 años o más) e indicarlo claramente.
		
		4. **Comparar edades**: Al registrar dos estudiantes, el sistema debe permitir comparar sus edades y mostrar cuál de ellos es mayor.
		
		Especificaciones técnicas:
		- Los datos y métodos principales estarán en una clase llamada `Alumno`.
		- La clase `Alumno` debe tener métodos para inicializar los datos (constructor), mostrar la información y verificar la mayoría de edad.
		- La comparación entre las edades de dos estudiantes se realizará en un método estático.
		- La clase `Main` contendrá el método principal (`main`), desde el cual se crearán y manipularán dos objetos de tipo `Alumno`. 
    	*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del primer estudiante: ");
        String name1 = sc.nextLine();
        System.out.print("Ingrese la edad del primer estudiante: ");
        int age1 = sc.nextInt();
        sc.nextLine(); 
        
        Alumno student1 = new Alumno(name1, age1);
        
        System.out.print("Ingrese el nombre del segundo estudiante: ");
        String name2 = sc.nextLine();
        System.out.print("Ingrese la edad del segundo estudiante: ");
        int age2 = sc.nextInt();
        
        Alumno student2 = new Alumno(name2, age2);
        
        System.out.println("\nInformacion de los estudiantes:\n");
        student1.showInfo();
        System.out.println("\n");
        student2.showInfo();
        System.out.println("\n");
        
        Alumno.comparateAges(student1, student2);
        
        sc.close();
    }
}