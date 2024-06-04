package strings;

public class String10 {
    public static void main(String[] args) {
        repeatLastTwoChar("Bangladesh");
    }
    public static void repeatLastTwoChar(String str) {
        String lasttwochar = str.substring(str.length()-2);
        System.out.println(lasttwochar);
    }
}
