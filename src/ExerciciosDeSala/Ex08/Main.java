package ExerciciosDeSala.Ex08;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int total = 0;

        for (int numero : numeros)
        {
            System.out.printf("Informe o valor %d/10",numero);
            total += input.nextInt();

        }

        System.out.println("Soma = "+ total);
    }
}
