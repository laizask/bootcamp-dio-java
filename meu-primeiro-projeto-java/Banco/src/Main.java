public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}