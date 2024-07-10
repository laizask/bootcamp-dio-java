class PaymentFacade {
    private PaymentManager paymentManager;
    private PaymentContext paymentContext;

    public PaymentFacade() {
        this.paymentManager = PaymentManager.getInstance();
    }

    public void processPayment(double amount, PaymentStrategy strategy) {
        paymentContext = new PaymentContext(strategy);
        paymentContext.executePayment(amount);
    }

    public void processPayment(double amount) {
        paymentManager.processPayment(amount);
    }
}
