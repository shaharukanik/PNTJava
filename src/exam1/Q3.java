package exam1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Get the starting point and ending point of a loop from the console. Print all the numbers  from the starting and ending point which can be divisible by 3 (you don't need to show more than 5 numbers)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        int num1 = scanner.nextInt();
        System.out.println("Enter ending number");
        int num2 = scanner.nextInt();
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 5) {
                break;
            }
        }
    }
}