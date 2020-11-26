package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    public static final String FIZZ = "Fizz";

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
}
