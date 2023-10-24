package ListasParaEntrega.Lista01.Ex04;

public class Main
{
    public static void main(String[] args)
    {
        int cont = 1;

        while(cont <= 100)
        {

            if(cont % 2 == 0)
            {
                System.out.println("**");
            }
            else
            {
                System.out.println("*");
            }

            cont++;

        }
    }
}
