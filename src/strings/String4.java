package strings;

public class String4 {
    public static void main(String[] args) {
        // find total number of chars in the countries array
        String[] countries = {"Bangladesh", "India", "Pakistan", "Nepal"};

        int sum = 0;

        for(int i=0; i<countries.length; i++){
            System.out.println(countries[i]);
            sum = sum+ countries[i].length();
        }
        System.out.println(sum);
    }
}