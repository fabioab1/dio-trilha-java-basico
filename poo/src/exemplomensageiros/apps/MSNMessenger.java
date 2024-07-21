package exemplomensageiros.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens pelo Azure...");
	}
}