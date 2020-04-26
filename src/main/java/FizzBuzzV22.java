public class FizzBuzzV22 {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            System.out.println(handleFizzBuzz(i));;
        }

    }

    private static String handleFizzBuzz(int digit) {
        String result = "";

        if (digit % 3 == 0) {
            result += "Fizz";;
        }
        if (digit % 5 == 0) {
            result += "Buzz";
        }
        if (digit % 7 == 0) {
            result += "Whizz";
        }
        if (result.isEmpty()) {
            result = String.valueOf(digit);
        }
        return result;
    }

}











