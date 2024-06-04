package strings;

public class String7 {
    public static void main(String[] args) {
        // find two strings are equal or not
        String city1 = "New York";
        String city2 = "Florida";

        if(city1.equals(city2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        System.out.println(city1.contains("New"));
        System.out.println(city1.contains("york"));
    }
}