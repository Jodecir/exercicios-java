package src.course.com.dio.repetição;

import java.util.Scanner;

public class TrianguloDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fechado = false;
        String repetir;
        do {
            System.out.println("Triangulo de numeros: ");
            int valorFinal = scan.nextInt();
            
            for(int linha = 1; linha <= valorFinal + 1; linha++) {
                for (int coluna = 1; coluna < linha; coluna++){
                    System.out.print(coluna);
                    System.out.print(" ");
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