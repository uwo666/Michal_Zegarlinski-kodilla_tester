import java.util.Scanner;

public class Colors {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first letter of the color and I will guess what color it is");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        Colors colors = new Colors();
        double result = calculator.calculate();
        System.out.println("Result: " + result);
    }
}
