public class Main {
    public static void main(String[] args) {
        PaymentManager manager = PaymentManager.getInstance();
        manager.processPayment(100.0);

        PaymentStrategy creditCardStrategy = new CreditCardPaymentStrategy();
        PaymentContext context = new PaymentContext(creditCardStrategy);
        context.executePayment(150.0);

        PaymentFacade facade = new PaymentFacade();
        facade.processPayment(200.0);
        facade.processPayment(250.0, new PayPalPaymentStrategy());
    }
}
