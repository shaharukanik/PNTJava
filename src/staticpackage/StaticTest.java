package staticpackage;

public class StaticTest {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.setNum1(23);
        System.out.println(staticClass.getNum1());

        StaticClass staticClass1 = new StaticClass();
        staticClass1.setNum1(25);
        System.out.println(staticClass1.getNum1());
        System.out.println(staticClass.getNum1());
    }
}
