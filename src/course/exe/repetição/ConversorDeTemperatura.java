package src.course.exe.repetição;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        String escala = "c";

        boolean fechado = false;
        String repetir;

        do {
            System.out.print("Insira o valor: ");
            n1 = scan.nextInt();

            System.out.print("Insira a escala que ele está entre (F/C/K): ");
            escala = scan.next();
            
            double ctof = (n1 * 1.8) + 32;
            double ctok = n1 + 273.15;
            double ftoc = (n1 - 32) / 1.8;
            double ftok = ((n1 - 32) / 1.8) + 273.15;
            double ktoc = n1 - 273.15;
            double ktof = ((n1 - 273.15) * 1.8) + 32;

            if (escala.equals("C") || escala.equals("c")) {
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em F é %.1f°\n", ctof);
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em K é %.1f°\n", ctok);
                System.out.println("---------------------");
            } else if (escala.equals("F") || escala.equals("f")) {
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em C é %.1f°\n", ftoc);
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em K é %.1f°\n", ftok);
                System.out.println("---------------------");
            } else if (escala.equals("K") || escala.equals("k")) {
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em C é %.1f°\n", ktoc);
                System.out.println("---------------------");
                System.out.printf(">>> A temperatura em F é %.1f°\n", ktof);
                System.out.println("---------------------");
            } else {
                System.out.println(">>> Repita o processo por favor, a escala está incorreta.");
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