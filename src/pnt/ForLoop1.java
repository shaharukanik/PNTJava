package pnt;

public class ForLoop1 {
    public static void main(String[] args) {

//        print 1 to 5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello");
//            System.out.println("New York");
//            System.out.println("Value of i is: " + i);
//            System.out.println();
//        }

//        print even numbers for 1 to 10
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        print sum of even number of 1 to 10
//        int sum = 0;
//        for(int i=1; i<=10; i++){
//            if(i%2==0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);

//        // print sum of 1 to 100
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        print sum of 1 to 100 if sum is more than 3000 stop the program also print last value of i
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//            if(sum>3000){
//                System.out.println(i);
//                break;
//            }
//        }
//        System.out.println(sum);

//        it will skip everything after continue
//        for(int i=0; i<=5; i++){
//            if(i==3){
//                continue;
//            }
//            System.out.println(i);
//        }

//        it will skip everything after continue
        for(int i=0; i<=5; i++){
            System.out.println("Hello "+i);
            if(i==3){
                continue;
            }
            System.out.println("End1 "+i);
            System.out.println("End2 "+i);
        }
    }
}