package exemplomensageiros.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens na nuvem da Meta...");
	}
}
