package ExerciciosDeSala.Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int[] valores = new int[10];
        Scanner input = new Scanner(System.in);

        int i = 0, total = 0;

        System.out.printf("Insira 10 valores para a soma:\n");

        for (i = 0; i < valores.length; i++)
        {
            System.out.printf("Val[%d/%d]: ", (i + 1), valores.length);
            valores[i] = input.nextInt();
        }

        for (int number : valores) {
            total += number;
        }

        System.out.printf("Total [%d]", total);
    }
}
