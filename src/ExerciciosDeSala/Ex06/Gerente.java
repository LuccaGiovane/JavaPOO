package ExerciciosDeSala.Ex06;

public class Gerente
{
    public double salario;
    public String nome;

    Gerente(String nome, double salario)
    {
        this.salario = salario;
        this.nome = nome;
    }

    public double getSalario()
    {
        return salario;
    }

    public void aumentarSalario()
    {
        this.salario *= 1.10;
    }

    public void aumentarSalario(double porcentagem)
    {
        this.salario *= porcentagem;
    }

    public void retornarSalario()
    {
        System.out.println("Salario atual:"+ getSalario()+"\n");
    }

    public void retornarNome()
    {
        System.out.println(this.nome);
    }
}
