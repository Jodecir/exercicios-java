package course.com.dio.repetição;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Digite um número: ");
            n1 = scan.nextInt();
            if (n1 % 2 == 0) {
                System.out.println("Número Par");
            } else if (n1 % 2 == 1) {
                System.out.println("Número Ímpar");
            } else {
                System.out.println("Valor Inválido");
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
