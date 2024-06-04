package examprep;

public class Prep1 {
    public static void main(String[] args) {
        int sum = 0;

//        for(int i = 0; i<=100; i++){
//            if(i%2==0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

//        int count = 0;
//        for(int i =1911; i<=2024; i++){
//            if(i%4==0){
//                count++;
//            }
//        }
//        System.out.println(count);


        int[] numb = {2,9,8,6,25,7,5,3,9};

        for(int i=0; i< numb.length; i++){
            sum = sum+numb[i];
            if(sum>50){
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);
    }
}