package course.com.dio.repetição;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "Jodecir";
        int idade = 22;

        while(idade < 0 | idade > 100) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
