package creationPattern.simpleFactoryPattern;

public class AliPay implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("支付宝支付了" + money + "元");
    }
}
