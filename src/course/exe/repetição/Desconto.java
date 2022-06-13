package src.course.exe.repetição;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, curso;
        String nome;
        String greeting = "Olá";
        int cursoMin = 1;
        int cursoMax = 5;

        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            
            System.out.println("\n>>> 1 - TI");
            System.out.println(">>> 2 - Psicologia");
            System.out.println(">>> 3 - Pacote Office");
            System.out.println(">>> 4 - Manicure");
            System.out.println(">>> 5 - Fotografia\n");

            System.out.println("Digite o número: ");
            curso = scan.nextInt();

            do {
                if (curso == 1) {
                    int valorCurso = 400;
                    System.out.println("---------------------");
                    int valorFinal = valorCurso - desconto(valorCurso, idade);
                    System.out.println(greeting + " " + nome + ", o curso desejado de R$" + valorCurso + " se torna R$" + valorFinal + " com o desconto da sua idade, que é " + idade + " %");
                } else if (curso == 2) {
                    int valorCurso = 1200;
                    System.out.println("---------------------");
                    int valorFinal = valorCurso - desconto(valorCurso, idade);
                    System.out.println(greeting + " " + nome + ", o curso desejado de R$" + valorCurso + " se torna R$" + valorFinal + " com o desconto da sua idade, que é " + idade + " %");
                } else if (curso == 3) {
                    int valorCurso = 100;
                    System.out.println("---------------------");
                    int valorFinal = valorCurso - desconto(valorCurso, idade);
                    System.out.println(greeting + " " + nome + ", o curso desejado de R$" + valorCurso + " se torna R$" + valorFinal + " com o desconto da sua idade, que é " + idade + " %");
                } else if (curso == 4) {
                    int valorCurso = 149;
                    System.out.println("---------------------");
                    int valorFinal = valorCurso - desconto(valorCurso, idade);
                    System.out.println(greeting + " " + nome + ", o curso desejado de R$" + valorCurso + " se torna R$" + valorFinal + " com o desconto da sua idade, que é " + idade + " %");
                } else if (curso == 5) {
                    int valorCurso = 300;
                    System.out.println("---------------------");
                    int valorFinal = valorCurso - desconto(valorCurso, idade);
                    System.out.println(greeting + " " + nome + ", o curso desejado de R$" + valorCurso + " se torna R$" + valorFinal + " com o desconto da sua idade, que é " + idade + " %");
                } else {
                    System.out.println("O número do curso está incorreto, Escolha entre 1 a 5.");
                    curso = scan.nextInt();
                }
            } while (curso > cursoMax || curso < cursoMin);

            System.out.println("Deseja continuar (s/n): ");
            repetir = scan.next();
            if (repetir.equals("n")) {
                System.out.println("Finalizado aqui...");
                fechado = true;
            }
        } while (fechado == false);
        scan.close();
    }

    public static int desconto(int a, int b) {
        return (a * b) / 100;
    }
}