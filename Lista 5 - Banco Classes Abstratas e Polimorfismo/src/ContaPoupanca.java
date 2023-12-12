import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{

    private int rendimento;

    public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int rendimento) {
        super(cliente, numeroConta, saldo);

        this.rendimento = rendimento;

    }

    @Override
    public void sacar(BigDecimal valorSaque)
    {
        if(this.saldo.subtract(valorSaque).compareTo(BigDecimal.ZERO) >= 0)
        {
            System.out.println("Saque efetuado.");

            this.saldo = this.saldo.subtract(valorSaque);

        }
        else
        {
            System.out.println("Saque nao efetuado.");
        }
    }

    public void depositar(BigDecimal valorDoSaque)
    {
        System.out.println("Deposito efetuado.");

        this.saldo = this.saldo.add(valorDoSaque);
    }


    public void atualizarRendimento(BigDecimal taxaRendimento)
    {
        System.out.println("Taxa de rendimento atualizada.");

        this.saldo = this.saldo.multiply(taxaRendimento.divide(BigDecimal.valueOf(100)));
    }
}
