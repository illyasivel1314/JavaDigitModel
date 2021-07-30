package creationPattern.factoryPattern;

public class Test {
    public static void main(String[] args) {
        FoodFactory food1 = new ChineseFoodFactory();
        food1.makeFood();

        FoodFactory food2 = new AmericanFoodFactory();
        food2.makeFood();
    }
}
