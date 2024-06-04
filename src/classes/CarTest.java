package classes;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "TestCar";
        Toyota toyota = new Toyota();
        toyota.name = "Test";
        //toyota.isReliable = false;
        System.out.println(toyota.isReliable);
        toyota.startEngine();
    }
}
