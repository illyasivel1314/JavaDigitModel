package creationPattern.abstractFactoryPatten;

public class HuaweiFactory implements PhoneFactory{

    @Override
    public PhoneShell makeShell() {
        return new SmallShell();
    }

    @Override
    public PhoneCPU makeCPU() {
        return new SnapDragonCPU();
    }

    @Override
    public PhoneOS makeOS() {
        return new AndroidOS();
    }
}
