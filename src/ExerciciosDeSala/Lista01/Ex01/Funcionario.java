package ExerciciosDeSala.Lista01.Ex01;

import java.math.BigDecimal;

public class Funcionario extends Pessoa
{
    private String matricula;
    private BigDecimal salario;


    public String getMatricula()
    {
        return matricula;
    }
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public BigDecimal getSalario()
    {
        return salario;
    }
    public void setSalario(BigDecimal salario)
    {
        if(salario.compareTo(BigDecimal.ZERO) <= 0)
        {
            System.out.println("ERRO, O salario não pode ser zero ou negativo!");
        }else
        {
            this.salario = salario;
        }

    }

    protected BigDecimal getSalarioPrimeiraParcela()
    {
        return getSalario().multiply(BigDecimal.valueOf(0.6));
    }

    protected BigDecimal getSalarioSegundaParcela()
    {
        return getSalario().multiply(BigDecimal.valueOf(0.4));
    }
}
