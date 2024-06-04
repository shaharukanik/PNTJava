package pnt;

public class Method2 {
    public static void main(String[] args) {
//
        int[] num1 = {2,6,9,8,2,3,6,2};
        int[] num2 = {4,6,7,9,3,5};
        lar(num1,num2);
    }
    public static void lar(int[] num1, int[] num2){
        if(num1.length>num2.length){
            System.out.println("First array is larger");
        } else{
            System.out.println("Second array is larger");
        }
    }
}