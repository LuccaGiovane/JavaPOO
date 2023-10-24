/*Crie um programa que receba como entrada um valor inteiro n e responda na saída
o valor da n-ésima posição da cadeia de Fibonacci.*/
package ListasParaEntrega.Lista01.Ex08;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 0;
        int numDado;

        Scanner s = new Scanner(System.in);

        System.out.print("Informe an-esima  posicao da sequencia Fibonacci desejada:");
        numDado = s.nextInt();

        for(int i = 0; i < (numDado - 2); i++) {

            num1 = num1 + num2;
            num2 = num1 - num2;

        }

        System.out.printf("Na posição [%d] da sequencia Fibonacci esta o numero [%d]", numDado, num1);

        s.close();

    }
}
