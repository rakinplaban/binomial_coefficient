import java.math.BigDecimal;
import java.math.BigInteger;
public class Factorial {
//    private int fact;
    private BigDecimal factor;


    public BigDecimal factorial(long a){
        factor = BigDecimal.valueOf(a);
        if(a==0)
            return BigDecimal.ONE;
        else{
//            return a * factorial(a-1);
            return factor.multiply(factorial(a-1));
        }
    }
}