package pnt;

public class IfElse1 {
    public static void main(String[] args) {
        if(6>7) {
            System.out.println("Okay");
        }
        else {
            System.out.println("No");
        }

        int c = 30;
        int d = 70;
        int e = 32;

        if(c>d && c>e){
            System.out.println(c);
        }
        else if (d>c && d>e){
            System.out.println(d);
        }
        else{
            System.out.println(e);
        }

        int grade =95;

        if(grade>100){
            System.out.println("Invalid Grade");
        } else if(grade<0){
            System.out.println("Invalid Grade");
        } else if(grade>=90 && grade<=100){
            System.out.println("Your grade is: A");
        } else if(grade>=80 && grade<=89){
            System.out.println("Your grade is: B");
        } else if(grade>=70 && grade<=79){
            System.out.println("Your grade is: C");
        } else if(grade>=60 && grade<=69){
            System.out.println("Your grade is: D");
        } else if(grade>=0 && grade<=59){
            System.out.println("Your grade is: F");
        }

        int num5 = 20;
        int num6 = 25;

        if(num5>=30 || num6>=30){
            System.out.println("Nice");
        }
        else{
            System.out.println("Not Nice");
        }

        // if salary is more than 10000 print higher salary or else print lower salary
        // salary can not be more than 50000 and less than 3000

        int sal = 3000;

        if(sal<=50000 && sal>=3000) {
            if (sal >= 10000) {
                System.out.println("Higher Salary");
            } else {
                System.out.println("Lower Salary");
            }
        } else {
            System.out.println("Invalid Salary");
        }
    }
}
