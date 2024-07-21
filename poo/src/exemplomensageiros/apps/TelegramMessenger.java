package exemplomensageiros.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens pelo AWS...");
	}
}
