package pnt;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many odd numbers you want to see: ");
        int n = scanner.nextByte();
        int i = 0;
        int count = 0;

        do{
            if(i%2==1){
                System.out.println(i);
                count++;
            }
            i++;
        } while(n!=count);
    }
}