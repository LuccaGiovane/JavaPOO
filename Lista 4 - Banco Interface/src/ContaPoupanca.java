import java.math.BigDecimal;


public class ContaPoupanca implements ContaBancaria{

    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;
    private int rendimento;

    public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int rendimento) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.rendimento = rendimento;

    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
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


    public int getRendimento() {
        return rendimento;
    }
    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }




    public BigDecimal sacar(BigDecimal valorSaque) {
        /*Saldo nao pode ser menor que 0*/


        //se saldo - valor >= 0  faz o saque
        if(this.saldo.subtract(valorSaque).compareTo(BigDecimal.ZERO) >= 0) {

            System.out.println("Saque efetuado.");
            return this.saldo = this.saldo.subtract(valorSaque);

        }
        return saldo;
    }


    public BigDecimal depositar(BigDecimal valorDeposito) {

        return this.saldo = this.saldo.add(valorDeposito);
    }

    public BigDecimal atualizaRendimento(BigDecimal taxaRendimento) {

        return this.saldo = this.saldo.multiply(taxaRendimento.divide(BigDecimal.valueOf(100)));
    }

    public BigDecimal mostraSaldo() {
        return saldo;
    }
}
