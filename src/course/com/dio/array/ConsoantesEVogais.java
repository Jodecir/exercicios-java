package course.com.dio.array;

import java.util.Scanner;

public class ConsoantesEVogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[2];
        String[] vogais = new String[2];
        int quantidadeConsoantes = 0, quantidadeVogais = 0;

        int count = 0;

        boolean fechado = false;
        String repetir;

        do {
            do {
                System.out.println("Insira uma Letra: ");
                String letra = scan.next();

                if  ( !( letra.equalsIgnoreCase("a") |
                        letra.equalsIgnoreCase("e") |
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u")) 
                    )  {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                } else {
                    vogais[count] = letra;
                    quantidadeVogais++;
                }

                count++;

            } while(count < consoantes.length);

            System.out.print("Consoantes: ");
            for ( String consoante  :  consoantes ) {
                if ( consoante != null)
                    System.out.print(consoante + " ");
                    // System.out.println(consoantes.length);
            }
            System.out.println("...");
            System.out.print("Vogais: ");
            for ( String vogal  :  vogais ) {
                if ( vogal != null)
                    System.out.print(vogal + " ");
                    // System.out.println(vogais.length);
            }
            System.out.println("...");
            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
            System.out.println("Quantidade de vogais: " + quantidadeVogais);
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
