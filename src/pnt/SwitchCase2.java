package pnt;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        // create a calculator, the inputs(2) will be taken from the console
        // then it will ask which operation I want to perform (1 -> +, 2-> -, 3 -> *, 4 -> /, 5 -> exit)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = scanner.nextInt();
        System.out.println("1 for add, 2 for sub, 3 for multi, 4 for div");
        System.out.println("Enter the operation: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Add: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sub: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multi: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Div: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}