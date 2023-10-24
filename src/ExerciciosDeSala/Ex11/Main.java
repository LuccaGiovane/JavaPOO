package ExerciciosDeSala.Ex11;

public class Main
{
    public static void main(String... args)
    {
        Rectangle retangulo = new Rectangle();
        Rectangle retangulo2 = new Rectangle();

        retangulo.setAltura(5.5);
        retangulo.setLargura(9.8);

        retangulo.area();
        retangulo.perimetro();


        retangulo2.setAltura(20.5);
        retangulo2.setLargura(10);

        retangulo2.area();
        retangulo2.perimetro();
    }
}
