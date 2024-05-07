import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try {

          System.out.println("Digite o número da conta bancária!");
          String numeroConta = scanner.nextLine();
          verificarNumeroConta(numeroConta);

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {

            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) { 
    if (numeroConta.length() != 8) {

        throw new IllegalArgumentException("Número de conta inválido. Deve conter exatamente 8 dígitos.");
    }

    System.out.println("Número de conta válido.");
    }
}

