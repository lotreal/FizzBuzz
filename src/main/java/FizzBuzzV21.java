public class FizzBuzzV21 {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            System.out.println(handleFizzBuzz(i));;
        }

    }

    private static String handleFizzBuzz(int digit) {
        if (digit % 3 == 0 && digit % 5 == 0 && digit % 7 == 0) {
            return "FizzBuzzWhizz";
        }
        if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        }
        if (digit % 3 == 0 && digit % 7 == 0) {
            return "FizzWhizz";
        }
        if (digit % 5 == 0 && digit % 7 == 0) {
            return "BuzzWhizz";
        }
        if (digit % 3 == 0) {
            return "Fizz";
        }
        if (digit % 5 == 0) {
            return "Buzz";
        }
        if (digit % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(digit);
    }

}











