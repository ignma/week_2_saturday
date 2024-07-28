public class PerfectNumberChecker {

    public static String isPerfectNumber(int number) {
        if (number < 2) {
            return "YES"; // 1 is considered a perfect number in some definitions
        }

        int sum = 1; // Start with 1 because it is a divisor of every number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 96345;

        System.out.println("Input: " + num1 + "\nOutput: " + isPerfectNumber(num1));
        System.out.println("Input: " + num2 + "\nOutput: " + isPerfectNumber(num2));
    }
}