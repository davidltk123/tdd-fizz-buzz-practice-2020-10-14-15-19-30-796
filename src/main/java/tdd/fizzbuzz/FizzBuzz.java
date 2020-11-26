package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int modulo_3 = 3;
    public static final int modulo_5 = 5;
    public static final int modulo_7 = 7;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order){
        if(order % modulo_3 == 0){
            return FIZZ;
        }else if(order % modulo_5 == 0){
            return BUZZ;
        }else if(order % modulo_7 == 0){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
