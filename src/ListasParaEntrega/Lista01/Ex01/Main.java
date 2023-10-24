/*Faça um programa que imprima na tela o seu nome 100 vezes. O seu nome deve
ser passado como parâmetro para o programa.*/
package ListasParaEntrega.Lista01.Ex01;

public class Main
{
    public static void main(String[] args)
    {
        int cont = 0;

        while (cont < 100)
        {

            System.out.println(args[0]);

            cont ++;

        }
    }
}
