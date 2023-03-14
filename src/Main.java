//import java.math.BigDecimal;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        int p, q,r,s;
        BinomialCoeff p = new BinomialCoeff();
        do{
            p.p = inp.nextInt();
            p.q = inp.nextInt();
            p.r = inp.nextInt();
            p.s = inp.nextInt();
//            System.out.println("P"+p+"Q"+q+"R"+r+"S"+s);
            System.out.println(p.combination());
        }while ((p.p > 0) && (p.q > 0) && (p.r > 0) && (p.s > 0));
    }
}