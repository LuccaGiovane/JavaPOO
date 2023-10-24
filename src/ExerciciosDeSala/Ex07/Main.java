package ExerciciosDeSala.Ex07;

import java.security.SecureRandom;
import java.util.LinkedList;


public class Main
{
    public static void main(String args[])
    {

        SecureRandom s = new SecureRandom();
        LinkedList<Object> lista = new LinkedList<>();
        int[] c = new int[6];
        int val = 0;

        for(int i=0; i<6; i++)
        {
            c[i] = 0;
        }

        for(int i=0; i<50; i++)
        {
            val = s.nextInt(0,750);
            lista.add(val);

            if(val >= 500)
            {
                c[5] += 1;
            }
            else if(val >= 400 && val <= 499)
            {
                c[4] += 1;
            }
            else if(val >= 300 && val <= 399)
            {
                c[3] += 1;
            }
            else if(val >= 200 && val <= 299)
            {
                c[2] += 1;
            }
            else if(val >= 100 && val <= 199)
            {
                c[1] += 1;
            }
            else
            {
                c[0] += 1;
            }

        }

        System.out.println("==========================================");
        System.out.println("Valores entre RS 0,00 ~RS99,00 ["+ c[0]+"]");
        System.out.println("Valores entre RS100,00 ~RS199,00 ["+ c[1]+"]");
        System.out.println("Valores entre RS200,00 ~RS299,00 ["+ c[2]+"]");
        System.out.println("Valores entre RS300,00 ~RS399,00 ["+ c[3]+"]");
        System.out.println("Valores entre RS400,00 ~RS499,00 ["+ c[4]+"]");
        System.out.println("Valores entre RS500 + ["+ c[5]+"]");
        System.out.println("==========================================");

    }
}
