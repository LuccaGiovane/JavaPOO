package ExerciciosDeSala.Ex11;

public class Rectangle
{
    private double largura = 1.0;
    private double altura = 1.0;

    public void setLargura(double largura)
    {
        if(largura > 0.0 && largura < 20.0)
        {
            this.largura = largura;
        }
        else
        {
            System.out.println("\n\nERRO, Largura invalida.");
        }

    }

    public void setAltura(double altura)
    {
        if(altura > 0.0 && altura < 20.0)
        {
            this.altura = altura;
        }
        else
        {
            System.out.println("\n\nERRO, Altura invalida.");
        }
    }

    public double getLargura()
    {
        return largura;
    }

    public double getAltura()
    {
        return altura;
    }

    public void perimetro()
    {
        System.out.printf("Perimetro [%.2f]\n",(getAltura()*2)+(getLargura()*2));
    }

    public void area()
    {
        System.out.printf("Area [%.2f]\n",getAltura() * getLargura());
    }
}
