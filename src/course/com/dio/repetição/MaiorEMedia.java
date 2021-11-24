package course.com.dio.repetição;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int maior = 0, soma = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < quantNumeros);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
        scan.close();
    }
}