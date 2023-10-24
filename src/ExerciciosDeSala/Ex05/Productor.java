package ExerciciosDeSala.Ex05;

public class Productor
{
    public static double retornarMenor(double a, double b)
    {
        return Math.min(a, b);
    }

    public static void main(String args[])
    {
        double a = 10.5, b = 2.1, result = 0;

        result = retornarMenor(a, b);

        System.out.printf("Menor valor = %.1f",result);
    }
}
