/*Construa uma calculadora de IMC (Índice de Massa Corporal). A fórmula do IMC é
apresentada abaixo: IMC = PESO/(ALTURA^2)*/
package ListasParaEntrega.Lista01.Ex09;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        double H;
        double peso;
        double IMC;

        Scanner s = new Scanner(System.in);

        System.out.print("Informe sua altura:");
        H = s.nextDouble();

        System.out.print("Informe seu peso:");
        peso = s.nextDouble();

        IMC = peso / (H * H);

        System.out.printf("Seu IMC é [%.2f]",IMC);

        s.close();
    }

}
