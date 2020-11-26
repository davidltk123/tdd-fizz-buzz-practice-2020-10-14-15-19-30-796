package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int modulo_3 = 3;
    private static final int modulo_5 = 5;
    private static final int modulo_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

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
