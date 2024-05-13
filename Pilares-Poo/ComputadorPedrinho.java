import APPS.FacebookMessenger;
import APPS.Telegram;
import APPS.MSNMessenger;
import APPS.ServicoMensagemInstantanea;
public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        if (smi != null) {
            smi.enviarMensagem();
            smi.receberMensagem();
        } else {
            System.out.println("Aplicativo escolhido não reconhecido.");
        }
    }
}