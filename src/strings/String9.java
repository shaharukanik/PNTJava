package strings;

public class String9 {
    public static void main(String[] args) {
        // create a method which takes to 2 parameters (String and char)
        // print total number of char present in the string
        totalChar("New York", 'k');
    }
    public static void totalChar(String str, char ch){
        int count = 0;
        for(int i =0; i<str.length() ;i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}