package exam1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Get 2 numbers from the console (program must make sure numbers are within 50 and 100) then tell which number is bigger

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        if(num1>=50 && num1<=100 && num2>50 && num2<100 ){
            if(num1>num2){
                System.out.println(num1+" is bigger");
            }else {
                System.out.println(num2+" is bigger");
            }
        }else{
            System.out.println("Invalid number");
        }
    }
}
