import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria
{
    private BigDecimal limite;

    public ContaCorrente(String cliente, String numeroCliente, BigDecimal saldo, BigDecimal limite)
    {
        super(cliente, numeroCliente, saldo);
        this.limite = limite;
    }


    //============ get/set ======================
    public BigDecimal getSaldo()
    {
        return super.getSaldo();
    }
    protected void setSaldo(BigDecimal saldo)
    {
        super.setSaldo(saldo);
    }

    @Override
    public void sacar(BigDecimal valor)
    {
        BigDecimal saldoComLimite = getSaldo().add(limite);

        // Verifica se o saque não ultrapassa o limite
        if (valor.compareTo(saldoComLimite) <= 0)
        {
            setSaldo(getSaldo().subtract(valor));
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
        else
        {
            System.out.println("Saque não permitido. Saldo insuficiente ou ultrapassa o limite.");
        }
    }
}
