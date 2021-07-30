package creationPattern.simpleFactoryPattern;

public class WechatPay implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("微信支付了" + money + "元");
    }
}
