package pnt;

public class Array2 {
    public static void main(String[] args) {
        int[] nums = {2,6,9,8,2,3,6,2};
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 2) {
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }
}