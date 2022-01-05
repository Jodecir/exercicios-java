package course.com.dio.repetição;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int maiorIdade = 18;

        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Insira sua idade: ");
            idade = scan.nextInt();

            if (idade >= maiorIdade) {
                System.out.println("Você é maior de idade");
            } else if (idade > 0 & idade < maiorIdade) {
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
