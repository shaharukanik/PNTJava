package pnt;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
