package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int modulo_3 = 3;
    public static final String FIZZ = "Fizz";

    public String countOff(int order){
        if(order % modulo_3 ==0){
            return FIZZ;
        }
        return String.valueOf(order);
    }
}
