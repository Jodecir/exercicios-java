package src.course.exe.repetição;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        int count = 0;

        boolean fechado = false;
        String repetir;
        
        do {
            quantNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de números: "));

            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    
                if (numero % 2 == 0) {
                    System.out.println("Número Par");
                    quantPares++;
                } else if (numero % 2 == 1) {
                    System.out.println("Número Ímpar");
                    quantImpares++;
                } else {
                    System.out.println("Valor Inválido");
                }
    
                count = count + 1;
                
            } while(count < quantNumeros);

            System.out.println("Quantidade Par: " + quantPares);
            System.out.println("Quantidade Ímpar: " + quantImpares);
            
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
