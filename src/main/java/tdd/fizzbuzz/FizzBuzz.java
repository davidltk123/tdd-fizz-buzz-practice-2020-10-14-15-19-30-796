package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final int MODULO_15 = 15;
    private static final int MODULO_21 = 21;
    private static final int MODULO_35 = 35;
    private static final int MODULO_105 = 105;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final String BUZZ_WHIZZ = "BuzzWhizz";
    private static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int order) {
        if(String.valueOf(order).contains("3")){
            return FIZZ;
        } else if (order % MODULO_105 == 0) {
            return FIZZ_BUZZ_WHIZZ;
        } else if (order % MODULO_15 == 0) {
            return FIZZ_BUZZ;
        } else if (order % MODULO_21 == 0) {
            return FIZZ_WHIZZ;
        } else if (order % MODULO_35 == 0) {
            return BUZZ_WHIZZ;
        } else if (order % MODULO_3 == 0) {
            return FIZZ;
        } else if (order % MODULO_5 == 0) {
            return BUZZ;
        } else if (order % MODULO_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
