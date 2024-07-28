public class LeapYearChecker {

    public static String isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Leap Year";
        } else {
            return "Non Leap Year";
        }
    }

    public static void main(String[] args) {
        int year1 = 1990;
        int year2 = 2024;

        System.out.println("Input: " + year1 + "\nOutput: " + isLeapYear(year1));
        System.out.println("Input: " + year2 + "\nOutput: " + isLeapYear(year2));
    }
}