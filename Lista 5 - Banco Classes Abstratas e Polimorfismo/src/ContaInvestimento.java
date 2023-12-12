import java.math.BigDecimal;

public class ContaInvestimento extends ContaTributavel{



    public ContaInvestimento(String nome, String numero, BigDecimal saldo)
    {
        super(nome, numero, saldo);

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

    public void depositar(BigDecimal valorDeposito)
    {
        System.out.println("Deposito efetuado.");
        this.saldo = this.saldo.add(valorDeposito);
    }

    public void calcularTaxaAdministracao(BigDecimal taxaRendimento)
    {

        System.out.println("Taxa de Administração: R$"+
                saldo.multiply(taxaRendimento.multiply(BigDecimal.valueOf(0.01))));
    }

    public void calcularTributo(BigDecimal taxaRendimento)
    {

        System.out.println("Tributos: R$"+
                saldo.multiply(taxaRendimento.multiply(BigDecimal.valueOf(0.05))));
    }
}
