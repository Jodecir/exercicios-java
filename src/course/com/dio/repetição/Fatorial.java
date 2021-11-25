package course.com.dio.repetição;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fechado = false;
        String repetir;

        do {
            System.out.println("Fatorial: ");
            int fatorial = scan.nextInt();

            int multiplicacao = 1;

            System.out.print(fatorial +"! = ");
            for(int i = fatorial ; i >= 1 ; i --) {
                multiplicacao = multiplicacao * i;
            }

            System.out.println(multiplicacao);

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
