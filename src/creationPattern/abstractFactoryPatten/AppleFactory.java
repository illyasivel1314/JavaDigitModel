package creationPattern.abstractFactoryPatten;

public class AppleFactory implements PhoneFactory{
    @Override
    public PhoneShell makeShell() {
        return new AppleShell();
    }

    @Override
    public PhoneCPU makeCPU() {
        return new AppleCPU();
    }

    @Override
    public PhoneOS makeOS() {
        return new AppleOS();
    }
}
