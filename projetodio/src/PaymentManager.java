public class PaymentManager {
    private static PaymentManager instance;

    private PaymentManager() {
    }

    public static PaymentManager getInstance() {
        if (instance == null) {
            instance = new PaymentManager();
        }
        return instance;
    }

    public void processPayment(double amount) {
        System.out.println("Processando pagamento de R$" + amount);
        System.out.println("Pagamento processado com sucesso!");
    }
}
