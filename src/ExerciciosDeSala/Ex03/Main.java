package ExerciciosDeSala.Ex03;

import java.security.SecureRandom;

public class Main
{

    public static void main(String args[])
    {
        SecureRandom rand = new SecureRandom();

        int [] c = new int[6];
        int val;

        for(int i = 0; i < 6; i++)
        {
            c[i] = 0;
        }

        for(int i = 0; i < 50; i++)
        {
            val = rand.nextInt(700);

            if(val <= 99)
            {
                c[0] += 1;
            }
            else if (val >= 100 && val <= 199 )
            {
                c[1] += 1;
            }
            else if (val >= 200 && val <= 299 )
            {
                c[2] += 1;
            }
            else if (val >= 300 && val <= 399 )
            {
                c[3] += 1;
            }
            else if (val >= 400 && val <= 499 )
            {
                c[4] += 1;
            }
            else
            {
                c[5] += 1;
            }

        }

        val = 0;

        for(int i = 0; i < 6; i++)
        {
            val += c[i];
        }


        System.out.printf("\n\n===== QUANTIDADE DE VENDAS =====\n\n" +
                "Venda tipo 1: valores entre R$ 0,00 ~R$99,00 , Quantidade: [%d]\n",c[0]);
        System.out.printf("Venda tipo 2: valores entre R$100,00 ~R$199,00 , Quantidade: [%d] \n",c[1]);
        System.out.printf("Venda tipo 3: valores entre R$200,00 ~R$299,00 , Quantidade: [%d] \n",c[2]);
        System.out.printf("Venda tipo 4: valores entre R$300,00 ~R$399,00 , Quantidade: [%d] \n",c[3]);
        System.out.printf("Venda tipo 5: valores entre R$400,00 ~R$499,00 , Quantidade: [%d] \n",c[4]);
        System.out.printf("Venda tipo 6: valores maiores que R$500 , Quantidade: [%d] \n",c[5]);
        System.out.printf("Total de vendas: [%d]\n", val);
        System.out.printf("================================================================");
    }
}
