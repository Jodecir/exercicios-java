package src.course.com.dio.repetição;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fechado = false;
        String repetir;

        do {
            System.out.print("Insira o número que deseja a tabuada: ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada do " + tabuada + ":");
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
