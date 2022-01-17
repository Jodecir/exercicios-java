package exercicios_java.src.course.com.dio.repetição;

import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numRandom = random.nextInt(100);
        int numero;

        int count = 0;

        boolean fechado = false;
        String repetir;

        do {
            do {
                System.out.println("Digite um número: ");
                numero = scan.nextInt();

                while (numero < 1 | numero > 100) {
                    System.out.println("Número Inválido! , chute um número de 1 a 100: ");
                    numero = scan.nextInt();
                }
                
                count = count + 1;

                if (numero < numRandom) {
                    System.out.println("Errou, o número sorteado é Maior");
                } else if (numero > numRandom) {
                    System.out.println("Errou, o número sorteado é Menor");
                } else {
                    System.out.println("Parabéns, você tem muita sorte e acertou!");
                    System.out.println("---------------------");
                    System.out.println("Tentativas necessárias: " + count);
                    System.out.println("---------------------");
                }
            } while (numero != numRandom);

            System.out.println("Deseja continuar (s/n): ");
            repetir = scan.next();
            if (repetir.equals("n")) {
                System.out.println("Finalizado aqui...");
                fechado = true;
            } else {
                count = 0;
                numRandom = random.nextInt(100);
            }
        } while (fechado == false);
        scan.close();
    }
}