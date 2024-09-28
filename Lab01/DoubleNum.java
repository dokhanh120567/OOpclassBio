package LinearFunc;

import java.util.Scanner;

public class DoubleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        String strNum1 = scanner.nextLine();

        System.out.print("Second number: ");
        String strNum2 = scanner.nextLine();

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println(quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}
