package ExerciciosDeSala.Ex01;

public class Main
{
    public static void main(String args[])
    {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.setMarca("Ferrari");
        carro.setModelo("296 GTB");

        carro2.setMarca("Volkswagen");
        carro2.setModelo("Fusca");

        carro.retornaMarcha(-96);
        carro2.retornaMarcha(12);
    }
}
