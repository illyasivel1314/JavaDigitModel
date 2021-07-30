package creationPattern.factoryPattern;

public class AmericanFoodFactory implements FoodFactory {

    @Override
    public void makeFood() {
        System.out.println("这是美国食物");
    }
}
