import java.math.BigDecimal;
public abstract class ContaTributavel extends ContaBancaria{



    public ContaTributavel(String nome, String numero, BigDecimal saldo)
    {
        super(nome, numero, saldo);

    }


    public void calcularTributo(BigDecimal taxaRendimento)
    {
        System.out.println("Taxa de rendimento atualizada.");

        super.saldo = super.getSaldo().multiply(taxaRendimento).multiply(BigDecimal.valueOf(0.01));
    }
}
