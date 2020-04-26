public class FizzBuzzV20 {

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println(handleFizzBuzz(i));;
        }
    }

    static String handleFizzBuzz(int digit) {
        if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        }
        if (digit % 3 == 0) {
            return "Fizz";
        }
        if (digit % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(digit);
    }

}











