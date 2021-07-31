package behavioralPattern.observerPattern;

public class AddListener implements ButtonListener{
    @Override
    public void clickButton() {
        System.out.println("Add");
    }
}
