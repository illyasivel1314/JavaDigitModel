package behavioralPattern.observerPattern;

public class MyButton {
    private ButtonListener buttonListener;
    public void click(){
        if (buttonListener!=null) buttonListener.clickButton();
    }

    public void setButtonListener(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
