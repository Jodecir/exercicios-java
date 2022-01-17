package src.course.com.dio.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int [][] M = new int [4][4];

        boolean fechado = false;
        String repetir;

        do {
            for(int i = 0; i < M.length; i++) {
                for( int j = 0; j < M[i].length; j++) {
                    M[i][j] = random.nextInt(9);
                }
            }
    
            System.out.println("Matriz: ");
            for (int[] linha : M  ) {
                for (int coluna : linha ) {
                    System.out.print(coluna + " ");
                }
                System.out.println();
            }

            System.out.println("Deseja continuar (s/n): ");
            repetir = scan.next();
            if (repetir.equals("n")) {
                System.out.println("Finalizado aqui...");
                fechado = true;
            }
        } while (fechado == false);
        scan.close();
    }
}
