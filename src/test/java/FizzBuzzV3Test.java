import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzV3Test {

    @ParameterizedTest
    @CsvSource({
            "5,    Buzz",
            "6,    Fizz",
            "7,    Whizz",
            "8,    8",
            "13,   Fizz",
            "21,   FizzWhizz",
            "30,   Fizz",
            "31,   Fizz",
            "32,   Fizz",
            "33,   Fizz",
            "34,   Fizz",
            "35,   BuzzWhizz",
            "385,  BuzzWhizz",
            "1890, FizzBuzzWhizz",
    })
    void testHandleFizzBuzzDigit(int digit, String result) {
        assertEquals(FizzBuzzV3.handleFizzBuzz(digit), result);
    }

}
