package Ejer1;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3) {
        if (esLadoValido(lado1) && esLadoValido(lado2) && esLadoValido(lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
        	System.out.println("Los lados del triangulo deben ser mayores que 0.");
        }
        calcularTipo();
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (esLadoValido(lado1)) {
            this.lado1 = lado1;
            calcularTipo();
        } else {
        	System.out.println("El lado debe ser mayor que 0");
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (esLadoValido(lado2)) {
            this.lado2 = lado2;
            calcularTipo();
        } else {
        	System.out.println("El lado debe ser mayor que 0");
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (esLadoValido(lado3)) {
            this.lado3 = lado3;
            calcularTipo();
        } else {
        	System.out.println("El lado debe ser mayor que 0");
        }
    }

    public String getTipo() {
        return tipo;
    }

    private void calcularTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "Equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isosceles";
        } else {
            tipo = "Escaleno";
        }
    }

    private boolean esLadoValido(double lado) {
        return lado > 0;
    }
}
