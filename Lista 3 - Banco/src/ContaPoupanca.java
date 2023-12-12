import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria
{

    private int diaRendimento;

    public ContaPoupanca(String cliente, String numeroCliente, BigDecimal saldo, int taxa)
    {
        super(cliente, numeroCliente, saldo);
        this.diaRendimento = taxa;
    }


    //===================== funçoes =========================

    public BigDecimal getSaldo()
    {
        return super.getSaldo();
    }


    @Override
    public void sacar(BigDecimal valorParaSaque)
    {
        //saldo nao pode ser menor que zero
        if(this.getSaldo().subtract(valorParaSaque).compareTo(BigDecimal.ZERO) >= 0)
        {
            super.sacar(valorParaSaque);
        }
        else
        {
            System.out.println("Não foi possivel realizar o saque!");
        }
    }


    public void	calcularNovoSaldo()
    {
        this.setSaldo(this.getSaldo().add(this.getSaldo()
                .multiply(new BigDecimal(this.diaRendimento).divide(new BigDecimal(100)))));
    }


    public void depositar(BigDecimal valorParaDeposito)
    {
        super.depositar(valorParaDeposito);
    }

}
