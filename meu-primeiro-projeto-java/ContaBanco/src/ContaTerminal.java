import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Por favor, digite a Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor digite o Número");
            int numero = scanner.nextInt();

            System.out.println("Por favor digite seu nome!");
            String nome = scanner.next();

            int saldo = 150;

            System.out.println("Olá, " + nome +  ".Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ". Sua conta é " + numero + " e seu saldo R$" + saldo + " já está disponível para saque!:)");
        } finally{
            scanner.close();
        }
    }
}
