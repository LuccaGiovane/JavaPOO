package ExerciciosDeSala.Lista01.Ex01;

import java.math.BigDecimal;

public class Professor extends Funcionario
{
    @Override
    protected BigDecimal getSalarioPrimeiraParcela()
    {
        return getSalario();
    }

    @Override
    protected BigDecimal getSalarioSegundaParcela()
    {
        return BigDecimal.ZERO;
    }
}
