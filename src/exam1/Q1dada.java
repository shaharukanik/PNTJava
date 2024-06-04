package exam1;

public class Q1dada {
    public static void main(String[] args) {
        // Write a java method which takes 2 int array parameters and tell if the summation of 2 arrays are equal or not

        int[] numbers1 = {2, 1, 1};
        int[] numbers2 = {3, 4, 7};
        PrintArraySumEqualOrNot(numbers1,numbers2);
    }
    public static void PrintArraySumEqualOrNot(int[] nums1, int[] nums2){
        int sum1 = 0;
        int sum2 = 0;

        for (int i =0; i<nums1.length; i++){
            sum1 = sum1+nums1[i];
        }

        for (int i =0; i<nums2.length; i++){
            sum2 = sum2+nums2[i];
        }

        if (sum1==sum2){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}