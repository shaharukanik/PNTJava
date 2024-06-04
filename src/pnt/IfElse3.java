package pnt;

public class IfElse3 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 10;

        int num3 = (num1>num2) ? num1 : num2;
        System.out.println(num3);

        if(num1>num2){
            num3 = num1;
        } else{
            num3 = num2;
        }
        System.out.println(num3);
    }
}
