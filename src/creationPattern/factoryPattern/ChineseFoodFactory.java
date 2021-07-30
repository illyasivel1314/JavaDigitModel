package creationPattern.factoryPattern;

public class ChineseFoodFactory implements FoodFactory {

    @Override
    public void makeFood() {
        System.out.println("这是中国食物");
    }
}
