package creationPattern.abstractFactoryPatten;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone(new HuaweiFactory());
        phone.showInformation();
    }
}
