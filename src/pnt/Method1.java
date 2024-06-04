package pnt;

public class Method1 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int sum = num1 + num2;

        System.out.println(sum);
        addSum1();
        addSum2(10,15);
        sqrt(4);
        large(20,10);
        int lnum = returnLargerNumber(10,20);
        int num3 = 200;
        System.out.println("Sub is "+(num3-lnum));
    }
    public static void addSum1(){
        int num1 = 5;
        int num2 = 5;
        int sum = num1 + num2;

        System.out.println(sum);
    }
    public static void addSum2(int num1, int num2){
        int sum = num1 + num2;

        System.out.println(sum);
    }
    public static void sqrt(int num1){
        int sqrt = num1*num1;
        System.out.println(sqrt);
    }
    public static void large(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1+" is larger");
        } else{
            System.out.println(num2+" is larger");
        }
    }
    public static int returnLargerNumber(int num1, int num2) {
        if(num1 > num2){
            return num1;
        } else{
            return num2;
        }
    }
}