package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

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
        int order = 3;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ,actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_number_with_number_multiple_of_5(){
        //given
        int order = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(BUZZ,actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_number_with_number_multiple_of_7(){
        //given
        int order = 7;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(WHIZZ,actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_number_with_number_multiple_of_3_and_5(){
        //given
        int order = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String actual = fizzbuzz.countOff(order);
        //then
        assertEquals(FIZZ_BUZZ,actual);
    }
}
