package strings;

public class String6 {
    public static void main(String[] args) {
        // print the name of the counrty which has the highest length
        String[] countries = {"Bangladesh", "India", "Pakistan", "Nepal"};
        int max = 0;
        int index = 0;
        for(int i=0; i<countries.length; i++){
            if(countries[i].length()>max){
                max=countries[i].length();
                index = i;
            }
        }
        System.out.println(countries[index]);
    }
}