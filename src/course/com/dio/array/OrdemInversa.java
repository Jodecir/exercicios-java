package src.course.com.dio.array;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        scan.close();
    }
}
