package componentes.iphone;
import java.util.Random;

import componentes.aparelhotelefonico.AparelhoTelefonico;
import componentes.navegadorinternet.NavegadorInternet;
import componentes.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	public void pausar() {
		System.out.println("Música pausada.");
	}
	
	public void selecionarMusica(String nomeMusica) {
		System.out.println("Música " + nomeMusica + " tocando agora...");
	}
	
	private boolean decisao() {
		Random random = new Random();
		return random.nextInt(2) > 0 ? true : false;
	}
	
	public void ligar(String numeroTelefone) {
		boolean atendeu;
		int tentativas = 0;
		
		do
		{
			System.out.println("Ligando para " + numeroTelefone + "...");
			atendeu = decisao();
			tentativas++;
		}
		while (!atendeu && tentativas < 6);
		
		if (atendeu) {
			System.out.println("Parte chamada: Alô? Quem é?...");
		} else {
			iniciarCorreioVoz();
		}
	}
	
	public void atender() {
		System.out.println("Você atendeu o telefone");
		System.out.println("Alô? Quem é?...");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("A pessoa deste número não está disponível no momento, deixe o seu recado após o bip...");
	}
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página do URL " + url + "...");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba criada.");
	}
	
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}
}
