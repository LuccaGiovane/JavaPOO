import java.math.BigDecimal;

public abstract class ContaBancaria
{

    private String nome;
    private String numeroConta;
    protected BigDecimal saldo;

    public ContaBancaria(String nome, String numero, BigDecimal saldo)
    {
        this.nome = nome;
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valorDeposito)
    {

        this.saldo = this.saldo.add(valorDeposito);
    }

    public abstract void sacar(BigDecimal valorSaque);

}
