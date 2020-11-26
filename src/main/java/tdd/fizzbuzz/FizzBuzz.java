package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int modulo_3 = 3;
    private static final int modulo_5 = 5;
    private static final int modulo_7 = 7;
    private static final int modulo_15 = 15;
    private static final int MODULO_21 = 21;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";

    public String countOff(int order) {
        if (order % modulo_15 == 0) {
            return FIZZ_BUZZ;
        } else if (order % MODULO_21 == 0) {
            return FIZZ_WHIZZ;
        } else if (order % 35 == 0) {
            return "BuzzWhizz";
        } else if (order % modulo_3 == 0) {
            return FIZZ;
        } else if (order % modulo_5 == 0) {
            return BUZZ;
        } else if (order % modulo_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
