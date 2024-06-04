package pnt;

public class Array1 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        nums[0] = 7;
        nums[1] = 9;
        nums[2] = nums[0]+nums[1];
        System.out.println(nums[4]);
        System.out.println(nums[2]);

        int[] numbers = {2,1,5,7,9,3,6};


        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==1){
                System.out.println(numbers[i]);;
            }
        }
    }
}