package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final String BUZZ_WHIZZ = "BuzzWhizz";
    private static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    @Test
    void should_return_string_order_number_when_count_off_given_number_with_normal_case(){
        //given
        int order = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals("1",actual);
    }

    @Test
    void should_return_Fizz_when_count_off_given_number_with_number_multiple_of_3(){
        //given
        int order = 9;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ,actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_number_with_number_multiple_of_5(){
        //given
        int order = 10;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(BUZZ,actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_number_with_number_multiple_of_7(){
        //given
        int order = 14;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(WHIZZ,actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_number_with_number_multiple_of_3_and_5(){
        //given
        int order = 30;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ_BUZZ,actual);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_number_with_number_multiple_of_3_and_7(){
        //given
        int order = 42;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ_WHIZZ,actual);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_number_with_number_multiple_of_5_and_7(){
        //given
        int order = 70;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(BUZZ_WHIZZ,actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_given_number_with_number_multiple_of_3_and_5_and_7(){
        //given
        int order = 210;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ_BUZZ_WHIZZ,actual);
    }
}
