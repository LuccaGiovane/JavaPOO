import java.math.BigDecimal;

public interface ContaBancaria {

    public BigDecimal sacar(BigDecimal valorSaque);
    public BigDecimal depositar(BigDecimal valorDeposito);

}
