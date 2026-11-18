package Arrays;

import java.util.Scanner;

public class Primitiva {

    public static void main(String[] args) {
        // Necesitamos un array de tamaño 6 para almacenar los numeros de la primitiva, estos se generan de forma aleatoria del
        // 1 al 49 separados por guiones (no se pueden repetir)
        
        Scanner sc = new Scanner(System.in);
        
        int primitiva[] = new int[6];
        int i, j;
        int random;
        
        for (i = 0; i < primitiva.length; i++) {
            do {
                random = (int) (Math.random() * 49) + 1; 
                boolean repetido = false;
                
                for (j = 0; j < i; j++) {
                    if (primitiva[j] == random) {
                        repetido = true;
                        break;
                    }
                }
                
                if (!repetido) {
                    primitiva[i] = random;
                    break;
                }
            } while (true);
        }
        
        for (i = 0; i < primitiva.length; i++) {
            if (i == primitiva.length - 1) {
                System.out.print(primitiva[i]);
            } else {
                System.out.print(primitiva[i] + "-");
            }
        }
    }
}
