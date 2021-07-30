package creationPattern.abstractFactoryPatten;

public class Phone {
    private PhoneShell phoneShell;
    private PhoneCPU phoneCPU;
    private PhoneOS phoneOS;
    public Phone(PhoneFactory phoneFactory){
        this.phoneShell = phoneFactory.makeShell();
        this.phoneCPU = phoneFactory.makeCPU();
        this.phoneOS = phoneFactory.makeOS();
    }
    public void showInformation(){
        System.out.println("手机信息");
        this.phoneShell.showShell();
        this.phoneOS.showOs();
        this.phoneCPU.showCPU();
    }
}
