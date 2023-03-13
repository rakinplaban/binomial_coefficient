public class BinomialCoeff extends Factorial{
    public int p, q, r, s;
    private double first, second;
    public double combination(){
        first = factorial(p)/(factorial(p-q)*factorial(q));
        second = factorial(r)/(factorial(r-s)*factorial(s));

        return first/second;
    }

}