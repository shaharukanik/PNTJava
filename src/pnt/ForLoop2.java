package pnt;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times loop will run");
        int l = scanner.nextInt();

        for(int i=0; i<=l; i++){
            System.out.println("Hello "+i);
        }
    }
}