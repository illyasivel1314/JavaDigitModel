package behavioralPattern.observerPattern;

public class Test {
    public static void main(String[] args) {
        MyButton myButton = new MyButton();
        //DelListener listener = new DelListener();
        AddListener listener = new AddListener();
        myButton.setButtonListener(listener);
        myButton.click();

    }
}
