package APPS;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
    public void salvarHistoricoMensagem() {
        // Implementação para salvar o histórico de mensagens no MSN Messenger
        System.out.println("Salvando histórico de mensagens do MSN Messenger");
    }
}