package strings;

public class String1 {
    public static void main(String[] args) {
        String name = "Anik";
        System.out.println(name);

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('n'));
        System.out.println(name.replace('A', 'O'));
        System.out.println(name.replaceAll("Anik","Adib"));
        System.out.println(name.replace("ik","yl"));
    }
}