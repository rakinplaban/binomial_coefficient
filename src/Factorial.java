public class Factorial {
//    private int fact;

    public double factorial(int a){
        if(a==0)
            return 1;
        else{
            return a * factorial(a-1);
        }
    }
}
