import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
        
        try {
            validarParametros(parametroUm, parametroDois);
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parametro deve ser maior que o primeiro");
        } catch (NumberFormatException e ){
            System.err.println("O numero digitado não é inteiro");
        } finally {
            scanner.close();
        }
        
    }

    static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois ) {
        for (int i = parametroUm; i <= parametroDois;  i++) {
            System.out.println("Imprimindo o número " + i);  
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

    

