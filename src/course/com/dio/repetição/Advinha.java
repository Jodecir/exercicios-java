package course.com.dio.repetição;

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
                if (numero < 1 | numero > 100) break;

                if (numero < numRandom) {
                    System.out.println("Errou, o número sorteado é Maior");
                } else if (numero > numRandom) {
                    System.out.println("Errou, o número sorteado é Menor");
                } else {
                    System.out.println("Parabéns, você tem muita sorte e acertou!");
                    System.out.println("Tentativas necessárias: " + count);
                }

                count = count + 1;
            } while(numero != numRandom);

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