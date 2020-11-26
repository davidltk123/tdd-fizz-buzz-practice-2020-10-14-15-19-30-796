package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
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
}
