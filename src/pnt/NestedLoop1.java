package pnt;

public class NestedLoop1 {
    public static void main(String[] args) {

        for(int i=1; i<5; i++){
            System.out.println("Value of i: "+i);
            for(int j=1; j<4; j++){
                System.out.println("Value of j: "+j);
            }
        }
    }
}