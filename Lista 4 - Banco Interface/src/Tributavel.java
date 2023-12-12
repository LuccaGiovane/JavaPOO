import java.math.BigDecimal;
public interface Tributavel {

    public BigDecimal sacar(BigDecimal valorSaque);
    public BigDecimal depositar(BigDecimal valorDeposito);
    public BigDecimal calcularTributo(BigDecimal taxaRendimento);


}
