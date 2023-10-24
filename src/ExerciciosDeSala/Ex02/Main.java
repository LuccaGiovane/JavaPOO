package ExerciciosDeSala.Ex02;

public class Main
{
    public static void main(String args[])
    {
        Funcionario peao = new Funcionario();
        Funcionario gerente = new Funcionario();

        peao.setNome("Epaminondas");
        peao.setSalario(1000);

        gerente.setNome("Gepeto");
        gerente.setSalario(5500);

        peao.atualizaVR( 0);
        gerente.atualizaVR( 50);

        peao.mostraDados();
        gerente.mostraDados();
    }
}
