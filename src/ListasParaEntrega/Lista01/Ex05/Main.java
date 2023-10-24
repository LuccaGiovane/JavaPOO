package ListasParaEntrega.Lista01.Ex05;

public class Main
{
    public static void main(String[] args)
    {
        int cont = 1;

        while(cont <= 100)
        {

            if(cont % 4 == 0)
            {
                System.out.println("PI");
            }
            else
            {
                System.out.println(cont);
            }

            cont++;

        }
    }
}
