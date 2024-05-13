package APPS;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
    public void salvarHistoricoMensagem() {
        // Implementação para salvar o histórico de mensagens no Facebook Messenger
        System.out.println("Salvando histórico de mensagens do Facebook Messenger");
    }
}
