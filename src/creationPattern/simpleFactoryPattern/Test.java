package creationPattern.simpleFactoryPattern;

public class Test {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payType = paymentFactory.createPayment("AliPay");
        payType.pay(100);

        Payment payment = paymentFactory.createPayment("WechatPay");
        payment.pay(200);
    }
}
