package behavioralPattern.observerPattern;

public class DelListener implements ButtonListener{
    @Override
    public void clickButton() {
        System.out.println("delete");
    }
}
