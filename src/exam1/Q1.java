package exam1;

public class Q1 {
    public static void main(String[] args) {
        // Write a java method which takes 2 int array parameters and tell if the summation of 2 arrays are equal or not

        int[] numbers1 = {2, 1, 1};
        int[] numbers2 = {3, 4, 7};
        int sum1 = equal1(numbers1);
        System.out.println(sum1);
        int sum2 = equal2(numbers2);
        System.out.println(sum2);

        if(sum1==sum2){
            System.out.println("Summation are equal");
        } else{
            System.out.println("Summation are not equal");
        }
    }

    public static int equal1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int equal2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}