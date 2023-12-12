import java.math.BigDecimal;

public class ContaInvestimento implements ContaBancaria,Tributavel{

    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;

    public ContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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

    public BigDecimal calcularTributo(BigDecimal taxaRendimento) {

        return saldo.multiply(taxaRendimento.multiply(BigDecimal.valueOf(0.05)));
    }


    public BigDecimal calcularTaxaAdministracao(BigDecimal taxaRendimento) {


        return saldo.multiply(taxaRendimento.multiply(BigDecimal.valueOf(0.01)));
    }

    public BigDecimal mostraSaldo() {
        return saldo;
    }
}
