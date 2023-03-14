//import java.math.BigDecimal;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        int p, q,r,s;
        BinomialCoeff pal = new BinomialCoeff();
        do{
            try{
                pal.p = inp.nextInt();
                pal.q = inp.nextInt();
                pal.r = inp.nextInt();
                pal.s = inp.nextInt();
//            System.out.println("P"+p+"Q"+q+"R"+r+"S"+s);
                System.out.println(pal.combination());
            }
            catch(StackOverflowError error){
                break;
            }

        }while ((pal.p > 0) && (pal.q > 0) && (pal.r > 0) && (pal.s > 0));
    }
}