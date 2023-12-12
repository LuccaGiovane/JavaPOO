import java.math.BigDecimal;

public class ContaBancaria
{
    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;

    public ContaBancaria(String nome, String numero, BigDecimal saldo)
    {
        this.cliente = nome;
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    //===================== get/set =============================

    public void setCliente(String cliente)
    {
        this.cliente = cliente;
    }

    public void setNumeroCliente(String numeroCliente)
    {
        this.numeroConta = numeroCliente;
    }

    protected void setSaldo(BigDecimal saldo)
    {
        this.saldo = saldo;
    }

    public String getCliente()
    {
        return cliente;
    }

    public String getNumeroCliente()
    {
        return numeroConta;
    }

    public BigDecimal getSaldo()
    {
        return saldo;
    }




// =========================== FUNÇOES ============================

    protected void sacar(BigDecimal valorSaque)
    {

        //se saldo - valor >= 0  faz o saque
        if(this.saldo.subtract(valorSaque).compareTo(BigDecimal.ZERO) >= 0)
        {
            System.out.println("Saldo inicial "+ this.saldo);

            this.saldo = this.saldo.subtract(valorSaque);

            System.out.println("Saldo final "+ this.saldo);
        }
        else
        {
            System.out.println("Não foi possivel realizar o saque!");
        }

    }


    public void depositar(BigDecimal valorDeposito)
    {
        System.out.println("Saldo inicial "+this.saldo);

        this.saldo = this.saldo.add(valorDeposito);

        System.out.println("Saldo final "+this.saldo);
    }

}
