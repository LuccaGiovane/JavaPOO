package ListasParaEntrega.Lista01.Ex03;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int numero_rep;
        int cont = 0;
        String nome_lido;
        Scanner s = new Scanner(System.in);

        System.out.print("insira seu nome:");
        nome_lido = s.nextLine();

        System.out.print("Insira o numero de repetições:");
        numero_rep = s.nextInt();

        while(cont < numero_rep)
        {

            System.out.println(nome_lido);
            cont++;
        }
        s.close();
    }
}
