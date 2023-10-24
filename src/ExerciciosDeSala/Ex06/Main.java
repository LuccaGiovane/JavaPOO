package ExerciciosDeSala.Ex06;

public class Main
{

    public static void main(String args[])
    {
        Gerente gerente = new Gerente("Gepeto", 2000);

        gerente.retornarNome();
        gerente.aumentarSalario();
        gerente.retornarSalario();

        System.out.printf("-------------------\n");
        gerente.salario = 2000;
        gerente.retornarNome();
        gerente.aumentarSalario(1.20);
        gerente.retornarSalario();
    }
}
