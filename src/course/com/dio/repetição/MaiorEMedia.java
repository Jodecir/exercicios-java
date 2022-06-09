package src.course.com.dio.repetição;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int maior = 0, soma = 0;

        int count = 0;

        boolean fechado = false;
        String repetir;

        do {
            System.out.print("Quantidade de números: ");
            quantNumeros = scan.nextInt();
            do {
                if (quantNumeros < 1) break;

                System.out.print("Digite um número: ");
                numero = scan.nextInt();

                soma = soma + numero;

                if (numero > maior) maior = numero;

                count = count + 1;
            } while(count < quantNumeros);

            System.out.println("Maior: " + maior);
            System.out.println("Média: " + (soma/5));

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