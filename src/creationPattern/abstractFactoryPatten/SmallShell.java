package creationPattern.abstractFactoryPatten;

public class SmallShell implements PhoneShell{
    @Override
    public void showShell() {
        System.out.println("普通小手机");
    }
}
