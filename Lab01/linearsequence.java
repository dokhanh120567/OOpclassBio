package ex226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class linearsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nChoose the equation to solve:");
            System.out.println("1. First-degree equation (ax + b = 0)");
            System.out.println("2. System of first-degree equations with two variables");
            System.out.println("3. Second-degree equation (ax^2 + bx + c = 0)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    solveLinearEquation(reader);
                    break;
                case 2:
                    solveLinearSystem(reader);
                    break;
                case 3:
                    solveQuadraticEquation(reader);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void solveLinearEquation(BufferedReader reader) throws IOException {
        System.out.print("Enter a: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(reader.readLine());

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            System.out.println("Solution: x = " + (-b / a));
        }
    }

    private static void solveLinearSystem(BufferedReader reader) throws IOException {
        System.out.print("Enter a11: ");
        double a11 = Double.parseDouble(reader.readLine());
        System.out.print("Enter a12: ");
        double a12 = Double.parseDouble(reader.readLine());
        System.out.print("Enter a21: ");
        double a21 = Double.parseDouble(reader.readLine());
        System.out.print("Enter a22: ");
        double a22 = Double.parseDouble(reader.readLine());
        System.out.print("Enter b1: ");
        double b1 = Double.parseDouble(reader.readLine());
        System.out.print("Enter b2: ");
        double b2 = Double.parseDouble(reader.readLine());

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    private static void solveQuadraticEquation(BufferedReader reader) throws IOException {
        System.out.print("Enter a: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(reader.readLine());

        if (a == 0) {
            solveLinearEquation(reader);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two solutions: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("One double solution: x = " + x);
            } else {
                System.out.println("No real solutions.");
            }
        }
    }
}
