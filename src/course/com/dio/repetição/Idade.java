package course.com.dio.repetição;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Idade: ");
            idade = scan.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            } else if (idade > 0 & idade < 18) {
                System.out.println("Você é menor de idade");
            } else {
                System.out.println("Valor inválido");
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
