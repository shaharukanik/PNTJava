package pnt;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        int s = scanner.nextInt();
        System.out.println("Enter how many times you want to run the loop");
        int l = scanner.nextInt();

        for(int i=s; i<=l; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}

