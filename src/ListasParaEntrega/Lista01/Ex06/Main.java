/*Crie um programa que imprima na tela um triângulo de “*”. O número de níveis do
triângulo deverá ser lido do teclado. Veja um exemplo de triângulo com 5 níveis
abaixo:
*
**
***
****
******/
package ListasParaEntrega.Lista01.Ex06;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int n;
        int i;
        int j;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o numero de camadas:");
        n = s.nextInt();

        for( i=1; i<=n; i++)
        {

            for(j=1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
