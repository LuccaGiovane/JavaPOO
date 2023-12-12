import java.math.BigDecimal;


public class ContaCorrente implements ContaBancaria{

    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;
    private BigDecimal limite;

    public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;

    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


    public BigDecimal getLimite() {
        return limite;
    }
    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }



    public BigDecimal sacar(BigDecimal valorSaque) {
        /*Saldo nao pode ser menor que 0*/


        //      saldo  +  limite  - valor do saque >=0 da pra dale
        if(this.saldo.add(limite).subtract(valorSaque).compareTo(BigDecimal.ZERO) >= 0) {

            System.out.println("Saque efetuado.");
            return this.saldo = this.saldo.subtract(valorSaque);

        }
        return null;
    }


    public BigDecimal depositar(BigDecimal valorDeposito) {

        return this.saldo = this.saldo.add(valorDeposito);
    }


    public BigDecimal mostraSaldo() {
        return saldo;
    }
}
