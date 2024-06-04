package strings;

public class String5 {
    public static void main(String[] args) {
        // find total number of 'a' in the countries array
        String[] countries = {"Bangladesh", "India", "Pakistan", "Nepal"};
        int count = 0;
        for(int i=0; i< countries.length; i++){
            String country = countries[i];
            for(int j=0; j<country.length(); j++){
                if(country.charAt(j)=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}