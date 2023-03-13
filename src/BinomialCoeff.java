import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinomialCoeff extends Factorial{
    public int p, q, r, s;
    private BigDecimal first, second;
    public BigDecimal combination(){
        first = factorial(p).divide(factorial(p-q).multiply(factorial(q)),5, RoundingMode.HALF_UP);
        second = factorial(r).divide(factorial(r-s).multiply(factorial(s)),5,RoundingMode.HALF_UP);

        return first.divide(second,5,RoundingMode.HALF_UP);
    }

}