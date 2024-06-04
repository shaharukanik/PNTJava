package pnt;

public class IfElse2 {
    public static void main(String[] args) {
        int i = 5;
        int weekday = 7;


        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(17 % 3); //mod

        // odd or even number
        if (i % 2 == 1) {
            System.out.println(i + " is odd number");
        } else {
            System.out.println(i + " is even number");
        }

        if (i >= 0) {
            System.out.println(i + " is positive number");
        } else {
            System.out.println(i + " is negative number");
        }

        if (weekday == 1) {
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        }
    }
}