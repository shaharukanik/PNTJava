package classes;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "Yellow";
        fruit.taste = "Sweet";
        fruit.price = 2.99;
        fruit.eatFruit();

        Fruit fruit1 = new Fruit();
        fruit1.name = "Grape";
        fruit1.color = "Green";
        fruit1.taste = "Sour";
        fruit1.price = 2.65;
        fruit1.eatFruit();

        System.out.println(fruit1.name);
    }
}
