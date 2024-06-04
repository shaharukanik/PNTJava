package pnt;

public class Method3 {
    public static void main(String[] args) {
        int[] numbers1 = {4, 6, 7, 5, 3, 9, 12};
        int[] numbers2 = {3, 6, 9};
        int sum = getSum(numbers2);
        System.out.println(sum);
    }

    public static int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}