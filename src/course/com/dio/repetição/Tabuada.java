package exercicios_java.src.course.com.dio.repetição;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Tabuada: ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de " + tabuada + ":");
            for(int i = 1; i <= 10; i = i + 1) {
                System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
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
