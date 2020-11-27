package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int order) {
        StringBuilder message = new StringBuilder();
        if (order % MODULO_3 == 0) {
            message.append(FIZZ);
        }
        if (order % MODULO_5 == 0) {
            message.append(BUZZ);
        }
        if (order % MODULO_7 == 0) {
            message.append(WHIZZ);
        }
        if(message.length()==0){
            return String.valueOf(order);
        }
        return message.toString();
    }
}
