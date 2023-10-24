package ExerciciosDeSala.Ex02;

public class Funcionario
{
    public String nome;
    public double salario;
    public double valeRefeicao;
    public Funcionario() {
        // Inicializa o valor do valeRefeicao com 600.0 por padrão
        this.valeRefeicao = 600.0;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(double valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    protected void atualizaVR(int porcentagem)
    {
        if (porcentagem >= 0) {
            this.valeRefeicao = this.valeRefeicao + this.valeRefeicao * (porcentagem / 100.0);
        }
    }



    protected void mostraDados()
    {
        System.out.println("---------------------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Salario: "+ getSalario());
        System.out.println("Vale Refeição: "+ getValeRefeicao());
        System.out.println("---------------------------");
    }
}
