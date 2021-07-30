package creationPattern.abstractFactoryPatten;

public interface PhoneFactory {
    PhoneShell makeShell();
    PhoneCPU makeCPU();
    PhoneOS makeOS();
}
