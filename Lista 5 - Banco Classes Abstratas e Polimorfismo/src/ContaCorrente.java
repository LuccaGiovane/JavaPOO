import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria
{

    private BigDecimal limite;

    public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite)
    {
        super(cliente, numeroConta, saldo);

        this.limite = limite;

    }

    @Override
    public String getNumeroConta() {
        return super.getNumeroConta();
    }

    public void sacar(BigDecimal valorSaque)
    {

        if(this.saldo.add(limite).subtract(valorSaque).compareTo(BigDecimal.ZERO) >= 0)
        {
            System.out.println("Saque efetuado.");

            setSaldo(this.saldo.subtract(valorSaque));

        }
    }
}
