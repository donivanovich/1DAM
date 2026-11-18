import java.util.Scanner;

public class CambioDeVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 5;
		String cadena = "";
		float numDecimal = 30.0f; //la f es para indicar que es un float
		double numDoble = 45.8;
		char letra = 'r';
		
		//CONVERSION DE INT A FLOAT
		numDecimal = numero;
		
		//CONVERSION DE INT A CHAR
		letra = (char)numero;
		
		//CONVERSION DE INT A STRING
		cadena = String.valueOf(numero);
		
		//CONVERSION DE STRING A INT
		numero = Integer.parseInt(cadena);
		
		//CONVERSION DE STRING A FLOAT
		numDecimal = Float.parseFloat(cadena);
		
		//CONVERSION DE FLOAT A INT
		numero = (int)numDecimal;
		
		//CONVERSION DE CHAR A INT
		numero = letra;

	}

}