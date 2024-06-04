package strings;

public class String3 {
    public static void main(String[] args) {
        String str = "Brazil, Argentina, France, Italy";
        String[] countries = str.split(",");

        for(int i=0; i<countries.length; i++){
            System.out.println(countries[i]);
//            System.out.println(countries[i].trim());
        }
    }
}
