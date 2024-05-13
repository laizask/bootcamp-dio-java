package APPS;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
    public void salvarHistoricoMensagem() {
        // Implementação para salvar o histórico de mensagens no Telegram
        System.out.println("Salvando histórico de mensagens do Telegram");
    }
}
