package exemplomensageiros;
import exemplomensageiros.apps.FacebookMessenger;
import exemplomensageiros.apps.MSNMessenger;
import exemplomensageiros.apps.ServicoMensagemInstantanea;
import exemplomensageiros.apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
	
	/*
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fb = new FacebookMessenger();
		System.out.println("Facebook");
		fb.enviarMensagem();
		fb.receberMensagem();
		
		TelegramMessenger tlg = new TelegramMessenger();
		System.out.println("Telegram");
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
	*/
}
