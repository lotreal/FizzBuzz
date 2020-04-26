public class FizzBuzzV3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 2000; i++) {
            System.out.println(i + ":" + handleFizzBuzz(i));
        }

    }

    public static String handleFizzBuzz1(int digit) {
        String digitString = String.valueOf(digit);

        if (digitString.contains("3") && !digitString.contains("5")) {
            return "Fizz";
        }

        String result = "";
        if (digit % 3 == 0 &&
                (!digitString.contains("5") || digitString.contains("7"))) {
            result += "Fizz";
        }
        if (digit % 5 == 0 && !digitString.contains("7")) {
            result += "Buzz";
        }
        if (digit % 7 == 0) {
            result += "Whizz";
        }

        if (result.isEmpty()) {
            result = digitString;
        }
        return result;
    }

    static String handleFizzBuzz(int digit) {
        String digitString = String.valueOf(digit);
        boolean isContain5 = digitString.contains("5");
        boolean isContain7 = digitString.contains("7");

        if (digitString.contains("3") && !isContain5) {
            return "Fizz";
        }

        String result = "";
        if (digit % 3 == 0 && (!isContain5 || isContain7)) {
            result += "Fizz";
        }
        if (digit % 5 == 0 && !isContain7) {
            result += "Buzz";
        }
        if (digit % 7 == 0) {
            result += "Whizz";
        }

        if (result.isEmpty()) {
            result = digitString;
        }
        return result;
    }
}











