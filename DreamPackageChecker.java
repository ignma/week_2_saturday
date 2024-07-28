public class DreamPackageChecker {

    public static String isDreamPackage(int salary) {
        return salary > 500000 ? "DREAM" : "NOTDREAM";
    }

    public static void main(String[] args) {
        int salary1 = 100000;
        int salary2 = 600000;

        System.out.println("Input: " + salary1 + "\nOutput: " + isDreamPackage(salary1));
        System.out.println("Input: " + salary2 + "\nOutput: " + isDreamPackage(salary2));
    }
}
