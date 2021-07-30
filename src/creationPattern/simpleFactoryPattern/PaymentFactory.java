package creationPattern.simpleFactoryPattern;

public class PaymentFactory {
    public Payment createPayment(String type){
        if(type.equals("AliPay"))
            return new AliPay();
        else
            return new WechatPay();
    }
}
