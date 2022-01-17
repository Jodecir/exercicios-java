package src.course.com.dio.repetição;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int maiorIdade = 18;
        String situacao;

        boolean fechado = false;
        String repetir;

        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));

            if (idade >= maiorIdade) {
                situacao = "já podendo dirigir";
                System.out.println("Você é maior de idade, " + situacao);
            } else if (idade > 0 & idade < maiorIdade) {
                situacao = "ainda não podendo dirigir";
                System.out.println("Você é menor de idade, " + situacao);
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
