package pnt;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the day of the week");
        int mon = scanner.nextInt();

        if (mon == 1) {
            System.out.println("It is Monday");
        } else if (mon == 2) {
            System.out.println("It is Tuesday");
        } else if (mon == 3) {
            System.out.println("It is Wednesday");
        } else if (mon == 4) {
            System.out.println("It is Thursday");
        } else if (mon == 5) {
            System.out.println("It is Friday");
        } else if (mon == 6) {
            System.out.println("It is Saturday");
        } else if (mon == 7) {
            System.out.println("It is Sunday");
        }
    }
}
