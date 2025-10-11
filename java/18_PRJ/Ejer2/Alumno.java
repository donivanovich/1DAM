package Ejer2;

public class Alumno {

    private String name;
    private int age;
    private boolean isLegalAge;

    public Alumno(String name, int age) {
        this.name = name;
        if(isValidAge(age)) {
            this.age = age;
        } else {
            System.out.println("La edad del alumno debe ser mayor que 0");
            this.age = 0; 
        }
        
        this.isLegalAge = this.age >= 18;
    }
    
    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Mayor de edad: " + (isLegalAge ? "Si" : "No"));
    }
    
    public int getAge() {
        return age;
    }
    
    private boolean isValidAge(int age) {
        return age > 0;
    }
    
    public static void comparateAges(Alumno student1, Alumno student2) {
        if (student1.age > student2.age) {
            System.err.println(student1.name + " es mayor que " + student2.name);
        } else if (student1.age < student2.age) {
            System.err.println(student2.name + " es mayor que " + student1.name);
        }
    }
}
