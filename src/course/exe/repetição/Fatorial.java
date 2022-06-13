package src.course.exe.repetição;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fechado = false;
        String repetir;

        do {
            System.out.print("Insira o número que deseja o fatorial: ");
            int valor = scan.nextInt();

            int resultado = 1;

            System.out.print(valor + "! = ");
            for(int i = valor; i >= 1; i--) {
                resultado = resultado * i;
            }

            System.out.println(resultado);

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
